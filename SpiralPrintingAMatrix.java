package com.Oracle;

public class SpiralPrintingAMatrix {

	public static void main(String [] args) {
		int row=3;
		int column=6;
		int k=0,l=0;
		int i=0;
		int[][] arr2D= { { 1, 2, 3, 4, 5, 6 }, 
                { 7, 8, 9, 10, 11, 12 }, 
                { 13, 14, 15, 16, 17, 18 } }; 		
		
		while(k<row&& l<column) {
			
				for(i=l;i<column;i++) {
					System.out.println(" "+arr2D[k][i]);
			}
			k++; //Take row 2nd 
		     for(i=k;i<row;i++) {
		    	 System.out.println(" "+arr2D[i][column-1]);
		     }
		    column--;
		    if(k<row) {
		    	for(i=column-1;i>=l;i--) {
		    		System.out.println(" "+arr2D[row-1][i]);
		    	}
		    	row--;
		    }
		    if(l<column) {
		    	for(i=row-1;i>=k;i--) {
		    		System.out.println(" "+arr2D[i][l]);
		    	}
		    	column++;
		    }
		     
		}
		
	}
	
	
}
