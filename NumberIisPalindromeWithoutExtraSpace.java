package com.Oracle;

public class NumberIisPalindromeWithoutExtraSpace {

	public static void main(String [] args) {
		
	int n;
	n=31211213;
	int temp=isPalindrome(n);
	System.out.println(temp);
	if(temp==n) {
		System.out.println("YES!!!");
	}
	else
		System.out.println("NO:(");
		
		
	}

   static int isPalindrome(int n) {
	
	   int temp=0;
	   int r;
	   while(n>0)
	   {
		   r=n%10;
		   n=n/10;
		   temp=temp*10+r;
	   }
	
	return temp;
}
	
}
