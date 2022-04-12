package com.pack;

class OuterClass{
	int i;
	private class InnerClass{
		int varinner;
		InnerClass(){
			varinner=10;
		}
		void method_inner() {
			System.out.println("Innerclass Method "+varinner);
			System.out.println("outer class variable i "+i);
		}
	}//inner class end
	
	void outer_method() {
		InnerClass ob=new InnerClass();
		ob.method_inner();//call inner class method
		
	}
}


public class NestedClass {

	public static void main(String[] args) {
		OuterClass ob=new OuterClass();
		ob.outer_method();

	}

}
