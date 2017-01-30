package t6;

public class UserDaoImpl2 implements UserDao{

	@Override
	public void add() {
		System.out.println("权限校验");
		System.out.println("添加功能");
	}

	@Override
	public void delete() {
		System.out.println("权限校验");
		System.out.println("删除功能");
		
	}

	@Override
	public void update() {
		System.out.println("权限校验");
		System.out.println("更新功能");
		
	}

	@Override
	public void find() {
		System.out.println("权限校验");
		System.out.println("查询功能");
	}

}
