//Queens.java
//Alston Huang
//1471706
//PA5
//Finds all queen's permutations.

class Queens{
	public static void main(String[] args) {
		int[] array;
		int number, perms, counter = 0;

		if(args.length == 0)
			Usage();
		else if(args.length == 1) {
			if( args[0].equals("-v") )
				Usage();
			else{
				try{
					Integer.parseInt(args[0]);
					number = Integer.parseInt(args[0]);
					array = factorial(number);
					perms = maxPerms(number);
					for(int a = 0; a < perms; a++) {
						nextPermutation(array);
						if( isSolution(array) )
							counter++;
					}
					System.out.println(number + "-Queens has " + counter + " solutions.");
				}
				catch(NumberFormatException e) {
					Usage();
				}
			}
		}
		else if(args.length == 2) {
			if( args[0].equals("-v") ) {
				try{
					Integer.parseInt(args[1]);
					number = Integer.parseInt(args[1]);
					array = factorial(number);
					perms = maxPerms(number);
					for(int b = 0; b < perms; b++) {
						nextPermutation(array);
						if( isSolution(array) ){
							printArray(array);
							counter++;
						}
					}
					System.out.println(number + "-Queens has " + counter + " solutions.");
				}
				catch(NumberFormatException e1) {
					Usage();
				}
			}
			else
				Usage();
		}
		else if(args.length > 2)
			Usage();
	}

	static void nextPermutation(int[] B) {
		int pivot = 0, j = B.length - 1, k = B.length - 1;
		int successor = 0;

		for(int a = B.length - 1; a > 1; a--) {
			if(B[a] > B[a - 1]) {
				pivot = a - 1;
				break;
			}
		}
		if(pivot == 0) {
			reverseArray(B);
			 
		for(int b = k; b > 1; b--) {
			if(B[b] > B[pivot]){
				successor = b;
				break;
			}
		}
		swap(B, pivot, successor);
		for(int i = pivot + 1; i <= (B.length - 1 + pivot)/2; i++) {
			swap(B, i, j);
			j--;
		}
	}

	static boolean isSolution(int[] E) {
		int n = E.length - 1;
		int max, x, y;
		max = (n * (n-1))/2;

		if(max == 1)
			return false;

		for(x = 1; x < max; x++) {
			for(y = x - 1; y > 0; y++) {
				if( Math.abs(x-y) == Math.abs(E[x] - E[y]) ) {
					return false;
				}	
			} 
		}
		return true;
	}

	static void Usage() {
		System.out.println("Usage: Queens [-v] number");
		System.out.println("Option: -v verbose output, print all solutions");
		System.exit(1);
	}

	static int[] factorial(int n) { 
		int[] A = new int[n + 1];

		A[n] = n;
		for(int k = A.length - 2; k > 0; k--) {
			A[k] = n - 1;
			n = n - 1;
		}
		return(A);
	}

	static int maxPerms(int t){ //finds the max amount of combinations
		int max = 1;
		for(int i = 1; i <= t; i++){
			max = max * i;
		}
		return(max);
	}

	static void printArray(int[] A) {
		System.out.print("( ");
		for(int i=1; i<A.length; i++)
			if(i == A.length - 1)
				System.out.print(A[i] + " ");
			else
				System.out.print(A[i] + ", ");
		System.out.println(")");
	}

	static void reverseArray(int[] C) {
		for(int i = 1; i <= C.length/2; i++) {
			int temp = C[i];
			C[i] = C[C.length - i];
			C[C.length - i] = temp;
		}
	}

	static void swap(int[] D, int x, int y) {
		int temp, n = D.length;
			temp = D[x];
			D[x] = D[y];
			D[y] = temp;
	}
}
