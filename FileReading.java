package com.rc.fh;
import java.io.*;
public class FileReading {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\harsh\\OneDrive\\Desktop\\FileHandling\\Harshith.txt");
			int a ;
			while((a=fis.read())!=-1)
			{
				System.out.print((char)a);
			}
			fis.close();
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
