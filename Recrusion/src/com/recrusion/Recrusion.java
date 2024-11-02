package com.recrusion;
/*calling a same mathod of function
   have a two thing 
   1.base case condition (terminating condition )
   2.recursive call
let's see with example*/

public class Recrusion {
	// print 1 to 
	public static void printNumbers(int n) {
		if (n<=0) {// base case condition 
			return;
		}else {
			printNumbers(n-1);// recursive call 
			System.out.println(n);
		}
		
		
	}
	// find factorial
	public static int fact(int N) {
		int result=0;
		if (N<=1) {// base case condition
			return 1 ;
		}
		else {
			result = N*fact(N-1);// recursive call 
		}
		return result;
		
		
	}

	  public static void main(String[] args) {
		  printNumbers(10);
		  // facttorial
		  System.out.println(fact(5));
		
	}
		
}

