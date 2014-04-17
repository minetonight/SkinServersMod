/*****/
/** in class EntityOtherPlayerMP*/
/*****/

	public EntityOtherPlayerMP(World par1World, String par2Str)
    {
        super(par1World);
        this.username = par2Str;
        this.yOffset = 0.0F;
        this.stepHeight = 0.0F;

        if (par2Str != null && par2Str.length() > 0)
        {
        	//mod code:
        	String serverURL = SkinServersSettings.getInstance().skinServerURL;
            String username = StringUtils.stripControlCodes(par2Str);
            if (SkinServersSettings.getInstance().forceLowercase == true) {
				username = username.toLowerCase();
			}
			skinUrl = (new StringBuilder()).append(serverURL).append(username).append(".png").toString();
            System.out.println("OtherPlayer skin - "+skinUrl);
            
        	// original code:
            //this.skinUrl = "http://skins.minecraft.net/MinecraftSkins/" + StringUtils.stripControlCodes(par2Str) + ".png";
        }

        this.noClip = true;
        this.field_71082_cx = 0.25F;
        this.renderDistanceWeight = 10.0D;
    }


public void updateCloak()
    {
    	//mod code:
    	String skinServerURL = SkinServersSettings.getInstance().skinServerURL;
    	String capeServerURL = SkinServersSettings.getInstance().capeServerURL;
        String ulrAppendix = ".png";
        if (skinServerURL.equals(capeServerURL)) {
			ulrAppendix = "_cape.png";
		}
		String username = StringUtils.stripControlCodes(this.username);
		if (SkinServersSettings.getInstance().forceLowercase == true) {
			username = username.toLowerCase();
		}
		this.playerCloakUrl = (new StringBuilder()).append(capeServerURL).append(username).append(ulrAppendix).toString();
        this.cloakUrl = this.playerCloakUrl;
        System.out.println("OtherPlayer cloak - "+cloakUrl);
        
        //original code:
    	//this.playerCloakUrl = "http://skins.minecraft.net/MinecraftCloaks/" + StringUtils.stripControlCodes(this.username) + ".png";
        //this.cloakUrl = this.playerCloakUrl;
    }


/*****/
/** in class EntityPlayerSP*/
/*****/

	    public EntityPlayerSP(Minecraft par1Minecraft, World par2World, Session par3Session, int par4)
    {
        super(par2World);
        this.mc = par1Minecraft;
        this.dimension = par4;

        if (par3Session != null && par3Session.username != null && par3Session.username.length() > 0)
        {
        	//mod code:
        	String serverURL = SkinServersSettings.getInstance().skinServerURL;
            String username = StringUtils.stripControlCodes(par3Session.username);
            if (SkinServersSettings.getInstance().forceLowercase == true) {
				username = username.toLowerCase();
			}
			this.skinUrl = (new StringBuilder()).append(serverURL).append(username).append(".png").toString();
        	System.out.println("Player skin - "+skinUrl);
        	
        	//original code: 
            //this.skinUrl = "http://skins.minecraft.net/MinecraftSkins/" + StringUtils.stripControlCodes(par3Session.username) + ".png";
        }

        this.username = par3Session.username;
    }

    public void updateCloak()
    {
    	//mod code:
    	String skinServerURL = SkinServersSettings.getInstance().skinServerURL;
    	String capeServerURL = SkinServersSettings.getInstance().capeServerURL;
        String ulrAppendix = ".png";
        if (skinServerURL.equals(capeServerURL)) {
			ulrAppendix = "_cape.png";
		}
		String username = StringUtils.stripControlCodes(this.username);
		if (SkinServersSettings.getInstance().forceLowercase == true) {
			username = username.toLowerCase();
		}
		this.playerCloakUrl = (new StringBuilder()).append(capeServerURL).append(username).append(ulrAppendix).toString();
        this.cloakUrl = this.playerCloakUrl;
        System.out.println("Player cloak - "+cloakUrl);
        
    	//original code:
        //this.playerCloakUrl = "http://skins.minecraft.net/MinecraftCloaks/" + StringUtils.stripControlCodes(this.username) + ".png";
        //this.cloakUrl = this.playerCloakUrl;
    }




