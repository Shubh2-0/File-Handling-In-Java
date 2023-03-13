# File Handling In Java

File handling is a critical aspect of any programming language.

<img src="https://user-images.githubusercontent.com/112773220/224777158-8cae1ff0-2d27-4875-9a49-01bd963b28e1.png" />

File handling refers to manipulating files and directories on the file system. This article will provide an overview of file handling in Java.
```
java.io.File Class
```

<img src="https://user-images.githubusercontent.com/112773220/224777525-f2703db5-93e4-4582-b631-e67cd730867e.png"/>

The File class in Java is the primary way to handle files and directories. It is part of the java.io package, which is used for input and output operations.

**The File class has two constructors:**\
1️⃣ One that takes a String representing the file path\
2️⃣ Another File object representing the file path


# This program will display all the contents of a given file on the console .
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
# Java program to write the contents into a file :
```
import java.io.*;
class FileWriterDemo
{ 
    public static void main(String[] args) throws IOException 
    { 
        
        
        try{
           File file = new File("C:\\Users\\sharp\\Desktop\\out.txt"); //file being created if it does not exist.     
           FileWriter fw=new FileWriter(file); 
           fw.write("Content to be written"); 
           fw.close(); 
		   System.out.println("File written"); 
		   }
		   catch(Exception ex)
		   {
		   System.out.println("Exception is"+ex);
		   }
		   
    } 
    ```
}
