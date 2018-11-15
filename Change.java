class Change{
	public static void main(String[] args){
		double due=0, paid=0, change;
		int dollar = 0, quarters=0, dimes=0, nickels=0, pennies=0;

		if(args.length == 0 || args.length == 1)
			Usage();
		try{
			due = Double.parseDouble(args[0]);
			paid = Double.parseDouble(args[1]);
		}
		catch(NumberFormatException e) {
			Usage();
		}
		if(paid - due < 0){
			Usage();
			System.exit(0);
		}

		/*due = due * 100;
		paid = paid * 100;

		change = paid - due;

		dollar = change / 100;
		change = (change - (100 * dollars));

		quarters = change / 25;
		change = (change - (25 * quarters));

		dimes =
		change =

		nickels =
		change =

		pennies =
		change =
		*/

		System.out.println("YOU DO IT YOURSELF NOW");


	}

	static void Usage(){
		System.out.println("Wrong usage of command." +
			"Please enter java Change -amountdue- -amountpaid-");
	}
}