package t7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		ud.add();
		ud.delete();
		ud.update();
		ud.find();
		System.out.println("--------");
		MyInvocationHandler handler = new MyInvocationHandler(ud);
		UserDao proxy = (UserDao) Proxy.newProxyInstance(ud.getClass().getClassLoader(), ud.getClass().getInterfaces(),
				handler);
		proxy.add();
		proxy.delete();
		proxy.update();
		proxy.find();
		System.out.println("--------");
		StudentDao sd = new StudentDaoImpl();
		MyInvocationHandler studentHandler = new MyInvocationHandler(sd);
		StudentDao studentProxy = (StudentDao) Proxy.newProxyInstance(sd.getClass().getClassLoader(),
				sd.getClass().getInterfaces(), studentHandler);
		studentProxy.login();
		studentProxy.register();
		

	}

}
