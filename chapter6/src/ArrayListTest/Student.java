package ArrayListTest;

import java.util.ArrayList;

public class Student {
	
	int serial;
	String name;
	ArrayList<Book> booklist;
	int index;
	
	public Student(int serial, String name) {
		this.serial = serial;
		this.name = name;
		booklist =new ArrayList<Book>();
	}
		
		public void addBook(String title, String author){ 
			Book book = new Book();
			
			book.setBookwriter(author);
			book.setBookname(title);
			booklist.add(book);
		}
		
		public void showStudentinfo() {
			System.out.print(serial + "학생이 읽은 책은 : " );
			
			for(Book book : booklist) 
				System.out.print(book.getBookname() + " ");{
			}
				
			System.out.println("입니다");
		}
		
	}


