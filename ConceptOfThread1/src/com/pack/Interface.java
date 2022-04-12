package com.pack;

interface MyInt{
	void add(); 
	void sub(); 
}

public class Interface {

	public static void main(String[] args) {
		//local inner anonymous class
		MyInt ob=new MyInt() {

			@Override
			public void add() {
				System.out.println("add");
				
			}

			@Override
			public void sub() {
				System.out.println("sub");
				
			}
		
		};
		ob.add();
		ob.sub();

	}

}
