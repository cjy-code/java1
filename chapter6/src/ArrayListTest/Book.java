package ArrayListTest;

public class Book {
	
	 private String bookname;
	 private String bookwriter;
	 
	 public Book() {}
	 
	 public Book(String bookname, String bookwriter) {
		 this.bookname = bookname;
		 this.bookwriter = bookwriter;
		 
	 }

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBookwriter() {
		return bookwriter;
	}

	public void setBookwriter(String bookwriter) {
		this.bookwriter = bookwriter;
	}
	
	public void showBookinfo() {
		System.out.println(bookname + "," + bookwriter);
	}
	 
	 

}
