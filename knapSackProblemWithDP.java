package com.Oracle;

public class knapSackProblemWithDP {

	public static void main(String [] args) {
		int val[]= new int[]{20,60,120};
		int wt[]=new int[]{10,20,30};
		int W=50;
		int n=val.length;
		System.out.println(knapSackDP(W,wt,val,n));
	}
	
	public static int  knapSackDP(int W, int[] w, int[] val, int n) {
		int i,j;
		int[][] DP= new int[n+1][W+1];
		
		
		
		return 0;
	}
	
	
}
