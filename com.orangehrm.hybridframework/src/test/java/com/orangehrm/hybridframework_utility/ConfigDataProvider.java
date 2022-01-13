package com.orangehrm.hybridframework_utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
public Properties prop = null;
	
	public ConfigDataProvider(String configDataPath) {
		try {
		File fs = new File("./Config/config.properties");
		FileInputStream fins = new FileInputStream(fs);
		prop = new Properties();
		prop.load(fins);
		} catch (Exception e) {
			System.out.println("File not found : "  +e.getMessage());
		}
		
	}
	public String getKeyValue(String keyname) {
		return prop.getProperty(keyname);
	}
	public String getUsername() {
		return prop.getProperty("username");
	}
		
	public String getpwd() {
		return prop.getProperty("password");
	}
		
	public String getUrl() {
		return prop.getProperty("url");
	}

}
