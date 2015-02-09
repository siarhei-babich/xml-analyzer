package com.epam.xml_analyzer;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

public class App 
{
	static File directory = new File("directory");
	
    public static void main( String[] args ) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException
    {
        for (int i = 0; i < args.length; i++) {
        	System.out.println(args[i]);
        }
            
        System.out.println("Hello World!");
        if (!directory.exists()) {
        	directory.mkdir();        	
        }
        else {
        	Logger.getAnonymousLogger().info("Directory '" + directory.getAbsolutePath()+ "' already exists!");
        }
        
        GetPropertyValues gpv = new GetPropertyValues();
        System.out.println(gpv.getProperties());
        
        XMLProcessor xmlProcessor = new XMLProcessor();
        xmlProcessor.testXML();
    }

}