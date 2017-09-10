
public class Driver {

	public static void main(String[] args) {
		
		try{
			throw new Exception();
		}catch(Exception e){
			System.out.println("The catch block");
		}finally{
			System.out.println("The finally block");
		}
		
		System.out.println("test() ==> " + test());
		new Driver().test2();
	}
	
	public static int test(){
		try{
			throw new Exception();
		}catch(Exception e){
			return 1;
		}finally{
			return 2;
		}
//		System.out.println("hello"); can't reach this code
	}
	
	public void test2(){
		try{
			throw new Exception();
		}catch(Exception e){
			System.out.println("test2 catch");
		}finally{
			System.out.println("test2 finally");
		}
		System.out.println("done with test2");
	}
}
