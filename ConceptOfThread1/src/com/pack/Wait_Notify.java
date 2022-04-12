package com.pack;
//wait & notify method
class MyClass1 extends Thread{
	int total;
	public void run() {
		System.out.println("Inside run");
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				total=total+i;
			}
			notify();
		}
	}
	
}
public class Wait_Notify {
  public static void main(String[] args) throws InterruptedException {
	
	  MyClass1 ob=new MyClass1();
	  ob.start();
	  synchronized (ob) {
		  try {
			  System.out.println("Before Wait");
			  ob.wait();
			  System.out.println("After Wait");
			  System.out.println("Total="+ob.total);
			  
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
	  }
		
	}
}
