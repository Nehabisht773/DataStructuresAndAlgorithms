package com.Oracle;

import java.util.LinkedList;
import java.util.Stack;
public class Test {

	
	/*
	 * public static void foo() { throw new RuntimeException(); }
	 * 
	 * public static void main(String [] args) { foo(); }
	 */
	public static void main(String [] args) {
	LinkedList<Box> we= new LinkedList<>();
	Stack<Box> anotherList= new Stack<>();
	Box a= new Box(5.1f,"India");
	Box b= new Box(7.1f,"Japan");
	we.add(a);
	we.add(b);
	
	anotherList.push(a);
	anotherList.push(b);
	System.out.println(we.poll().equals(anotherList.pop()));
	
	}
	 
}


