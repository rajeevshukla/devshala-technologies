package com.dev;


public class WrapperImpl {

	    public static void main(String[] args) {

	    	
	    	 Integer integer=2; //auto boxing
	    	  
          integer++;  //auto unboxing is going , autoboxing is going on. 
	    	 /*int temp=integer.intValue();
	    	 integer=new Integer(++temp);
	    	 */
	    	   System.out.println(integer);
	          int x=integer.intValue(); //unboxing 
	          int y =integer;  //int y = integer.intValue();

	          
	          
	          
	          
	           Integer i=200;
	          Integer i2=200;
	
	          System.out.println(i==i2);
	          System.out.println(i.equals(i2)); 
	          
	          Integer integer2=new Integer("2"); //String to Object 
	          
	           int ab= Integer.parseInt("2");
	           
	           
	           System.out.println("Binary : "+  Integer.parseInt("1010110", 2));
               System.out.println(Integer.toBinaryString(200));		                
	    
	     
                byte b =127;
                int x2=b;
                  x2=809890;
                byte c=(byte)x2;
	        System.out.println("value of c ="+c);
               
	    } 
	    
	    
}
