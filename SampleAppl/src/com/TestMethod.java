package com;

public class TestMethod {
	int a;
	public void testVal(int a) {
		a = this.a;
		if(a<18) {
			System.out.println("Not a valid age");
		}
		else {
			System.out.println("Valid age");
		}
	}
}
