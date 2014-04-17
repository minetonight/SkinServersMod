SkinServers v172.0 for minecraft 1.7.2

Usage:
=====================================
1.6's NEW LAUNCHER:

1) Run the latest launcher and download 1.7.2
2) Go to %appdata%/.minecraft/versions
3) Copy the directory named 1.7.2 and paste as 1.7.2SS(you may name however you please, but everything must match) so there are now two copies.
4) Enter new directory and rename the *.jar and *.json files to match the directory.
5) Open the json file in your prefered Notepad program and change:
"id": "1.7.2",
to
"id": "1.7.2SS",
6) Create or edit profile in the launcher and make sure the version it uses is 1.7.2SS

[ Instructions credit: Risugami (http://www.minecraftforum.net/topic/75440-v162-risugamis-mods-updated/) ]


Now you can follow the known routine:
-------------------------------------------------------
0.1) replace the bkz.class file from my mod in your 1.7.2SS.jar and delete the METAINF folder in 1.7.2SS.jar
0.2) add the 'net' folder from my mod in 1.7.2SS.jar. Make sure that has created the file net\minecraft\client\util\SkinServers.class in the relevant folder.
1) start minecraft after you installed the mod
2) enter a world. (Thanks PabloDons)
3) stop minecraft
4) find the file skinServers.txt in your ".minecraft" folder
5) find the lines "skinServerURL", "capeServerURL" and "forceLowercase" and change them to your liking
6) upload your skin somewhere and make sure it is shown as image when you open "{serverURL}/[yourUsername].png" in your browser
7) the server you play at needs no touch, the skins are client side feature
8) start minecraft with your username and Enjoy

If you have crashreport saying no class found, the problem is most probably that the SkinServerSettings is not in your 1.7.2SS.jar in the folders net, minecraft, client, util.

	hint1: wordpress blog worked great for me as hosting for my skins. But you can't edit the files there once uploaded, the filename cannot be reused with another skin.
	hint2: a wordpress blog does not support case sensitive uploads! The exemplary file myUserName.png is uploaded as {serverURL}/myusername.png. That is why I added the option forceLowercase. For the example above simply change the value of "forceLowercase" to 'true' and voila.



Change log:
* support of minecraft 1.7.2
* support of minecraft 1.6.2
* support of minecraft 1.5.2
* support of minecraft 1.5.1
* support of minecraft 1.5.0
* support of minecraft 1.4.7
+ added versioning and automatic update of the properties file
+ username.toLowercase() is now adjustable 
* support of minecraft 1.3.2
* support of minecraft 1.3.1

Licence:
TERMS AND CONDITIONS
0. USED TERMS
MOD - modification, plugin, a piece of software that interfaces with the Minecraft client to extend, add, change or remove original capabilities.
MOJANG - Mojang AB
OWNER - Scorpion_vn, Original author of the MOD. Under the copyright terms accepted when purchasing Minecraft (http://www.minecraft.net/copyright.jsp) the OWNER has full rights over their MOD despite use of MOJANG code.
USER - End user of the mod, person installing the mod.

1. LIABILITY
THIS MOD IS PROVIDED 'AS IS' WITH NO WARRANTIES, IMPLIED OR OTHERWISE. THE OWNER OF THIS MOD TAKES NO RESPONSIBILITY FOR ANY DAMAGES INCURRED FROM THE USE OF THIS MOD. THIS MOD ALTERS FUNDAMENTAL PARTS OF THE MINECRAFT GAME, PARTS OF MINECRAFT MAY NOT WORK WITH THIS MOD INSTALLED. ALL DAMAGES CAUSED FROM THE USE OR MISUSE OF THIS MOD FALL ON THE USER.

2. USE
Use of this MOD to be installed, manually or automatically, is given to the USER without restriction.

3. REDISTRIBUTION
This MOD may only be distributed where uploaded, mirrored, or otherwise linked to by the OWNER solely. All mirrors of this mod must have advance written permission from the OWNER. ANY attempts to make money off of this MOD (selling, selling modified versions, adfly, sharecash, etc.) are STRICTLY FORBIDDEN, and the OWNER may claim damages or take other action to rectify the situation.

4. DERIVATIVE WORKS/MODIFICATION
This mod is provided freely and may be decompiled and modified for private use, either with a decompiler or a bytecode editor. Public distribution of modified versions of this MOD require advance written permission of the OWNER and may be subject to certain terms.






















Under the hood:
=====================================
defaults URLs:
"http://skins.minecraft.net/MinecraftSkins/"+ username +".png"
"http://skins.minecraft.net/MinecraftCloaks/"+ username +".png"

my Code:
--------
if (skinServerURL equals capeServerURL)
	capeURL = capeServerURL + username.toLowerCaseIfNeeded() + "_cape.png"
else
	capeURL = capeServerURL + username.toLowerCaseIfNeeded() + ".png"

--------
skinURL = skinServerURL + username.toLowerCaseIfNeeded() + ".png"




