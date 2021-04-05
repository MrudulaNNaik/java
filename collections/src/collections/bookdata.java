package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class bookdata {
	public static void main(String[] args) {
		Queue<book> queue=new PriorityQueue<book>();  
		
		book b1=new book(121,"Let us C","Yashwant Kanetkar","BPB",8);  
	    book b2=new book(233,"Operating System","Galvin","Wiley",6);  
	    book b3=new book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		
	    queue.add(b1);  
	    queue.add(b2);  
	    queue.add(b3);  
	      
	    
	    for(book b:queue){  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	        }  
	    
		
	}
	

}
