package com.helper;

import java.io.IOException;

public class SauceFileReaderManager {
static SauceFileReaderManager sfrm;
	
	private SauceFileReaderManager()
	{}
	
	public static SauceFileReaderManager getInstance() throws IOException
	{
		sfrm = new SauceFileReaderManager();
		return sfrm;
	}
 	
	public SauceConfigurationReader getCrInstance() throws IOException
	{
		SauceConfigurationReader scr = new SauceConfigurationReader();
		return scr;
	}
}
