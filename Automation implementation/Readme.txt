Description:
using Selenium and TestNG I'm going to write two scripts to automate the login and sign up to facebook.
I'm using POM page object mode, you can run the scripts from the Facebook packge.

========================================================================================

Enviroment Setup:

++windows 10 64bit

++JDK  version: 8 update 202           Location: https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

++Eclipse IDE for Java EE Developers   Location: https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2019-09/R/eclipse-jee-2019-09-R-win32-x86_64.zip&mirror_id=1068

++Selenium version 3.141.59            Location: https://bit.ly/2TlkRyu

++Java for Selenium 3.141.59           Location: https://bit.ly/2zm3ZzF

++Google chrome Driver  

++TestNG              
========================================================================================

Eclipse configuration

1. right click on JRE System Library in the Package explorer panel
2. click on Build Path-->Configure Build Path 
3. Click on the "Add external JARs.." button on the right of the opened window
4. add Client-combined-3.141.59 and Client-combined-3.141.59-sources and selenium-server-standalone-3.141.59


5. change the workspace to be the file downloaded instabug challenge

========================================================================================
to add testNG
1. in eclipse click on help
2. install new software
3. in the work with text field paste: http://beust.com/eclipse/
4. Once you click on "Add", it will display the screen, Enter the Name as: TestNG
5. After clicking on "OK", it will scan and display the software available with the URL which you have mentioned.
6. Now select the checkbox at TestNG and Click on "Next" button.
7. click Next
8. Accept the terms of the license agreement
9. click finish
10. it will ask you to restart the IDE click ok and let it restart
11. add TestNG to the libraries
========================================================================================

Facebook special account created for testing 
email: mahmoud_ynfssta_challenge@tfbnw.net
Password:mahmoudomarinstabug


========================================================================================

Steps to run the automation script
1.click on login.java
2.right click --> run as --> TestNG test
