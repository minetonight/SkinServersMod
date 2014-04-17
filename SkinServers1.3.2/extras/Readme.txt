SkinServers v132.0 for minecraft 1.3.2

Usage:
=====================================
0) replace the .class files from my mod in your minecraft.jar and delete the METAINF folder in mincraft.jar
1) start minecraft after you installed the mod
2) stop minecraft
3) find the file skinServers.txt in your ".minecraft" folder
4) find the lines "skinServerURL", "capeServerURL" and "forceLowercase" and change them to your liking
5) upload your skin somewhere and make sure it is shown as image when you open "{serverURL}/[yourUsername].png" in your browser
6) the server you play at needs no touch, the skins are client side feature
7) start minecraft with your username and Enjoy


	hint1: wordpress blog worked great for me as hosting for my skins. But you can't edit the files there once uploaded, the filename cannot be reused with another skin.
	hint2: a wordpress blog does not support case sensitive uploads! The exemplary file myUserName.png is uploaded as {serverURL}/myusername.png. That is why I added the option forceLowercase. For the example above simply change the value of "forceLowercase" to 'true' and voila.



Change log:
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




