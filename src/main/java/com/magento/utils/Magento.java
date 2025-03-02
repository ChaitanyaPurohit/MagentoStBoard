package com.magento.utils;


public class Magento {
	private static final String base=System.getProperty("user.dir");
	private static final String filepath = "/src/main/resources/Magento.properties";
	
	public static String getVAlidEmailForSignIn() {
		String email=PropUtils.getProperty(base+filepath, "Email");
		return email;
		
	}
	public static String getValidPasswordForSignIN() {
		String password=PropUtils.getProperty(base+filepath, "Password");
		return password;
	}
	public static String getUrl(String env) {
		return PropUtils.getProperty(base+filepath, env+".url");
	}
}
