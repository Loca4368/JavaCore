package javaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class DemoJavaIO {
	
	public static void main(String[] args) throws IOException {
		
		String filePath = "d:";
		
		//Demo1: Use InputStream and OutputStream to copy file
		File  sourceFile = new File(filePath + File.separator + "source.txt");
		
		File  targetFile = new File(filePath + File.separator + "target.txt");
		
		InputStream in = new FileInputStream(sourceFile);
		
		OutputStream out = new FileOutputStream(targetFile);
		
		int content;
		
		byte[] bf = new byte[1024];
		
		while((content =in.read(bf))!=-1)
		{
			out.write(bf, 0, content);
		}
		
		in.close();
		
		out.close();
		
		
		//Demo2: Use OutputStream to copy String into  file
		String content2 = "Hello World!";
		
		File targetFile2 = new File(filePath + File.separator + "target2.txt");
		
		OutputStream out2 = new FileOutputStream(targetFile2);
		
		byte[] bs = content2.getBytes();
		
		out2.write(bs);
		
		out2.close();
		
		////Demo3: Use Reader and Writer to copy file
		File sourceFile3 = new File(filePath + File.separator + "source3.txt");
		File targetFile3 = new File(filePath + File.separator + "target3.txt");
		
		Reader rd = new FileReader(sourceFile3);
		
		Writer wr = new FileWriter(targetFile3);
		
		char[] cbuff = new char[1024];
		
		int content3;
		while((content3= rd.read(cbuff))!= -1)
		{
			wr.write(cbuff, 0, content3);
		}
		
 		rd.close();
 		wr.close();
 		
 		
 		System.out.println("Write files Sucessfully!");
	}

}
