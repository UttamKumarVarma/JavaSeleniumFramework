package config;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

public class PropertiesFile {
	
	public static String projectPath= System.getProperty("user.dir");
	static Properties properties=new Properties();

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getProperties());

	}
	public static String getProperties() {
		setProperties();
		String browsername = null;
		try {
			
			InputStream input= new FileInputStream(projectPath+"/src/test/java/config/config.properties");
			try {
				properties.load(input);
				browsername= properties.getProperty("browser");		
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return browsername;
	}
	
	public static void setProperties(){
		try {
		OutputStream output= new FileOutputStream(projectPath+"/src/test/java/config/config.properties");
		properties.setProperty("browser", "chrome");
		properties.store(output, null);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
