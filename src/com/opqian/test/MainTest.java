package com.opqian.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileWriter;

public class MainTest{
	public static void main(String[] args) throws IOException {
		// in_and_out_test();
		file_test();
	}
	
	public static void in_and_out_test() throws IOException {
		System.out.println("main");
		InputStreamReader bis = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(bis);
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		char c;
		int n;
		n = in.read(); // 97
		c = (char) n; // a
		System.out.println(c);
		System.out.println(n);
		out.write(c);
		// out.flush(); // else we may not see it as it is buffered if don't call close
		in.close();
		out.close();
	}
	
	public static void file_test() throws IOException {
		String file_name = "test_file.txt";
		FileWriter fw = new FileWriter(file_name, false);
		fw.write("aaa");
		fw.close();
		InputStream fp;
		fp = new FileInputStream(file_name);
		byte[] buff = new byte[1];
		fp.read(buff);
		fp.close();
		System.out.print(buff[0]);
	}
}
