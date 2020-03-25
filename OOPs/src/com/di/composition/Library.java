package com.di.composition;

import java.util.List;

//Library class contains list of books.
public class Library {

	// reference to refer to list of books.
	private final List<Book> books;

	public Library(List<Book> books) {

		this.books = books;
	}

	public List<Book> getTotalBooksInLibrary() {

		return books;
	}

}
