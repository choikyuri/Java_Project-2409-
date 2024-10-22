package chapter06;

public class StudentMain {

	public static void main(String[] args) {
		// 디폴트 생성자로 객체(student1)를 생성하여 이름과 주소를 입력
		Student student1=new Student();
		student1.studentName = "최백설";
		student1.address = "일산동구";
		student1.showStudentInfo();
		
		System.out.println();
		//생성자를 통해서 초기화 하여 showStudentInfo()로 출력
		Student student2 = new Student("최백설","일산");
		student2.showStudentInfo();
		
		// 디폴트 생성자로 객체(student3)를 생성하여 getters and setters
		Student student3=new Student();
		student3.setStudentName("솔데스크");
		student3.setAddress("종로구");
		student3.showStudentInfo();
		
		System.out.println(student3.getStudentName());
		System.out.println(student3.getAddress());
		

	}

}
