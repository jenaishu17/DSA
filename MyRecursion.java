package day7;

public class MyRecursion {
	public static int sample(int n) {
		if(n>0) {
			n=n+sample(n-1);
		}
		return n;
	}
	public static int fibonacci(int n) {
		if(n<=0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void printFib(int n) {
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println(); 
    }
	public static void main(String args[]) {
		System.out.println(sample(5));
		System.out.println(fibonacci(6));
		printFib(6);
		
	}

}
