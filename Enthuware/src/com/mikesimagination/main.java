package com.mikesimagination;

public class main {

	public static void main(String[] args) {

		A a = new C();
		
		System.out.println(a.a);
		
	}

}

class A{int a = 10;}
class B extends A{
	int a = 20;
	
	public void hello(){
		System.out.println("Hello B");
	}


}
class C extends B{int a = 30; public void hello(){System.out.println("Hello C");} }
