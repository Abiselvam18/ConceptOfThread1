package com.pack;

public class AnnonymousClass {
	
	public static void main(String[] args) {
		//Anonymous class
		/*Thread tob=new Thread(){
		 * public void run(){
		 * System.out.println("Run Method");
		 * }
		 * };
		 * tob.start();
		 */
		
		//or
				new Thread() {
					public void run() {
						System.out.println("Run method");
					}
				}.start();
				
				//using Runnable interface
				Runnable rob=new Runnable() {
					public void run() {
						System.out.println("Runnable Run method");
					}
				};
				Thread tob1=new Thread(rob);
				tob1.start();
			}

		}

		
