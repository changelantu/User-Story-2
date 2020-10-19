package com.cra;

import java.util.Iterator;
import java.util.TreeSet;

public class DataBase {
	TreeSet<Book> bookSet;
	
	public DataBase() {

	Book b1 = new Book(1,"aaa","author1",100);
	Book b2 = new Book(2,"bbb","author2",200);
	Book b3 = new Book(3,"ccc","author3",300);
	Book b4 = new Book(4,"ddd","author4",400);
	Book b5 = new Book(5,"eee","author5",500);
	
	 bookSet = new TreeSet<Book>();
	
	bookSet.add(b1);
	bookSet.add(b2);
	bookSet.add(b3);
	bookSet.add(b4);
	bookSet.add(b5);
	
	}
	
	public void viewAll() {
		Iterator <Book> itr = bookSet.iterator();
		while( itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
	
	public void viewById(int bookId) {
		
		for(Book b:bookSet) {
			if(b.bookId==bookId)
				System.out.println(b);
		}
	}
	
	public void add(Book b1) {
		  bookSet.add(b1);
	}
	
	public void delete( int id) {
		Iterator<Book> itr = bookSet.iterator();
		if(id==itr.next().bookId) {
			itr.remove();
		}else {
			System.out.println("id not found");
		}
	}

	public void update(int id, double price) {
		TreeSet<Book> bookSet = new TreeSet<Book>();
		Iterator<Book> itr=bookSet.iterator();
		while(itr.hasNext()) {
			Book update = itr.next();
			if(update.bookId==id) {
				String title=update.title;
				String author=update.author;
				itr.remove();
				Book b = new Book(id,title,author,price);
				bookSet.add(b);
				
			}
		}
		
	}

	
	
	
}

