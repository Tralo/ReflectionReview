package t3;

import java.lang.reflect.Field;

import t1.Person;

public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		// 获取字节码文件对象
		Class c = Class.forName("t1.Person");
	
		// 获取所有的成员变量
//		Field[] fields = c.getDeclaredFields();
//		for(Field field: fields){
//			System.out.println(field);
//		}
		// 获取单个成员变量
		// 获取 address 并对其赋值
		
		Field addressField = c.getField("address");
		Object obj = c.newInstance();
		addressField.set(obj, "朝阳区");
		System.out.println(obj);
		
		Field nameField = c.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(obj, "林青霞");
		System.out.println(obj);
		
		Field ageField = c.getDeclaredField("age");
		ageField.setAccessible(true);
		ageField.set(obj, 18);
		System.out.println(obj);
	}
	
	
}
