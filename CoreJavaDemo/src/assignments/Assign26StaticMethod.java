/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */

package assignments;

//Assignment: 26
//Write a Java class named Library. Add an instance method to display the 
//book details: Book name, Author, Genre (Eg: Comedy, Kids), Published Year (1999, 2000).
//Pass the above book details when creating book object.
//Use a static variable to maintain the count of number of books added.
//Add a static method to display number of books.

class Library {
	
	String strBookName;
	String strBookAuthor;
	String strGenre;
	int iPubYear;
	static int iNumOfBooks = 0;
	
	Library(String strBookName, String strBookAuthor, String strGenre, int iPubYear) {

		this.strBookName = strBookName;
		this.strBookAuthor = strBookAuthor;
		this.strGenre = strGenre;
		this.iPubYear = iPubYear;
		Library.iNumOfBooks++;
	}
	
	public void displayBookDetails() {

		System.out.println("Book Name: " + this.strBookName);
		System.out.println("Book Author: " + this.strBookAuthor);
		System.out.println("Book Genre: " + this.strGenre);
		System.out.println("Book published year: " + this.iPubYear);
	}
	
	public static void displayBookCount() {
		
		System.out.println("Number of books: " + Library.iNumOfBooks);
	}
}

public class Assign26StaticMethod {

	public static void main(String[] args) {

		Library lib1 = new Library("Python1", "Arthur1", "Technology1", 2000);
		lib1.displayBookDetails();
		Library.displayBookCount();
		
		Library lib2 = new Library("Python2", "Arthur2", "Technology2", 2001);
		lib2.displayBookDetails();
		Library.displayBookCount();
	}
}
