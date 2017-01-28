package t2;

import java.lang.reflect.Constructor;

import t1.Person;
/**
 * 通过反射获取带参构造器的实例
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("t1.Person");
		Constructor constructor = clazz.getConstructor(String.class,int.class,String.class);
		Object object = constructor.newInstance("林青霞",27,"北京");
		System.out.println(object);
		
		
	}
}
