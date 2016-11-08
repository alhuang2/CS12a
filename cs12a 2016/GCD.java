// Alston's PA3
// Alston Huang
// alyehuan@ucsc.edu
// Progamming Assignment 3 
// Program asks user for 2 positive integers and finds the GCD of those two.
import java.util.Scanner;

class GCD{
 public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
   int a, b, temp;
   String statement;
   
   System.out.println("Enter a positive integer:");  
   while(true) {
      while( !sc.hasNextInt() ) {
         sc.next();
         System.out.println("Please enter a positive integer:");
      }
      a = sc.nextInt();
      if( a > 0) break;
   System.out.println("Please enter a positive integer:");
    }

    System.out.println("Enter another positive integer:");
   while(true) {
      while( !sc.hasNextInt() ) {
         sc.next();
      }
      b = sc.nextInt(); 
      if(b > 0) break;
   System.out.println("Please enter a positive integer: ");
   }

   statement = "The GCD of " + a + " and " + b + " is ";

   if(a > b) {
      temp = a % b;
      if(temp == 0) {
         System.out.println(statement + b);
      }
      else{
         while(temp > 0) {
            temp = a % b;
            a = b;
            b = temp;
            if(temp == 0) {
               System.out.println(statement + a);
            }
         }
      }
   }
   else{
      temp = b % a;
      if(temp == 0) {
         System.out.println(statement + a);
      }
      else {
         while(temp > 0) {
            temp = b % a;
            b = a;
            a = temp;
            if(temp == 0) {
               System.out.println(statement + b);
            }
         }
      }
   }
}
}