package com.cra;

import java.util.Scanner;

public class Admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBase b = new DataBase();
		System.out.println("hi");
		//@SuppressWarnings("resource")
		
		do {
		System.out.println("Welcome to Book's Library\nMENU\n1.View all books\n2.Search Book\n3.Add a Book\n4.Delete a Book\n5.Update the price of a book");
		System.out.println("Please enter your choice");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch (ch) {
		  
		  case 1:
		  	b.viewAll();
		  	break;
		  case 2:
			 System.out.println("enter the id of the book to search");
			 int id1 = sc.nextInt();
			 b.viewById(id1);
			 break;
		  case 3:
			  System.out.println("Enter book id");
			  int bookId = sc.nextInt();
			  System.out.println("enter title");
			  String title = sc.nextLine(); 
			  System.out.println("enter author"); 
			  String author = sc.nextLine();
			  System.out.println("enter price");
			  double price = sc.nextDouble();
			  Book ib=new Book(bookId,title,author,price);
			  b.add(ib);
			  System.out.println("Book added successfully");
			 break;
			 
		  case 4:
			  
			  System.out.println("enter the id of the book to delete");
			  int id2 = sc.nextInt();
			  b.delete(id2);
			  System.out.println("Book deleted successfully");
			  break;
		  case 5:
			  System.out.println("enter the id of the book you want to update");
			  int id3=sc.nextInt();
			  System.out.println("enter the new price");
			  int price1= sc.nextInt();
			  b.update(id3,price1);
		  case 6:
		  default: System.out.println("Wrong Choice!");
			  break;
		}
		 

	}while(true);

}
}
