package chapter06;

public class StudentMain {

	public static void main(String[] args) {
		// ����Ʈ �����ڷ� ��ü(student1)�� �����Ͽ� �̸��� �ּҸ� �Է�
		Student student1=new Student();
		student1.studentName = "�ֹ鼳";
		student1.address = "�ϻ굿��";
		student1.showStudentInfo();
		
		System.out.println();
		//�����ڸ� ���ؼ� �ʱ�ȭ �Ͽ� showStudentInfo()�� ���
		Student student2 = new Student("�ֹ鼳","�ϻ�");
		student2.showStudentInfo();
		
		// ����Ʈ �����ڷ� ��ü(student3)�� �����Ͽ� getters and setters
		Student student3=new Student();
		student3.setStudentName("�ֵ���ũ");
		student3.setAddress("���α�");
		student3.showStudentInfo();
		
		System.out.println(student3.getStudentName());
		System.out.println(student3.getAddress());
		

	}

}