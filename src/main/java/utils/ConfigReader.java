package utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	  private static Properties prop = new Properties();

	    static {
	        try (InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream("config.properties")) {
	            if (input != null) {
	                prop.load(input);
	            } else {
	                throw new RuntimeException("config.properties not found" );
	            }
	        } 
	        
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public static String getProperty(String key) {
	        return prop.getProperty(key);
	    }
	}
	
	
	    	    
	 
	


