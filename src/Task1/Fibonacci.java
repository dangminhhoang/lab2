package Task1;

public class Fibonacci {
	//get the nth value of the Fibonacci series
		public static int getFibonacci(int n) {
			if (n == 0) {
	            return 0;
	        } else if (n == 1 || n == 2) {
	            return 1;
	        }
		return getFibonacci(n-1)+getFibonacci(n-2);
		}
		// This method is used to display a Fibonaccci series based on the parameter n. Ex. n=10 ==> 0 1 1 2 3 5 8 13 21 34
		public static void printFibonacci(int n1) {
			for (int i = 0; i <= n1; i++) {
	            System.out.print(getFibonacci(i) + " ");
	        }
		}
	public static void main(String[] args) {
		int n =10;
		System.out.println(getFibonacci(n));
		printFibonacci(n);
	}
}
