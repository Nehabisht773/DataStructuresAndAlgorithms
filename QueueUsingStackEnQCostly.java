package com.Oracle;

import java.util.Stack;

public class QueueUsingStackEnQCostly {

	static class Queue{
		static Stack<Integer> s1= new Stack<Integer>();
		static Stack<Integer> s2= new Stack<Integer>();

		
		static void enqueue(int data) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			
			s1.push(data);
			
			while (!s2.isEmpty())  
	        {  
	            s1.push(s2.pop());   
	        }  
		}
		
		static int dequeue() {
			if(s1.isEmpty()) {
				System.out.println("Q is Empty");
				return 00000;
			}
			
			int x=s1.peek();
			s1.pop();
			return x;
		}
	}
	
	public static void main(String[] args)  
	{  
	    Queue q = new Queue();  
	    Queue.enqueue(1);  
	    Queue.enqueue(2);  
	    Queue.enqueue(3);  
	  
	    System.out.println(Queue.dequeue());  
	    System.out.println(Queue.dequeue()); 
	    System.out.println(Queue.dequeue()); 
	    System.out.println(Queue.dequeue()); 

	}  
	
}
