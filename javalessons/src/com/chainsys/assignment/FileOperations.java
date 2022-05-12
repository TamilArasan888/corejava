package com.chainsys.assignment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileNotFoundException;




public class FileOperations {
 
	public static void main(String args[]) throws Exception
	{
		createNewFile();
//		renameFile();
//		appendDataToFile();
//		modifyDataInFile();
//		readDataFromFile();
//		deleteFile();
//		copyFile();
//		moveFile();
		
	}
		
	public static void createNewFile()
	{
		
		try {
		      File myObj = new File("D:\\Assignment\\newfile.txt");
		      
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } 
		      else {
		        System.out.println("File already exists.");
		      }
		    } 
		catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
	
	public static void renameFile()
	{
		
		 File oldfile = new File("D:\\Assignment\\demofile.txt");
	     File newfile = new File("D:\\Assignment\\rename.txt");

	      if(oldfile.renameTo(newfile)) 
	      {
	         System.out.println("File name changed(Rename) successfully");
	      } else 
	      {
	         System.out.println("Rename failed");
	      } 
	}
	
	
	public static void appendDataToFile()
	{
		String path = "D:\\Assignment\\append.txt";
        String text = "Hello , data is added.";

        try {
            FileWriter fw = new FileWriter(path, true);
            fw.append(text);
            fw.close();
            System.out.println("Data inserted(append) Successfully!!");
        }
        catch(IOException e) {
        	System.out.println("Error occured!!");
        }
		
	}
	
	
	public static void modifyDataInFile() throws Exception
	{
		
		FileOutputStream file = new FileOutputStream("D:\\Assignment\\demofile.txt");
        
        String modify = "Data is modified!!!";
        byte[] b = modify.getBytes();
        file.write(b);
        file.close();
        System.out.println("Modification Complete");
        
        FileInputStream file1 = new FileInputStream("D:\\Assignment\\demofile.txt");
        int i;
        while((i=file1.read())!=-1)
        {
        System.out.print((char)i);
        }
        file1.close();
	}
	
	
	public static void readDataFromFile()
	{
		 FileReader fr = null;
		 
		try {
			fr = new FileReader("D:\\Assignment\\filename.txt");
			System.out.println("File is found!!");
			
		} 
		catch (FileNotFoundException e) {
			
			System.out.println("File is not found!!");
			e.printStackTrace();
		}
		
		int i;
		try {
			while ((i = fr.read()) != -1)
			System.out.print((char)i);
			System.out.println("\n Data in file was readed successfully!!");
		} catch (IOException e) {
			System.out.println("Data not read!!");
			e.printStackTrace();
		}
	}
	
	
	public static void deleteFile()
	{
		 File file= new File("D:\\Assignment\\delete.txt");

     if (file.delete()) {
         System.out.println("File deleted successfully");
     }
     else {
         System.out.println("Failed to delete the file");
     }
	}
	
	
	public static void copyFile()
	{
		
		FileInputStream instream = null;
		FileOutputStream outstream = null;
		try{
    	    File infile =new File("D:\\Assignment\\demofile.txt");
    	    File outfile =new File("D:\\Assignment\\copyfile.txt");
 
    	    instream = new FileInputStream(infile);
    	    outstream = new FileOutputStream(outfile);
 
    	    byte[] buffer = new byte[1024];
    	    int length;
    	    
    	    while ((length = instream.read(buffer)) > 0)
    	    {
    	    	outstream.write(buffer, 0, length);
    	    }
    	    
    	    instream.close();
    	    outstream.close();
    	    System.out.println("File copied successfully!!");
    	    }
		catch(IOException ioe){
    		ioe.printStackTrace();
    	 }
	}
	
	
	public static void moveFile()
	{
		
		String src = "D:\\Assignment\\movefrom.txt";
        String dest = "D:\\Assignment\\moveto.txt";
        Path tmp;
		try {
			tmp = Files.move(Paths.get(src), Paths.get(dest));
			if(tmp != null) 
	        { 
	            System.out.println("File successfully moved"); 
		} 
			}
		
		catch (IOException e) {
			System.out.println("Unable to move the file"); 
			e.printStackTrace();
		} 
  
       
  }
	
	
}
