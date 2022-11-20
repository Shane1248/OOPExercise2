public class Book1 extends Book{
	private int year;
	
	public Book1(String title, String author, int year){
		super(title, author);
		this.year=year;
	}
	
	@Override
	public String getGenre(){
		return "novel";
	}
	
	public int getYear(){
		return year;
	}
	
	public void setYear(int year){
		this.year=year;
	}
}
