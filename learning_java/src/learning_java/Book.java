package learning_java;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;


public class Book{
	
    private int book_id;
    private String title;
    private String author;
    private int price;
    
    
    public Book(int book_id, String title, String author, int price) {
    	this.book_id=book_id;
    	this.title=title;
    	this.author=author;
    	this.price=price;
    }
    
    public  int getId() {
    	return this.book_id;
    }
    
    public void show() {
    	System.out.println(book_id+" "+title+" "+ author);
    }
    
    
	
	
	


	public static void main(String[] args) {
		
		
	 BooksInfo  list= new BooksInfo();
	 
	 
	 list.add_book(new Book(1,"aryan","234",23));
	 list.add_book(new Book(12,"sumit","123",123));
	 list.add_book(new Book(4,"sudanshu","123",145));
	 
	 list.show(4);
	 
	 
	 
	 
	 
		
		
	}

	}
