package powerOf2;

public class Driver {

	public static void main(String[] args) {

		System.out.println(palin(989));
	}

	
	public static boolean powerOf2(int n){
		System.out.println(n);
		if(n < 1){
			return false;
		}else if(n ==1 ){
			return true;
		}else if(n % 2 != 0){
			return false;
		}else{
			return powerOf2(n / 2);
		}
	}
	
	public static boolean powerOf2Easier(int n){
		if(n <= 0){
			return false;
		}
		
		return ((n&(n-1)) ==0);
	}
	
	public static boolean palin(int a){
		int holder = a;
		int test = 0;
		
		while(holder > 0){
			int b = holder % 10;
			test = test * 10;
			test += b;
			
//			holder = holder - (holder % 10);
			holder = holder / 10;
			
		}
		return (a == test);
	}
}
