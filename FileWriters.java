package com.rc.fh;
import java.io.*;
public class FileWriters {
	public static void main(String[] args) throws Exception{
		File f = new File("C:\\Users\\harsh\\OneDrive\\Desktop\\FileHandling\\Practice");
		System.out.println(f.mkdir());
		FileWriter fw = new FileWriter("C:\\Users\\harsh\\OneDrive\\Desktop\\FileHandling\\Practice\\practice.txt");
		String str = "harshith \n";
		fw.write(str);
		String str1 = "pavan \n";
		fw.write(str1);
		String str3 = "its new file with the data";
		fw.write(str3);
		fw.close();
		
	}

}
