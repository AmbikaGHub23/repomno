package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SauceConfigurationReader {
	
	Properties p;
	public SauceConfigurationReader() throws IOException {
		File file = new File("C:\\Users\\ambik\\eclipse\\login\\src\\test\\java\\com\\helper\\sauceconfig.property");
	FileInputStream fIP = new FileInputStream(file);
	p = new Properties();
	p.load(fIP);
	}
	public String getBrowser() {
		return p.getProperty("Browser");
	}
	
	public String getUrl()
	{
		return p.getProperty("Url");
	}
}