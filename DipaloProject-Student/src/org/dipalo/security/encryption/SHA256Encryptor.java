package org.dipalo.security.encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public final class SHA256Encryptor {
	
	public static String generateSHA256HashCode(String value) 
			throws NoSuchAlgorithmException {
		
		MessageDigest sha256 = MessageDigest.getInstance("SHA-256");        
	    byte[] bytes = value.getBytes();
	    byte[] hashCode = sha256.digest(bytes);
	    return hashCode.toString();
	}
	
	public static String generateSHA256HashCode(String value, String salt) 
				throws NoSuchAlgorithmException {
		
		return generateSHA256HashCode(
				new StringBuilder().append(salt)
				.append(salt).toString());
		
	}
	
	public static String generateSHA256HashCode(String value, int salt) 
			throws NoSuchAlgorithmException {
		return generateSHA256HashCode(value, String.valueOf(salt));
	}
	
	public static Integer getRandomSaltValue() {
		long seed = System.currentTimeMillis();
		return new Random(seed).nextInt();
	}
}
