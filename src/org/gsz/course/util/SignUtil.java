/**
 * 
 */
package org.gsz.course.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 *请求校验工具类
 *
 * @author gongsizhen
 * 2014年3月20日 上午5:42:00
 *
 */
public class SignUtil {
	private static String token = "08722014012007005443";
	
	public static boolean checkSignature(String signature , String timestamp , String nonce){
		String[] arr = new String[]{
				token , timestamp , nonce
		};
		Arrays.sort(arr);
		StringBuilder content = new StringBuilder();
		for(int i=0;i<arr.length;i++){
			content.append(arr[i]);
		}
		MessageDigest md = null;
		String tmpStr = null;
		
		try {
			md = MessageDigest.getInstance("SHA-1");
			byte[] digest = md.digest(content.toString().getBytes());
			tmpStr = byteToStr(digest);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		content = null;
		return tmpStr != null ? tmpStr.equals(signature.toUpperCase()) : false;
	}
	
	private static String byteToStr(byte[] byteArray){
		String strDigest = "";
		for(int i=0;i<byteArray.length;i++){
			strDigest +=byteToHexStr(byteArray[i]);
		}
		return strDigest;
	}
	
	private static String byteToHexStr(byte mByte){
		char[] Digit = {
				'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'
		};
		char[] tempArr = new char[2];
		tempArr[0] = Digit[(mByte >>> 4) & 0x0f];
		tempArr[1] = Digit[mByte & 0x0f];
		
		String s = new String(tempArr);
		return s;
	}
}
