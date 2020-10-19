package com.cra;

import java.util.Iterator;
import java.util.Scanner;


public class Book implements Comparable<Book>  {
	
	int bookId;
	String title;
	String author;
	double price;
	//Date publishDt= new Date();
	Scanner sc = new Scanner(System.in);
	
	public Book() {}
	
	public Book(int bookId, String title, String author, double price) {
		//super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + bookId;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		//result = prime * result + ((publishDt == null) ? 0 : publishDt.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (bookId != other.bookId)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		/*
		 * if (publishDt == null) { if (other.publishDt != null) return false; } else if
		 * (!publishDt.equals(other.publishDt)) return false;
		 */
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price+ "]";
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.bookId-o.bookId;
	}
	
		
}
