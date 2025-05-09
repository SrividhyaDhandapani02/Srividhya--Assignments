package Week1.day2;

public class Library {
	public String addBook(String bookTitle) {
		
		return bookTitle+" Book added successfully";
	}
 public void issueBook() {
	 System.out.println("Book issued successfully");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library AB=new Library();
		System.out.println(AB.addBook("Harry Potter"));
		AB.issueBook();
	}

}
