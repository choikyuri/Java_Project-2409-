package chapter07;

public class CallAnother {

	public static void main(String[] args) {
		
		Person noName=new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		System.out.println("noName狼 林家: "+noName);
		System.out.println("noName狼 林家: "+noName.returnSelf());
		
		System.out.println("---------------------------");
		Person p=new Person();
		System.out.println("p狼 林家: "+p);
		System.out.println("p狼 林家: "+p.returnSelf());
		System.out.println("---------------------------");
		Person person=noName.returnSelf();
		System.out.println("person狼 林家: "+person);
		System.out.println("noName狼 林家: "+noName);

	}

}
