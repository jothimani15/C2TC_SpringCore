package com.tnsif.IOC;

public class Airtel implements Mobile {
	
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("call from airtel");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("internet from airtel");
	}


}
