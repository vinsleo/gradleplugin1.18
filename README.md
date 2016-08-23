# gradleplugin1.18

The structure of the project is referenced from:
https://rominirani.com/gradle-tutorial-part-3-multiple-java-projects-5b1c4d1fbd8d#.dab2exh3v
Thank you Romin


The purpose of this project is use buildship eclipse plugin version 1.18 and get some clarity on the classpath genration. It seems like a bug but may not be. Just wanted to understand 

Steps to reproduce 
1. Import project in eclipse using buldship plugin
2. run CommonTest.java - no ClassNotFound exception
3. run AppTest.java - ClassNotFoundException thrown

App depends on Common, hence understanding is the AppTest should be able to see the class CommonTest can see.

