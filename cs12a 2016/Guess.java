// Alston's PA2
// Alston Huang
// alyehuan@ucsc.edu
// Progamming Assignment 2
// Program interacts with user through a guessing game

import java.util.Scanner;

class Guess{
 public static void main(String[] args){
 	Scanner sc = new Scanner(System.in);
 	int x, y, z, guess ;
 	guess = (int) (Math.random() * 10) + 1;

 	System.out.println("\nI'm thinking of an integer in the range 1 to 10. You have three guesses.");
	System.out.print("\nEnter your first guess:");
 	
 	x = sc.nextInt();
 	if (x == guess) {
 		System.out.println("You win!");
 		System.exit(0);
 	}
 		else if (x < guess) {
 		System.out.println("Your guess is too low.");
 	}
 		else if (x > guess) {
 		System.out.println("Your guess is too high.");
 	} 

 	System.out.print("\nEnter your second guess:");
 	y = sc.nextInt();
	if (y == guess) {
 		System.out.println("You win!");
 		System.exit(0);
 	}
 		else if (y < guess) {
 		System.out.println("Your guess is too low");
 	}
 		else if (y > guess) {
 		System.out.println("Your guess is too high");
 	}

 	System.out.print("\nEnter your third guess:");
 	z = sc.nextInt();
	if (z == guess) {
 		System.out.println("You win!");
 		System.exit(0);
 	}
 		else if (z < guess) {
 		System.out.println("Your guess is too low");
 	}
 		else if (z > guess) {
 		System.out.println("Your guess is too high");
 	}

 	System.out.println("\nYou lose. The number was " + guess);
 }
}

