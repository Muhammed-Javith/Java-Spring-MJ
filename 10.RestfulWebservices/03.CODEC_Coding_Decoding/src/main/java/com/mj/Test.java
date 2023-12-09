package com.mj;

import org.apache.commons.codec.binary.Base64;

//to download jars use this link 
//"https://commons.apache.org/proper/commons-codec/download_codec.cgi"
public class Test {
	public static void main(String[] args) {
		// Encoding Process
		String m = "Hello, Welcome Madurai";
		byte[] a = m.getBytes();
		byte[] b = Base64.encodeBase64(a);
		String s = new String(b);
		System.out.println(s);
		// Decoding Process
		byte[] c = s.getBytes();
		byte[] d = Base64.decodeBase64(c);
		String msg = new String(d);
		System.out.println(msg);
	}
}
