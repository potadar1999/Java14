package com.que1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

public class Book {
	
	 private int bookId;
	 private String bookName;
	 private String author;
	
	
	public Book() {
		super();
	}


	 Book(int bookId, String bookName, String author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}

	 
		@Override
		public String toString() {
			return "Library [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + "]";
		}


		@Override
		public int hashCode() {
			return this.bookId;
		}


		@Override
		public boolean equals(Object obj) {
			Book o=(Book)obj;
			if(this.bookId==o.bookId)
				return true;
			else {
				return false;
			}
		}

	
		
	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
	


	
	



}
