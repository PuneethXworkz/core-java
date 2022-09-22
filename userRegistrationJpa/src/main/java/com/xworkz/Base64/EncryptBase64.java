package com.xworkz.Base64;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncryptBase64 {

	public static void main(String[] args) {
		
		Encoder encode = Base64.getEncoder();
		String originalString = "Hello Welcome to Xworkz";
		String encryptedString = encode.encodeToString(originalString.getBytes());
		
		System.out.println("Encrypted String :" + encryptedString);
		
		Decoder decode = Base64.getDecoder();
		byte[] byt = decode.decode(encryptedString);
		
		System.out.println("Decrypted String  :"+new String(byt));
		
	}

}