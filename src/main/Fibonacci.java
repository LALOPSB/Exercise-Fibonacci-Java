package main;

public class Fibonacci {
	

	public Fibonacci() {
	}

	public Object returnFibonacci(int position) {
		int res = 0;
		int aux = 1;
		for (int i=1; i<=position; i++) {
			res = res + aux;
			aux = res - aux;
		}
		return res;
	}

}
