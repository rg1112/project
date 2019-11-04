package com.hqyj.test;

import org.apache.shiro.crypto.hash.SimpleHash;

public class TestMd5 {

	public static void main(String[] args) {
		Object obj = new SimpleHash("MD5", "123", "s006",1024);
		System.out.println(obj);
	}

}
