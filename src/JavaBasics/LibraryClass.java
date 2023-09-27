package JavaBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryClass {
	public List<Book> books;
	
	public List<Book> getBooks()
	{
		return books;
	}
	public void setBooks(List<Book> books)
	{
		this.books=books;
	}
	
	public static void main(String[] args) {
		
		Book book1 = new Book("Half Girl Friend","ChethanBagath",99999999);
		Book book2 = new Book("Two States","ajeeth",88888888);
		Book book3 = new Book("hai dil hai mushkil","Shiva",77777777);
		Book book4 = new Book("Rock Star","Pavan",66666666);
		
		List<Book> listofBook = new ArrayList<>();
		listofBook.add(book1);
		listofBook.add(book2);
		listofBook.add(book3);
		listofBook.add(book4);
		
		System.out.println(listofBook);
		System.out.println();
	
	
	for(Book book : listofBook)
	{
		System.out.println(book);
	}
	System.out.println();
	
	
	String title = listofBook.get(0).getTitle();
	System.out.println("Books Title is:" +title);
	
	String author = listofBook.get(0).getAuthor();
	System.out.println("Author Name is:"+author);
	System.err.println();
	
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter Author Name");
	
	String authorr;
	authorr = scn.nextLine();
	
	if(authorr.equals("ChethanBagath"))
	{
		System.out.println("Book is: "+listofBook.get(0).getTitle());
	}
	else if(authorr.equals("ajeeth"))
	{
		System.out.println("Book is: "+listofBook.get(1).getTitle());
	}
	else if(authorr.equals("Shiva"))
	{
		System.out.println("Book is: "+listofBook.get(2).getTitle());
	}
	else if(authorr.equals("Pavan"))
	{
		System.out.println("Book is: "+listofBook.get(3).getTitle());
	}
	else
	{
		System.out.println("No Book Found");
	}
	}

}
