package t2;

import java.lang.reflect.Constructor;

public class ReflectDemo3 {
	
	public static void main(String[] args) throws Exception {
		// 获取字节码文件
		Class clazz = Class.forName("t1.Person");
		// 获取私有构造方法
		Constructor con = clazz.getDeclaredConstructor(String.class);
		con.setAccessible(true);
		// 用私有构造方法
		Object object = con.newInstance("aaa");
		System.out.println(object);
	}
	
}
