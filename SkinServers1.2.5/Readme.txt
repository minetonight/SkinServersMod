Usage:
=====================================
0) replace the .class files from my mod in your minecraft.jar and delete the METAINF folder in mincraft.jar
1) start minecraft after you installed the mod
2) stop minecraft
3) find the file skinServers.txt in your ".minecraft" folder
4) find the lines "skinServerURL" and "capeServerURL" and change them to your liking
5) upload your skin somewhere and make sure it is shown as image when you open "serverURL/[username].png" in your browser
	hint: wordpress blog worked great for me. But you can't edit the files there once uploaded, the filename cannot be reused with another skin.
6) start minecraft with that username and Enjoy





























Under the hood:
=====================================
defaults URLs:
"http://s3.amazonaws.com/MinecraftSkins/"+ username.toLowerCase() +".png"
"http://s3.amazonaws.com/MinecraftCloaks/"+ username.toLowerCase() +".png"

my Code:
--------
if (skinServerURL equals capeServerURL)
	capeURL = capeServerURL + username.toLowerCase() + "_cape.png"
else
	capeURL = capeServerURL + username.toLowerCase() + ".png"

--------
skinURL = skinServerURL + username.toLowerCase() + ".png"




