package chapter06;

public class Book {

	// 멤버변수(=필드)
	public String bookname;
	public String author;
	
	//생성자
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	//생성자의 오버로딩
	public Book(String bookname, String author) {
		this.bookname = bookname;
		this.author = author;
	}
    
	//메서드 getter setter
	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	//사용자 메서드
	public void showBookInfo() {
		System.out.println("책이름: "+bookname+"| 저자: "+author);
	}
	
}




