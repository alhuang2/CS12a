class Fib {
	public static void main(String[] args) {
		//System.out.println(fib(5));
		problem7(100);
	}

	static int fib(int n){
			if (n==1) return 1;
			else if(n==2) return 1;
			else{
				return fib(n-2) + fib(n-1);
			}
			}
	static void problem7(int n){
		if(n>0) {
			if(n/8 > 0) {
				problem7(n/8);
			}
			System.out.println(n%8);
		}
	}
}












