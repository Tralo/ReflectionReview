package t5;

import t1.Person;

public class ToolDemo {
	
	public static void main(String[] args) {
		Worker w = new Worker();
		Dog dog = new Dog();
		try{
			Tool.setProperty(w, "name", "张三");
			Tool.setProperty(w, "age", 19);
			System.out.println(w);
			
			Tool.setProperty(dog, "sex", '公');
			Tool.setProperty(dog, "price", 5000.0f);
			System.out.println(dog);
			
		} catch (Exception e) {
		}
		
	}

}

class Dog{
	char sex;
	float price;
	@Override
	public String toString() {
		return "Dog [sex=" + sex + ", price=" + price + "]";
	}
}


class Worker{
	private String name;
	public int age;
	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
