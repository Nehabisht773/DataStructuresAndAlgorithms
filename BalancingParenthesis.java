package com.Oracle;

public class BalancingParenthesis {

	public static void main(String [] args) {
		
		char exp[]= {'{','(','(','}','[',']'};
		if(areParenthesesBalanced(exp)) {
			System.out.println("Balanced");
		}
		else
			System.out.println("Not Balanced");
	}
	
	
	
	static class Stack{
		
		
		int top=-1;
		char[] items=new char[100];
		
		void Push(char x) {
			if(top==100) {
				System.out.println("Stack is Full");
			}
			else
				items[++top]=x;
		}
		
		
		
		char Pop() {
			if(top==-1) {
				System.out.println("Stack is Empty");
					return '\0'	;			
			}
			else {
				char element= items[top];
			     top--;
			     return element;
			}
		}
		
		
		boolean isEmpty(){
			return (top==-1)?true:false;

		}
		
	}
	
	
	
	static boolean areParenthesesBalanced(char exp[] ) {
		Stack st= new Stack();
		
		for(int i=0;i<exp.length;i++) {
			if(exp[i]=='{'|| exp[i]=='('||exp[i]=='[') {
				st.Push(exp[i]);
			}
			
			if(exp[i]=='}'|| exp[i]==')'||exp[i]==']') {
			if(st.isEmpty()) {
				return false;
			}
			else if (!isMatchingPair(st.Pop(),exp[i])) {
				return false;
			}
			}
		}
		
		if (st.isEmpty()) 
	         return true; /*balanced*/
	       else
	         {   /*not balanced*/
	             return false; 
	         } 
	}



	private static boolean isMatchingPair(char char1, char char2) {
		if(char1=='('|| char2==')') {
			return true;
		}
		else if(char1=='{' || char2=='}') {
			return true;
		}
		else if(char1=='['|| char2==']') {
			return true;
		}
		else
			return false;
	}
}
