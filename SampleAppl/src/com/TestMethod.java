package com;

public class TestMethod {
	int a;
	public void testVal(int a) {
		a = this.a;
		if(a<10) {
			System.out.println("Incorrect data");
		}
		else {
			System.out.println("Valid Data");
		}
	}
}
