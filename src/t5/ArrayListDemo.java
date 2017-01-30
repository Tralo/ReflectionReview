package t5;

import java.lang.reflect.Method;
import java.util.ArrayList;
/**
 * 利用反射给 ArrayList<Integer> 添加 字符串数据
 */
public class ArrayListDemo {
	
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(10);
		Class c = array.getClass();
		Method m = c.getMethod("add", Object.class);
		m.invoke(array, "hello");
		m.invoke(array, "aaa");
		m.invoke(array, "bbb");
		m.invoke(array, 837843);
		
		
		System.out.println(array);
		
	}

}
