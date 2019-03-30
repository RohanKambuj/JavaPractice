package passwordEncodeDecode;

import java.util.Base64;

public class EncodeDecodePassword {

	public static void main(String[] args) {
		
		String password = "Pass@123";
		String encodedPassword = encodePassword(password);
		
		System.out.println("Encoded Password is: "+encodedPassword);
		
		String decodedPassword = decodePassword(encodedPassword);
		System.out.println("Decoded Password is: "+decodedPassword);

	}
	
	private static String encodePassword(final String passcode) {
		byte[] passwordInBytes = passcode.getBytes();
		String password = Base64.getEncoder().encodeToString(passwordInBytes);
		return password;
	}
	
	private static String decodePassword(String passcode) {
		byte[] bytesPassword = Base64.getDecoder().decode(passcode);
		String password = new String(bytesPassword);
		return password;
	}

}
