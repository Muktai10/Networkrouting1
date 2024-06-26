package network;

import java.util.PriorityQueue;
import java.util.Comparator;

public class NaturalOrder {

	 public static void main(String[] args) {
	        PriorityQueue<String> naturalOrderQueue = new PriorityQueue<>();
	          
	       
	        naturalOrderQueue.add("Static Routing"); 
	        naturalOrderQueue.add("Dynamic Routing"); 
	        naturalOrderQueue.add("Default Routing"); 
	        naturalOrderQueue.add("OSPF Routing"); 
	        naturalOrderQueue.add("BGP Routing"); 
	        naturalOrderQueue.add("IGP Routing"); 

	   
	        System.out.println("Natural order");
	        while (!naturalOrderQueue.isEmpty()) {
	            System.out.println(naturalOrderQueue.poll());
	        }
	        
	        //  reverse order  
	        PriorityQueue<String> reverseOrderQueue = new PriorityQueue<>(Comparator.reverseOrder());
	        reverseOrderQueue.add("Static Routing");
	        reverseOrderQueue.add("Dynamic Routing");
	        reverseOrderQueue.add("Default Routing");
	        reverseOrderQueue.add("OSPF Routing");
	        reverseOrderQueue.add("BGP Routing");
	        reverseOrderQueue.add("IGP Routing");
	        
	       
	        System.out.println("Reverse order");
	        while (!reverseOrderQueue.isEmpty()) {
	            System.out.println(reverseOrderQueue.poll());
	        }
	    }
	}

