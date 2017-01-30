package t5;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		InputStream is = new FileInputStream(new File("src/t5/config.properties"));
		properties.load(is);
		String pkgName = properties.getProperty("option");
		String methodName = properties.getProperty("methodName");
		is.close();
		Class clazz = Class.forName(pkgName);
		Object obj = clazz.newInstance();
		
		Method method = clazz.getDeclaredMethod(methodName);
		method.setAccessible(true);
		method.invoke(obj);
		
		
	}
}
