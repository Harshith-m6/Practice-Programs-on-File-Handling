package com.rc.fh;
import java.io.*;
public class FileBytes {
	public static void main(String[] args) {
		String str = "wirting data using file fileOutputStream";
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\harsh\\OneDrive\\Desktop\\FileHandling\\Practice\\practice3.txt");
			fout.write(str.getBytes());
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
