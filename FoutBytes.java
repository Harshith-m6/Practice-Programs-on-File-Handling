package com.rc.fh;
import java.io.*;
public class FoutBytes {
	public static void main(String[] args) {
		String str = "this is another file to write using fileoutputStream (bytes)";
		String str2 = "writing another line to the same file \n";
		String str3 = "last line written \n";
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\harsh\\OneDrive\\Desktop\\FileHandling\\Practice\\practice4.txt");
			byte[] b = str.getBytes();
			byte[] c = str2.getBytes();
			byte[] d = str3.getBytes();
			fout.write(c);
			fout.write(d);
			fout.write(b);
			fout.flush();
			fout.close();
			
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
