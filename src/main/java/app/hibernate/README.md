# This directory was used to reverse engineer hibernate from database schema

This is a good reference: http://omtlab.com/java-hibernate-reverse-engineering-eclipse-tutorial/

Basically you build the connection with cfg file, 
 you use the reveng(reverse engineer) file to explain what columns you want and how to remap if they are odd, 
 then you use the hibernate run on the top of eclipse to build the code.