package com.trining.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonUtilities {

	public String getapplicationProperty(String Key) throws IOException {
		String path = "//Users//kavithabharathiraja//eclipse-workspace//CucumberBasic//properties//application.properties";
		FileInputStream fileinput;

		fileinput = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fileinput);

		prop.getProperty(Key);
		String value = prop.getProperty(Key);
		return value;
			
	}

	

	

}
