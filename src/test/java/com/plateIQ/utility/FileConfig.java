package com.plateIQ.utility;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileConfig {
  public static String getProperty(String property) {

	Properties prop = new Properties();
	InputStream input = null;
	String propValue = null;

	try {

		input = new FileInputStream("config.properties");

		// load a properties file
		prop.load(input);
		propValue = prop.getProperty(property);

	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	return propValue;
  }

}