package net.minecraft.src;

import java.io.*;

import org.lwjgl.input.Keyboard;

public class SkinServersSettings
{

    private File optionsFile;
    /** SkinServers mod*/
    private float version = 162.0f;
    public String skinServerURL;
    public String capeServerURL;
    public boolean forceLowercase;
    private static SkinServersSettings instance;

    private SkinServersSettings()
    {
        skinServerURL = "http://skins.minecraft.net/MinecraftSkins/";
        capeServerURL = "http://skins.minecraft.net/MinecraftCloaks/";
        forceLowercase = false;
        
        File folder = Minecraft.getMinecraft().mcDataDir;
        System.out.println("[SkinServers] mcDataDir = " + folder);
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
     * Loads the options from the skinServers.txt file. 
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
            float fileVersion = 1.0f;

            for (String line = ""; (line = bufferedreader.readLine()) != null;)
            {
                try
                {
                    String as[] = line.split("=");

                    if (as[0].equals("# version"))
                    {
						try {
							fileVersion = Float.parseFloat(as[1]);
							System.out.println("loaded fileVersion="+fileVersion);
						} catch (NumberFormatException nfe) {
							System.err.println("error parsing float fileVersion="+as[1]);
						}
                    }
                    else if (as[0].equals("skinServerURL"))
                    {
                    	skinServerURL = as[1];
                    	System.out.println("skinServerURL="+skinServerURL);
                    }
                    else if (as[0].equals("capeServerURL"))
                    {
                    	capeServerURL = as[1];
                    	System.out.println("capeServerURL="+capeServerURL);
                    }
                    else if (as[0].equals("forceLowercase"))
                    {
                    	forceLowercase = Boolean.parseBoolean(as[1]);
                    	System.out.println("forceLowercase="+forceLowercase);
                    }
                }
                catch (Exception exception1)
                {
                    System.err.println((new StringBuilder()).append("Skipping bad option: ").append(line).toString());
                }
            }

            bufferedreader.close();
            
            if(fileVersion < this.version) {
            	System.out.println("Old skinServers file detected! Updating!");
            	//forceUpdate
            	saveOptions();
            }
        }
        catch (Exception exception)
        {
            System.err.println("Failed to load skinServers");
            exception.printStackTrace();
        }
        
    }//eof loadOptions

    /**
     * Saves the options to the skinservers.txt file.
     */
    public void saveOptions()
    {
        try
        {
        	//open and clear(!) old content of the file
            PrintWriter printwriter = new PrintWriter(new FileWriter(optionsFile));
            printwriter.println((new StringBuilder()).append("# version=").append(version).toString());
            printwriter.println((new StringBuilder()).append("skinServerURL=").append(skinServerURL).toString());
            printwriter.println((new StringBuilder()).append("capeServerURL=").append(capeServerURL).toString());
            printwriter.println();
            printwriter.println("# Change next line to 'true' if your server does not support capital letters (wordpress.com doesn't). Default value is 'false'");
            printwriter.println((new StringBuilder()).append("forceLowercase=").append(forceLowercase).toString());
            printwriter.close();
        }
        catch (Exception exception)
        {
            System.err.println("Failed to save options");
            exception.printStackTrace();
        }
    }
}
