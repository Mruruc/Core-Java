package Java_File_handling;

import java.io.*;
import java.util.Scanner;

public class CreateFile {

    public static void main(String[] args) throws IOException {
        // we can create directory with .mkdir() method;
        // Firstly we should creat File class;
        // in constructor of file class we have to specify path of our directory;
        String path="C:\\Users\\maho\\Desktop\\Java.Folder";
        File directory=new File(path);
        directory.mkdir();
        // and is created and is it directory we can use  isDirectory() method;
        System.out.println(directory.isDirectory());
        //to create some file inside our directory;
        // again we can use file class but also there are several ways to create a file in Java:
        //1) using File class the most common way;
        // with createNewFile() method;
        File file = new File("C:\\Users\\maho\\Desktop\\Java.Folder\\File1.txt");
        file.createNewFile();
        // to ensure that file is created or no we can use .exists() method it returns true if file exist;
        if(file.exists()){
            System.out.println("File is created:");
        }
        else{
            System.out.println("File is not created: ");
        }
        // second way is using the FileOutputStream class:
        FileOutputStream fos = new FileOutputStream("C:\\Users\\maho\\Desktop\\Java.Folder\\File2.txt");
        fos.close();
        //third way is Using the FileWriter class:
        FileWriter wrt=new FileWriter("C:\\Users\\maho\\Desktop\\Java.Folder\\File3.txt");
        wrt.close();
    }
}

  class WriteToFile{

   public static void main(String[] args) throws IOException{
       //there are several ways to write to a file in Java:
        //1) using FileWriter class:
        // to do this we need file writer class object and write() method;
        String firstFile="C:\\Users\\maho\\Desktop\\Java.Folder\\File1.txt";
        // we passed firstFile path as argument;
        FileWriter writer= new FileWriter(firstFile);
        //write() method we should be carefull beacuse if we try to write on exist file with write() method
       // we will override;
        writer.write("I am writing on first file with java and\nwith FileWriter class.");
        /*// if we do not want override from the beginning we can use append() method and
       // you can pass true as the second argument to the FileWriter constructor;
        writer.append("testing append method");*/
        //should not forget to close if we don't want memory leaking;
        writer.close();


        //2)Using the FileOutputStream class:
       // we create a file for working on it;
        File file=new File("Java.txt");
        try{
            file.createNewFile();
            if(file.exists()){
                System.out.println("File is created");
            }else{
                System.out.println("File did'not creat");
            }
        }
        catch(IOException e){
            System.out.println(e.toString());
        }
        // writing a file with FileOutputStream class;
        // we can use this class to write data on a file in form of Bytes;
        FileOutputStream fos=null;
        String str="I am writing a file in form of byte !\n woahhh :))";
        try{
             fos=new FileOutputStream(file);
             byte[] array=str.getBytes();
             fos.write(array);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            fos.close();
            System.out.println("Fos is closed !");
        }
        // if we do not want to overwrite we can use append method;
        FileOutputStream fos2=new FileOutputStream(file,true);
        String addingFile=" \n I write at the end of file with append() method;\nwoohah!";
        byte[] arr=addingFile.getBytes();
        fos2.write(arr);
        fos2.close();
       
        //3)Using the BufferedWriter class:
        //4)Using the PrintWriter class:

    }
}

 class ReadFile {
    public static void main(String[] args) throws IOException {
        //There are a several way to read file in java;
        //1) using scanner class and nextLine method with this way we will read line by line;
        File file=new File("C:\\Users\\maho\\Desktop\\Java.Folder\\File1.txt");
        // to check that file exists or no we can use exists() method;
        System.out.println(file.exists());
        Scanner scan=new Scanner(file);
        while(scan.hasNext()){
            System.out.println(scan.nextLine());
        }
        scan.close();

        //2) using FileReader class and read method;
        //The read() method: reads the next character from the file and returns its integer representation,
        // as an int value.
        // If the end of the file has been reached, the method returns -1.
        // The method reads the file one character at a time,
        // so it's useful for reading files character-by-character,
        System.out.println("=================reading file with FileReader class==========");
        FileReader reader=new FileReader("C:\\Users\\maho\\Desktop\\Java.Folder\\File1.txt");
        int data=reader.read();
        while(data !=-1){
            System.out.print((char)data);
            data=reader.read();
        }
        reader.close();

        //3)Using the FileInputStream class;
         ///reading a file with  FileInputStream class in form of byte;
        FileInputStream fis=new FileInputStream(file);
        System.out.println((char)fis.read()); // its read just one byte which is first letter I in our file.
        // to read whole file we can use while loop;
        int i;
        while((i=fis.read()) != -1){
            System.out.print((char)i);
        }

        fis.close();
        
        
        //4)Using the BufferedReader classes;
         //// Create a FileReader object to read the file in form of raw byte;
        FileReader file=new FileReader("Java.txt");
       //// Create a BufferedReader object to read the file in form of line;
        BufferedReader bf=new BufferedReader(file);
        //System.out.println(bf.readLine()); // it will read first line
        // to read whole file we can use readLine method;
        String str=bf.readLine();
        while(str !=null){
            System.out.println(str);
            str=bf.readLine();
        }
        // Close the BufferedReader object and file ;
        bf.close();
        file.close();
    }
 }


class GetFileInfo {
    public static void main(String[] args) throws IOException {
        // Methods in File class;
        //1) isDirectory() methods to check is a directory or no:
        File directory = new File("C:\\Users\\maho\\Desktop\\Java.Folder");
        System.out.println(directory.isDirectory() ? "It is a directory!" : "It is not a directory.");
        //2) to list file inside directory we can use list() or listFiles();
        String[] listOfFile=directory.list();
        for (String str: listOfFile) {
            System.out.println(str);
        }
        System.out.println("=========================");
        // listFiles(); return type is object of files;
        File[] fileObject=directory.listFiles();
        for (int i = 0; i < fileObject.length; i++) {
            System.out.println(fileObject[i]);
        }

        //Exist() method;
        File file1 = new File("C:\\Users\\maho\\Desktop\\Java.Folder\\File1.txt");
         System.out.println(
                file1.exists()?"File1 is exist":"File1 is not exist"
        );

        // isFile() method;
        System.out.println(
                file1.isFile()?"File1 is a file":"File1 is not a file"
        );

        //getName() method;
        System.out.println("File name is :" + file1.getName());

        //getPath(); and getAbsolutePath(); getPath() returns the original path as passed to the constructor,
        // whereas getAbsolutePath() always returns the full path from the root of the file system,
        // regardless of whether it was originally passed as a relative or an absolute path.
        System.out.println(file1.getPath());
        System.out.println(file1.getAbsolutePath());

        //getParent() and getParentFile(); getParent() returns the parent directory's path as a string,
        // whereas getParentFile() returns the parent directory as a File object.;
        System.out.println(file1.getParent());
        System.out.println(file1.getParentFile());

        //getFreeSpace() It returns the number of unallocated bytes in the partition or disk that the file or
        // directory represented by the File object is on.
        // The value returned is a long representing the number of bytes available.
        System.out.println(file1.getFreeSpace());

        // To compare files equals();
        File tempFile=new File("C:\\Users\\maho\\Desktop\\Java.Folder\\Temp.html");
        tempFile.createNewFile();
        boolean bool=file1.equals(tempFile);
        System.out.println(bool);


         // isHidden() to check a file is hidden or no;
         System.out.println(file1.isHidden());

        //length()  method returns the number of bytes in the file represented by the File object.
        // The value returned is a long, which represents the size of the file in bytes
        System.out.println("The length of file1 is :"+file1.length());

        //renameTo() to rename file or directory and also can be used for moving file (location).
         File newFileName= new File("C:\\Users\\maho\\Desktop\\Java.Folder\\Temp2.html");
        boolean check=tempFile.renameTo(newFileName);
        if(check){
            System.out.println("Renamed successful ! ");
        }
        else{
            System.out.println("Renamed Failed");}
        //set newLocation;
        File newLocation=new File("C:\\Users\\maho\\Desktop\\Temp6.html");
        System.out.println(
                newFileName.renameTo(newLocation) ? "Relocation is successful" : "Failed"
        );

        //delete() to delete file or directory;
         File temp=new File("C:\\Users\\maho\\Desktop\\Java.Folder\\Temp.html");
        temp.delete();

        //toString()
        System.out.println(file1.toString());

        //toURI
        System.out.println(file1.toURI());

        //canExecute()
        System.out.println( file1.canExecute());

        //canRead();
        System.out.println(file1.canRead());

        //canWrite();
        System.out.println(file1.canWrite());

        //setReadOnly();
        //System.out.println(file1.setReadOnly());

        //setWritable();
        System.out.println(file1.setWritable(true));

          //append() method; if we do not want override from the beginning we can use append() method and
                // you can pass true as the second argument to the FileWriter constructor;
        FileWriter writer=new FileWriter("C:\\Users\\maho\\Desktop\\Java.Folder\\File2.txt",true);
             // writer.write("This is my second file,\n i created with java.");
               writer.append("\nTesting append method");
               writer.close();
        //setExecutable();
        file1.setExecutable(true);

        //setReadable();
        //file1.setReadable(true);
        file1.setReadable(true, false);


    }
}
