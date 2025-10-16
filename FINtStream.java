package com.rc.fh;
import java.io.*;
public class FINtStream {
	public static void main(String[] args) {

		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\harsh\\OneDrive\\Desktop\\FileHandling\\F!.txt");

			int i ;
			while((i=fin.read())!=-1)
			{
				System.out.println((char)i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
