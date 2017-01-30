package t6;

public class StudentDaoImpl2 implements StudentDao{

	@Override
	public void login() {
		System.out.println("权限校验");
		System.out.println("登陆功能");
	}

	@Override
	public void register() {
		System.out.println("权限校验");
		System.out.println("注册功能");
		
	}

}
