package net.minecraft.src;

import java.io.*;

import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class SkinServersSettings
{

    private File optionsFile;
    /** SkinServers mod*/
    public String skinServerURL;
    public String capeServerURL;
    private static SkinServersSettings instance;

    private SkinServersSettings()
    {
        skinServerURL = "http://s3.amazonaws.com/MinecraftSkins/";
        capeServerURL = "http://s3.amazonaws.com/MinecraftCloaks/";
        File folder = Minecraft.getMinecraftDir();
        optionsFile = new File(folder, "skinServers.txt");
        loadOptions();
    }
    
    public static SkinServersSettings getInstance() {
		if (instance == null) {
			instance = new SkinServersSettings();
		}
		return instance;
	}

    /**
     * Loads the options from the options file. It appears that this has replaced the previous 'loadOptions'
     */
    public void loadOptions()
    {
        try
        {
            if (!optionsFile.exists())
            {
            	saveOptions();
                return;
            }

            BufferedReader bufferedreader = new BufferedReader(new FileReader(optionsFile));

            for (String s = ""; (s = bufferedreader.readLine()) != null;)
            {
                try
                {
                    String as[] = s.split("=");

                    if (as[0].equals("skinServerURL"))
                    {
                    	skinServerURL = as[1];
                    	System.out.println("skinServerURL="+skinServerURL);
                    }
                    if (as[0].equals("capeServerURL"))
                    {
                    	capeServerURL = as[1];
                    	System.out.println("capeServerURL="+capeServerURL);
                    }
                }
                catch (Exception exception1)
                {
                    System.out.println((new StringBuilder()).append("Skipping bad option: ").append(s).toString());
                }
            }

            bufferedreader.close();
        }
        catch (Exception exception)
        {
            System.out.println("Failed to load skinServers");
            exception.printStackTrace();
        }
    }

    /**
     * Saves the options to the options file.
     */
    public void saveOptions()
    {
        try
        {
            PrintWriter printwriter = new PrintWriter(new FileWriter(optionsFile));
            printwriter.println((new StringBuilder()).append("skinServerURL=").append(skinServerURL).toString());
            printwriter.println((new StringBuilder()).append("capeServerURL=").append(capeServerURL).toString());

            printwriter.close();
        }
        catch (Exception exception)
        {
            System.out.println("Failed to save options");
            exception.printStackTrace();
        }
    }
}
