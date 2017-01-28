package t2;

import java.lang.reflect.Constructor;

import t1.Person;

public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		//获取字节码文件对象
		Class c = Class.forName("t1.Person");
		// 获取构造方法
		/*Constructor[] cons =c.getConstructors();
		Constructor[] declaredCons = c.getDeclaredConstructors();
		for(Constructor constructor : declaredCons){
			System.out.println(constructor);
		}*/
		Constructor constructor = c.getConstructor();
		
		Object obj = constructor.newInstance();
		System.out.println(obj);
		
		Person p = (Person) obj;
		p.show();
		
	}
	
}
