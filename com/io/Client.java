package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.function.Consumer;

public class Client {

	public static void main(String[] args) throws IOException {

		String filePath = "d:";

		// Demo1: Use InputStream and OutputStream to copy file
		File sourceFile = new File(filePath + File.separator + "source.txt");
		File targetFile = new File(filePath + File.separator + "target.txt");
		
		InputStream in = new FileInputStream(sourceFile);
		OutputStream out = new FileOutputStream(targetFile);

		int content;
		byte[] bf = new byte[1024];

		while ((content = in.read(bf)) != -1) {
			out.write(bf, 0, content);
		}

		in.close();
		out.close();

		// Demo2: Use OutputStream to copy String into file
		String content2 = "Hello World!";
		
		File targetFile2 = new File(filePath + File.separator + "target2.txt");
		OutputStream out2 = new FileOutputStream(targetFile2);
		
		byte[] bs = content2.getBytes();
		
		out2.write(bs);
		out2.close();

		// Demo3: Use Reader and Writer to copy file
		File sourceFile3 = new File(filePath + File.separator + "source3.txt");
		File targetFile3 = new File(filePath + File.separator + "target3.txt");

		Reader rd = new FileReader(sourceFile3);
		Writer wr = new FileWriter(targetFile3);

		char[] cbuff = new char[1024];
		int content3;
		
		while ((content3 = rd.read(cbuff)) != -1) {
			wr.write(cbuff, 0, content3);
		}
		
		rd.close();
		wr.close();

		System.out.println("Write files Sucessfully!");

		// Demo3: Use Buffer to read and write file

		File sourceFile4 = new File(filePath + File.separator + "source4.txt");
		File targetFile4 = new File(filePath + File.separator + "target5.txt");

		Reader rd2 = new FileReader(sourceFile4);
		Writer wt2 = new FileWriter(targetFile4);

		BufferedReader bfr = new BufferedReader(rd2);
		BufferedWriter bwt = new BufferedWriter(wt2);

		// Write content line by line
		String line = null;
		while ((line = bfr.readLine()) != null) {
			bwt.write(line);
			bwt.newLine();
			bwt.flush();
		}

		// Write content char by char
// 		int ch = 0;
// 		while((ch = bfr.read())!= -1)
// 		{
// 			bwt.write(ch);
// 		}
// 		
		bfr.close();
		bwt.close();

		// Demo4: Call recursive function(walkFile) to List all files
		File sourceFile2 = new File(filePath + "/Files");

		walkFile(sourceFile2);

	}

	// Method to walk directory and print out files
	public static void walkFile(File file) {
		// For file modified time
		Calendar cl = Calendar.getInstance();

		StringBuilder sb = new StringBuilder();
		if (file.isDirectory()) {
			System.out.println("Current Direcotry: " + file.getPath());
			for (File temp : file.listFiles()) {
				walkFile(temp);
			}
		} else {
			sb.append("Name:" + file.getName());
			sb.append(" ");
			sb.append("Size:" + file.length());
			sb.append(" ");
			cl.setTimeInMillis(file.lastModified());
			sb.append("Last Modified:" + cl.getTime().toString());
			System.out.println(sb.toString());
		}

	}
}
