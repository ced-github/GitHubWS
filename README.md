GitHubWS
========

[cxf] tomee Error deploying CXF webservice

The aim of this project is to reproduce a problem which is discribre in "cxf-dev" on http://cxf.547215.n5.nabble.com/cxf-tomee-Error-deploying-CXF-webservice-td5729652.html

1. On your PC, you have to install TomEE 1.5.2 and cxf 2.7.4
2. In Eclipse or NetBeans, you can create a "Dynamic Web Project" whose the name is "GitHubWS". In the option "Target Runtime" select "TomEE" and in the option "Dynamic web module version" choose "2.5"
3. In the directory .../Java Resources/src/... you create a java class how the file GitHubWS.java
4. Create a Web Service with cxf since context menu and next choose the option "Create and SEI" (SEI -> Service Endpoint Interface). At the end of this process, you must have a SEI file how the file GitHubWSSEI.java
5. Start the server and you should see an error in the console how describe above.
