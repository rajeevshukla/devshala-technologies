package com.dev.inner;

public class A {

	int x = 20;

	class B {
		
		int x=30;
		private void ab() {
			System.out.println("X = " + A.this.x);
			
		}
	}
	

	public void abc(){
		System.out.println("Ab c method of a class");
		
		this.x=40;
		this.new B().ab();
	}
	
	public static void main(String[] args) {

		A a = new A();

		B b = a.new B();

		b.ab();//
		a.abc();

	}
}
