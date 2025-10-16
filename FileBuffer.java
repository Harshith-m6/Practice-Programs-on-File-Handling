package com.rc.fh;
import java.io.*;
public class FileBuffer {
	public static void main(String[] args) {
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\harsh\\OneDrive\\Desktop\\FileHandling\\Practice\\practice1.txt"));
			br.write("using bufferedReader class to write into the file");
			br.newLine();
			br.write("second line of the file \n");
			br.write("third line of the file");
			br.flush();
			br.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
