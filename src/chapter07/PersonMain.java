package chapter07;

public class PersonMain {

	public static void main(String[] args) {
		
		SolPerson personKim=new SolPerson();
		System.out.println(personKim.name="김유신");
		System.out.println(personKim.height=180f);
		System.out.println(personKim.weight=80F);
		
		System.out.println("-----------------------------");
		SolPerson personKang=new SolPerson("강감찬");
		System.out.println(personKang.name);
		System.out.println(personKang.height=175f);
		System.out.println(personKang.weight=75F);
		
		System.out.println("-----------------------------");
		SolPerson personLee=new SolPerson("이순신", 170, 70);
		System.out.println(personLee.name);
		System.out.println(personLee.height);
		System.out.println(personLee.weight);


	}

}
