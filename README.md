# File Handling In Java

File handling is a critical aspect of any programming language.

File handling refers to manipulating files and directories on the file system. This article will provide an overview of file handling in Java.

```
java.io.File Class
```
The File class in Java is the primary way to handle files and directories. It is part of the java.io package, which is used for input and output operations.

**The File class has two constructors:**\
1️⃣ One that takes a String representing the file path\
2️⃣ Another File object representing the file path


This program will display all the contents of a given file on the console .
```
import java.io.*; 
public class ReadFileExample
{ 
  public static void main(String args[])
  { 
    try{
    File file = new File("C:\\Users\\masai\\Desktop\\test.txt");
      FileReader fr=new FileReader(file);
      BufferedReader br = new BufferedReader(fr);
          String s=null;
          while ((s = br.readLine()) != null)
          System.out.println(s);
         }

     catch(Exception ex)

   {

   System.out.println(“Exception=”+ex);

   }
 }
 }
 ```
 
