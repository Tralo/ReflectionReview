package t1;

/**
 * 反射：就是通过class文件对象，去使用该文件中的成员变量，构造方法，成员方法
 */
public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		//方式1
		Person p = new Person();
		Class c1 = p.getClass();
		//方式2
		Class c2 = Person.class;
		
		
		//方法3
		Class c3 = Class.forName("t1.Person");
		
	}
}
