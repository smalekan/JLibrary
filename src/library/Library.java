/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Library implements Serializable {
	
	private List<Book/*hamoon class Book*/> collection; //list of books

	public Library(){
		collection = new ArrayList<Book>(); //in mitoone etefagh Bofte chon List ye interface e k arrayList ye implemetation az oune
	}
	
	public void addBook(Book book){
		collection.add(book);
	}
	
	@Override
	public String toString() {
		String total = "\n";
		/*
		for (int i=0; i<collection.size(); i++){
			Book b = collection.get(i);
			total = total + b.toString();
		}
		*/
		Iterator<Book> i = collection.iterator(); //mesle ye halghe for
		while(i.hasNext()){
                    Book b = (Book) i.next()/*output in method Objecte, bookesh miknm k khas she*/;
                    total = total + b.toString()/*too class Book neveshte shod*/;
		}
		return total;
	}
}
