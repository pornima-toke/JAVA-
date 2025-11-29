

public class LibraryBookManagement {

	public static void main(String[] args) {
		// Create two individual book
		Book book1 = new Book ();
		book1.setTitle("Java");
		book1.setAuthor("XYZ");
		book1.setPrice(530);
		
		Book book2 = new Book ();
		book2.setTitle("Story");
		book2.setAuthor("ABC");
		book2.setPrice(365);
		
		// Compare the prices
        if (book1.getPrice() > book2.getPrice())
        {
            System.out.println("More expensive book: " + book1.getTitle());
        } 
        else if (book2.getPrice() > book1.getPrice())
        {
            System.out.println("More expensive book: " + book2.getTitle());
        }
        else 
        {
            System.out.println("Both books have the same price.");
        }
	}

}

class Book
{
	String title;
	private String author;
	int price;
	
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public void setPrice(int price) 
	{
		this.price = price;
	}
	
	
}
