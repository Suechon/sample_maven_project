package sample_common;

import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropertyUtil {

	private Properties prop;

	public PropertyUtil(String path) {
		ResourceBundle rb = ResourceBundle.getBundle(path);
		Enumeration<String> e = rb.getKeys();

		prop = new Properties();
		while (e.hasMoreElements()) {
			String key = e.nextElement();
			prop.put(key, rb.getString(key));
		}
	}

	public String getValue(String key) {
		return prop.getProperty(key);
	}

}
