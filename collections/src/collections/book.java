package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class book implements Comparable<book> {
	int id;  
	String name,author,publisher;  
	int quantity;  
	public book(int id, String name, String author, String publisher, int quantity) {  
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	}  
	public int compareTo(book b) {  
	    if(id>b.id){  
	        return 1;  
	    }else if(id<b.id){  
	        return -1;  
	    }else{  
	    return 0;  
	    }  
	}  
	}  
	

	

	

