package com.dev;

public class WideningImpl {



	public void ab(char x){

		System.out.println("in char");
	}
/*
	public void ab( byte x){
		System.out.println("in byte");

	}

	public void ab(short x){

		System.out.println("in short");

	}
*/
	/*public void ab(int x){

		System.out.println("in int");

	}*/

/*	public void ab(Integer x){

		System.out.println("in Integer");

	}
*/	
	public void ab( int...ar){
		System.out.println("in var arg");
	}

	
	public void ab(float x){

		System.out.println("in float");
	}


	public static void main(String... args) {
		WideningImpl impl=new WideningImpl();
		impl.ab(new int[]{2});
	}
}
