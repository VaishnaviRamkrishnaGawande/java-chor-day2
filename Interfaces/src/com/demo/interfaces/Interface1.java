package com.demo.interfaces;

public interface Interface1 {
      void m1();
      int m2(int x);
      public static int Factorial(int n) {
    	  int f=1;
    	  for(int i=2;i<n;i++) {
    		  f=f*i;
    	  }
		return f; 
      }
     default int Permutation(int n,int r) {
    	  System.out.println("method of Permutation");
    	  int a=Factorial(n)/Factorial(n-r);
         return a;
      }
     default int Combination(int n,int r) {
    	  System.out.println("method of Combination");
    	  int b=Factorial(n)/Factorial(n-r)*Factorial(r);
    	  return b;
      }
      
}
