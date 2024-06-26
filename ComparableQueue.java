package network;

import java.util.Comparator;
import java.util.PriorityQueue;


	class Packet implements Comparable<Packet> {
	    private String s1;
	    private int priority;

	    public Packet(String s1, int priority) {
	        this.s1 = s1;
	        this.priority = priority;
	    }

	    public String gets1() {
	        return s1;
	    }

	    public int getPriority() {
	        return priority;
	    }

	    @Override
	    public int compareTo(Packet other) {
	        return Integer.compare(this.priority, other.priority);
	    }
	}

	public class ComparableQueue {

	    public static void main(String[] args) {
	       
	        Comparator<Packet> comparator = new Comparator<Packet>() {
	        	
	            @Override
	            public int compare(Packet p1, Packet p2) {
	                return Integer.compare(p1.getPriority(), p2.getPriority());
	            }
	        };

	        PriorityQueue<Packet> priorityQueue = new PriorityQueue<>(comparator);

	  
	        priorityQueue.add(new Packet("Static Routing", 1));
	        priorityQueue.add(new Packet("Dynamic Routing", 1));
	        priorityQueue.add(new Packet("Default Routing", 3));
	        priorityQueue.add(new Packet("OSPF Routing", 3));
	        priorityQueue.add(new Packet("BGP Routing", 2));
	        priorityQueue.add(new Packet("IGP Routing", 2));

	        System.out.println("Packets on priority:");
	        while (!priorityQueue.isEmpty()) {
	            System.out.println(priorityQueue.poll().gets1());
	        }
	    }
	}

