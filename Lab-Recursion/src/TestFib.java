
public class TestFib {
	
	public static void main(String[] args) {
		Fib fib = new Fib();
		
		int result = fib.fibonacci(2);
		System.out.println(result);
		
		int result1 = fib.fibonacci(5);
		System.out.println(result1);
		
		int result2 = fib.fibonacci(9);
		System.out.println(result2);
	}
}
