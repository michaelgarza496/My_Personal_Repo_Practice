package com.mikesimagination;

public class Driver {

	{
		System.out.println("Just a block in the Driver class");
	}
	public static void main(String[] args) {

		{
			System.out.println("Just a block in the main method");
		}
		
		new Driver();
		/*
		 * Don't need to cast if it's a subtype
		 * 
		 * Doesn't matter the reference. Whatever the object is, that's the method that's going to print
		 */
		C c = new C();
		System.out.println("int a = " + c.a);
		System.out.println(c);
		
		B b = c;
		System.out.println("int a = " + b.a);
		System.out.println(b);
		
		A a = c;
		System.out.println("int a = " + a.a);
		System.out.println(a);
		
		b = (B) a;
		System.out.println("int a = " + b.a);
		System.out.println(b);
		
		
		
		/*
		 * Can't cast a parent object to subclass on the second block
		 */
		a = b = c = null;
		a = new A();
		System.out.println("int a = " + a.a);
		System.out.println(a);
		
		b = (B) a;
		System.out.println("int a = " + b.a);
		System.out.println(b);
		
		
		
	}
	static{
		System.out.println("A static block");
	}
	
}

class A{
	int a = 0;
	
	
	@Override
	public String toString() {
		return "Inside Class A";
	}
}

class B extends A{
	int a = 1;
	
	@Override
	public String toString() {
		return "Inside Class B";
	}
}

class C extends B{
	int a = 2;
	
	@Override
	public String toString() {
		return "Inside Class C";
	}
}
