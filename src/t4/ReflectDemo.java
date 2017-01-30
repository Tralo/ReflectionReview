package t4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("t1.Person");
//		Method[] methods = clazz.getDeclaredMethods();
//		Method[] methods = clazz.getMethods();
//		for(Method m : methods){
//			System.out.println(m);
//		}
		Constructor con = clazz.getConstructor();
		Object obj = con.newInstance();
		
		Method showMethod = clazz.getDeclaredMethod("show");
		showMethod.invoke(obj);
		Method method = clazz.getDeclaredMethod("method", String.class);
		method.invoke(obj, "传入的参数");
		Method getMethod = clazz.getDeclaredMethod("getString", String.class, int.class);
		Object result = getMethod.invoke(obj, "传入的数字", 777);
		System.out.println(result);
		
	}
}
