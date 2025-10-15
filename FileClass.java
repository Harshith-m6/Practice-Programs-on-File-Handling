package com.rc.fh;

import java.io.*;
public class FileClass {
	public static void main(String[] args) throws Exception {
		// file class is just the abstract representation od the file , only deletion and creation of folders and files can be possible , no read and write happens
		File f = new File("C:\\Users\\harsh\\OneDrive\\Desktop\\FileHandling\\names.txt");
		//methods on file 
		System.out.println(f.exists());
		System.out.println(f.createNewFile());
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.delete());
		System.out.println(f.exists());
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParent());
		
		//check wheather given path is of file or directory
		File e = new File("C:\\Users\\harsh\\OneDrive\\Desktop\\javaNotes");
		System.out.println(e.isFile());
		System.out.println(e.isDirectory());
		//lists the files present in the folder
		 File[] names = e.listFiles();
		 for(File name : names)
		 {
			 System.out.println(name);
		 }
		 
		 //creates a new folder in the specified folder
		 File g = new File("C:\\Users\\harsh\\OneDrive\\Desktop\\javaNotes\\harshith"); 
		 System.out.println(g.mkdir());
		 System.out.println(g.mkdirs());
		 
		
	}

}