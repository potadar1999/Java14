package com.que1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Library {

	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Book> booksCollection=new HashSet<>();
		booksCollection.add(new Book(1, "Chalisa", "TulasiDas"));
		booksCollection.add(new Book(2, "BhagavatGeeta", "TulasiDas"));
		booksCollection.add(new Book(3, "Geeta", "TulasiDas"));
		booksCollection.add(new Book(1, "Puran", "Das"));
		
		for(Book b1:booksCollection) {
		System.out.println(b1);}
		
//		LinkedHashSet<Integer> lhs = new LinkedHashSet<> (booksCollection);
//		System.out.println(booksCollection);
	
	}

}
