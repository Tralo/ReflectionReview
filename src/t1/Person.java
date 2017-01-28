package t1;

public class Person {
	private String name;
	int age;
	public String address;
	public Person() {
	}
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
		
	}

	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void show(){
		System.out.println("show");
	}
	
	public void method(String s){
		System.out.println("method:" + s);
	}
	
	public String getString(String s,int i){
		return s + "----" + i;
	}

}
