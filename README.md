
# File Handling in Java

📁 A repository showcasing various file handling operations in Java.

## Overview

This repository provides examples and code snippets for performing file handling operations in Java. File handling is an essential aspect of many Java applications, allowing you to read, write, copy, and manipulate files on the local file system.

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

## Contents

The repository includes the following file handling concepts:

1. 📥 BufferedInputStream: Demonstrates how to efficiently read data from a file using a buffered input stream.
2. 📤 BufferedWriter: Shows how to write data to a file using a buffered writer.
3. 📁 FileOperations: Provides various file operations, such as checking file existence, creating a new file, deleting a file, etc.
4. 📄 FileContentCopy: Illustrates how to copy the contents of one file to another.
5. 📄 FileMethods: Demonstrates different methods available for working with files, such as getting file size, file last modified timestamp, etc.
6. 📖 FileReading: Shows how to read the contents of a file using various techniques, including FileReader, FileInputStream, etc.
7. 🔄 FileRenaming: Provides examples of renaming files in Java.
8. ✍️ FileWriting: Illustrates how to write content to a file using different methods, such as FileWriter, FileOutputStream, etc.
9. 📝 ProgramForCreatingFile: Contains a sample program that creates a new file with predefined content.

## Getting Started

To explore the examples and run the code in this repository, follow these steps:

1. Clone the repository to your local machine using the following command:

   ```bash
   git clone https://github.com/Shubh2-0/File-Handling-In-Java.git
   ```

2. Open the cloned directory in your preferred Java IDE.

3. Navigate to the specific file or example you want to explore.

4. Compile and run the Java code to see the file handling operations in action.

## Contributing

🌟 Star this repository if you find it helpful!

---

🔗 [GitHub Repository](https://github.com/Shubh2-0/File-Handling-In-Java.git)

