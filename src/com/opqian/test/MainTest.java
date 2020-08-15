package com.opqian.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MainTest{
	public static void main(String[] args) throws IOException {
		System.out.println("main");
		InputStreamReader bis = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(bis);
		char c;
		int n;
		n = in.read(); // 97
		c = (char) n; // a
		System.out.println(c);
		System.out.println(n);

	}

}
