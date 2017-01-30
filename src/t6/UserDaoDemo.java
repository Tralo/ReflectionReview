package t6;

public class UserDaoDemo {
	public static void main(String[] args) {
		UserDao dao = new UserDaoImpl();
		dao.find();
		dao.update();
		dao.add();
		dao.delete();
		System.out.println("---------");
		// 真实的需求应该是这个样子的：
		// 在每个操作执行前： 应该看看你是否有权限进行这个操作
		// 谁操作的这个东西，你得给我留下记录
		UserDao dao2 = new UserDaoImpl2();
		dao2.find();
		dao2.update();
		dao2.add();
		dao2.delete();
		
		// 假设还有一个学生类具备这样的操作
		
		System.out.println("-------------------");
		StudentDao sd = new StudentDaoImpl();
		sd.login();
		sd.register();
		// 真实的需求应该是这个样子的：
		// 在每个操作执行前： 应该看看你是否有权限进行这个操作
		// 谁操作的这个东西，你得给我留下记录
		System.out.println("-------------------");
		StudentDao sd2 = new StudentDaoImpl2();
		sd2.login();
		sd2.register();
		
		
		
	}
}
