package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class baseclass {
	public Properties Configproperties() throws IOException {
		Properties properties = new Properties();
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties");
		properties.load(file);
		return properties;
	}

}
