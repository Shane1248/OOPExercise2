public class Main{
	public static void main(String[] args){
		Book book;
		Book1 book1= new Book1("Don Quixote", "Miguel De Cervantes",1612-1620);
		Book2 book2= new Book2("Les Miserable", "Victor Hugo", 1862);
		
		book = book1;
		System.out.println(book.getGenre()+"");
		System.out.println("The Title is "+ book.getTitle());
		System.out.println("The Author is "+book.getAuthor());
		
		book = book2;
		System.out.println(book.getGenre()+"");
		System.out.println("The Title is "+ book.getTitle());
		System.out.println("The Author is "+book.getAuthor());
	}
}
