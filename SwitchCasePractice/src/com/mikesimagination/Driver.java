package com.mikesimagination;

public class Driver {

	public static void main(String[] args) {
//
//		int k = 6;
//		
//		switch(k){
//		
//		case 5: System.out.println("!");
//		default: System.out.println("hello"); // this will print if no values are found 
//											  // no matter where it's placed
//		case 0: System.out.println("world");
//		break;
//		}
//		
//			char z = 0;
//			System.out.println(0 + " ==> " + (z));
//			z = 1;
//			System.out.println(0 + " ==> " + (z));
	
			System.out.println(wh("reception"));
			
	}
	
	public static String wh(String s){
		String s1 = s.substring(0,1);
		String s2 = s.substring(1,s.length()-1);
		String s3 = s.substring(s.length()-1);
		
		if(s.length() <= 3){
			return s3 + s2 + s1;
		}else{
			return s1 + wh(s2) + s3;
		}
		
	}
	

}
//
//class A{
//	static int x = 10;
//	
//	public A(int x){
//		this.x = x;
//	}
//}