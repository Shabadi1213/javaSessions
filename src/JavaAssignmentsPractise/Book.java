package JavaAssignmentsPractise;

public class Book {
	String title;
	String Author;
	int pageCount;
	int totalBooks;

	public static void main(String[] args) {
		
		Book obj1 = new Book();
		obj1.title = "LORD OF RINGS";
		obj1.Author = "J. R. R. Tolkien";
		obj1.pageCount =500;
		obj1.totalBooks = 1500;
		
		
		Book obj2 = new Book();
		obj2.title = "GOOD DAD or BAD DAD";
		obj2.Author ="David George’s";
		obj2.pageCount = 120;
		obj2.totalBooks = 100;
		
		
		Book obj3 = new Book();
		obj3.title = "STOP THINKING";
		obj3.Author ="Nick Ternton";
		obj3.pageCount = 200;
		obj3.totalBooks = 300;
		
		System.out.println("The Book details are " +" Title = "+ obj1.title+"," +" "+"Author = " + obj1.Author+"," +" "+"PageCount= " + obj1.pageCount+"," +" "+" Total Books = " + obj1.totalBooks+ ".");
		System.out.println("The Book details are " +" Title = "+ obj2.title+"," +" "+"Author = " + obj2.Author+"," +" "+"PageCount= " + obj2.pageCount+"," +" "+" Total Books = " + obj2.totalBooks+ ".");
		System.out.println("The Book details are " +" Title = "+ obj3.title+"," +" "+"Author = " + obj3.Author+"," +" "+"PageCount= " + obj3.pageCount+"," +" "+" Total Books = " + obj3.totalBooks+ ".");

		System.out.println("=================Updated the Page count");
		
		obj2.pageCount = 150;
		System.out.println("The Book details are " +" Title = "+ obj2.title+"," +" "+"Author = " + obj2.Author+"," +" "+"PageCount= " + obj2.pageCount+"," +" "+" Total Books = " + obj2.totalBooks+ ".");
		
		
		Book obj4 = new Book();
		obj4.title = "RAMAYANA";
		obj4.Author = "Valmiki";
		obj4.pageCount = 250;
		obj4.totalBooks = 5000;
		
		System.out.println("===============================New Book Added=====================");
		
		System.out.println("The Book details are " +" Title = "+ obj4.title+"," +" "+"Author = " + obj4.Author+"," +" "+"PageCount= " + obj4.pageCount+"," +" "+" Total Books = " + obj4.totalBooks+ ".");
		
		
		obj4.totalBooks = 10000;
		System.out.println("The Book details are " +" Title = "+ obj4.title+"," +" "+"Author = " + obj4.Author+"," +" "+"PageCount= " + obj4.pageCount+"," +" "+" Total Books = " + obj4.totalBooks+ ".");
		
	}

}
