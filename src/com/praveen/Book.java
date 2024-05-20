package com.praveen;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Book {
	
	static List<Book> BookList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	private int id;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String title;
    private String author;
    public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
    public Book(int id,String author, String title) {
    	this.id=id;
        this.author = author;
        this.title = title;
    }
    public Book() {
		// TODO Auto-generated constructor stub
	}

	public static void addBook() {
	
		System.out.println("Enter Book Id");
		int BookId = sc.nextInt();
		sc.nextLine(); 
		System.out.println("Enter Book Name");
		String BookName = sc.nextLine();
		System.out.println("Enter Book Author");
		String BookAuthor = sc.nextLine();
    	BookList.add(new Book(BookId,BookName,BookAuthor));
    }
    public static void showBook() {
    	for(Book book : BookList) {
    		System.out.print("Book Id - "+book.getId()+" - ");
    		System.out.print("Book Name - "+book.getTitle()+" - ");
    		System.out.println("Book Autnor - "+book.getAuthor());
    	}
    }
	public void updateBook(int id) {
		for(Book book : BookList) {
			if(book.getId() == id) {
				System.out.println("Enter new Book Name:");
				String newTitle = sc.nextLine();
				System.out.println("Enter new Book Author:");
				String newAuthor = sc.nextLine();
				book.setTitle(newTitle);
				book.setAuthor(newAuthor);
				System.out.println("Book updated successfully.");
				return;
			}
		}
	}
	public void deleteBook(int id) {
		for (Book book : BookList) {
            if (book.getId() == id) {
                BookList.remove(book);
                System.out.println("Book deleted successfully.");
                return;
            }
        }
	}

}
