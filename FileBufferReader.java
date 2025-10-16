package com.rc.fh;
import java.io.*;
public class FileBufferReader {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\harsh\\OneDrive\\Desktop\\FileHandling\\Harshith.txt"));
			String line ;
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
		}catch(IOException e) {
			
		}
	}

}
