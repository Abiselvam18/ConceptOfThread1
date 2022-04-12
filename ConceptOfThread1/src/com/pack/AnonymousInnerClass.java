package com.pack;

abstract class MyAbstract{
	public abstract void add();
	public abstract void sub();
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		//Anonymous inner class
		//can be applied to abstract class or interface
		MyAbstract ob=new MyAbstract() {

			@Override
			public void add() {
				System.out.println("Add method");
				
			}

			@Override
			public void sub() {
				System.out.println("Subtract method");
				
			}
			
		};
		ob.add();
		ob.sub();
		

	}

}
