SkinServers v131.0 for minecraft 1.3.1

Usage:
=====================================
0) replace the .class files from my mod in your minecraft.jar and delete the METAINF folder in mincraft.jar
1) start minecraft after you installed the mod
2) stop minecraft
3) find the file skinServers.txt in your ".minecraft" folder
4) find the lines "skinServerURL", "capeServerURL" and "forceLowercase" and change them to your liking
5) upload your skin somewhere and make sure it is shown as image when you open "serverURL/[yourUsername].png" in your browser
6) the server you play at needs no touch, the skins are client side feature
7) start minecraft with your username and Enjoy


	hint1: wordpress blog worked great for me. But you can't edit the files there once uploaded, the filename cannot be reused with another skin.
	hint2: a wordpress blog does not support case sensitive uploads! The examplary file myUserName.png is uploaded as serverURL/myusername.png. That is why I added the option forceLowercase. For the example above simply change the value of "forceLowercase" to 'true' and you voila.



Change log:
+ added versioning and automatic update of the properties file
+ username.toLowercase() is now adjustable 
* support of minecraft 1.3.2

























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




