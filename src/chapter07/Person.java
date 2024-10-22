package chapter07;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	Person returnSelf() {
		return this; //자기 자신의 주소를 반환
	}
	
	

}
