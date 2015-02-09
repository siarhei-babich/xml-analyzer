package com.epam.xml_analyzer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class GetPropertyValues {
	
    public String getProperties() throws IOException {
    	Properties prop = new Properties();
    	String propFileName = "config.properties";
    	InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
    	if (inputStream != null) {
    		prop.load(inputStream);
    	}
    	else {
    		throw new FileNotFoundException("Property file '" + propFileName + "' not found in the classpth!"); 
    	}
    	Date time = new Date(System.currentTimeMillis());
    	System.out.println(time);
    	String user = prop.getProperty("user");
    	return user;
    }

}
