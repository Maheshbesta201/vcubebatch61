package langfundamentals;

public class Book {
	int BookId;
	String Title;
	String Author;
	double Price;
	double DiscountPercentage;
	double percentage;
	double FinalPrice;
	
	public static void main(String[] args) {
		Book b=new Book();
		b.BookId=201;
		b.Title="rich Dad Poor Dad";
		b.Author="Robert Kiyosaki";
		b.Price=365;
		b.DiscountPercentage=10;
		double a=b.Price/10;
		b.percentage=a*b.DiscountPercentage/10;
		b.FinalPrice=b.Price-b.percentage;
		System.out.println("Book ID : "+b.BookId);
		System.out.println("Book Title : "+b.Title);
		System.out.println("Book Author : "+b.Author);
		System.out.println("Book Price : "+b.Price);
		System.out.println("Book Discount Percentage : "+b.DiscountPercentage);
		System.out.println("Book Discount Amount : "+b.percentage);
		System.out.println("Book Final Price : "+b.FinalPrice);
		
		
		
	}

}
