package com.opqian.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Iterator;
import java.util.stream.Stream;

public class PathTest {
	public void path_test() throws IOException {
		// cwd
		Path p = Paths.get(".");
		System.out.println(p);
		System.out.println(p.toAbsolutePath());
		File f = p.toFile();
		System.out.println(f);
		System.out.println(f.getAbsoluteFile());
		System.out.println(f.getCanonicalPath()); // 标准化路径， 用于过滤前
		System.out.println(System.getProperty("user.dir"));
		String pwd_url = getClass().getResource("").getPath();
		System.out.println(pwd_url);
		File pwd = new File(pwd_url);
		System.out.println(pwd.getCanonicalPath());
		// path actions
		String file_name = "test_file.txt";
		Path file_path = Paths.get(file_name);
		BasicFileAttributeView file_attr = Files.getFileAttributeView(file_path, BasicFileAttributeView.class);
		BasicFileAttributes stat = file_attr.readAttributes();
		System.out.println(stat.size());
		System.out.println(stat.lastModifiedTime());
		
		Stream<Path> paths = Files.walk(p);
		for (Iterator<Path> iter = paths.iterator(); iter.hasNext();) {
			Path item = iter.next();
			System.out.println(item);
		}
		paths.close();
		
		Path temp_file_path = Paths.get("tmp.txt");
		Files.copy(file_path, temp_file_path);
		Files.delete(temp_file_path);
		
	}
}
