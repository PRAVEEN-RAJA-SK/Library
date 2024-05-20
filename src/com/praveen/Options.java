package com.praveen;
import java.util.*;
public class Options {

	private static Book book;
    static 	Scanner sc = new Scanner(System.in);
	public static void show() {
		
		while(true) 
		{
			System.out.println("1.Add Books");
			System.out.println("2.Show Books");
			System.out.println("3.Upadate Books");
			System.out.println("4.Delete Books");
			System.out.println("5.Exit");
			System.out.println("Enter your options");
		
			int choice = sc.nextInt();
			runOptions(choice);
		}
	}
	
	public static void runOptions(int choice) {
		 switch(choice) {
		 case 1:
			 book = new Book();
			 book.addBook();
			 break;
		 case 2:
			  book=new Book();
			  book.showBook();
			 break;
		 case 3:
			  book=new Book();
			  System.out.println("Enter Book Id");
			  int id = sc.nextInt();
			  book.updateBook(id);
			 break;
		 case 4:
			  book=new Book();
			  System.out.println("Enter Book Id");
			  id = sc.nextInt();
			  book.deleteBook(id);
			 break;
		 case 5:
			 System.exit(0);
		 default:
			 System.out.println("Invalid");
			 break;
		 }
		 show();
	}
}
