public class Book2 extends Book{
	private int year;

	public Book2(String title, String author, int year){
		super(title, author);
		this.year=year;
	}

	@Override
	public String getGenre(){
		return "tragedy";
	}

	public int getYear(){
		return year;
	}

	public void setYear(int year){
		this.year=year;
	}
}
