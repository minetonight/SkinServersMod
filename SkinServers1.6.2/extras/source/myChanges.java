/*****/
/** in class AbstractClientPlayer*/
/*****/
public static String func_110300_d(String par0Str)
{
	//mod code:
	String serverURL = SkinServersSettings.getInstance().skinServerURL;
    String username = StringUtils.stripControlCodes(par0Str);
    if (SkinServersSettings.getInstance().forceLowercase == true) {
		username = username.toLowerCase();
	}
    String skinUrl = String.format("%s/%s.png", new Object[] {serverURL, username});
    System.out.println("[SkinServers] Player skin - "+skinUrl);

    return skinUrl;
    
	// original code:
    // return String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", new Object[] {StringUtils.stripControlCodes(par0Str)});
}

public static String func_110308_e(String par0Str)
{
	//mod code:
	String skinServerURL = SkinServersSettings.getInstance().skinServerURL;
	String capeServerURL = SkinServersSettings.getInstance().capeServerURL;
    String urlAppendix = ".png";
    if (skinServerURL.equals(capeServerURL)) {
		urlAppendix = "_cape.png";
	}
	String username = StringUtils.stripControlCodes(par0Str);
	if (SkinServersSettings.getInstance().forceLowercase == true) {
		username = username.toLowerCase();
	}
	
	String cloakUrl = String.format("%s/%s%s", new Object[] {capeServerURL, username, urlAppendix});
	System.out.println("[SkinServers] Player cloak - "+cloakUrl);
	
	return cloakUrl;
	
	// original code:
	// return String.format("http://skins.minecraft.net/MinecraftCloaks/%s.png", new Object[] {StringUtils.stripControlCodes(par0Str)});
}
