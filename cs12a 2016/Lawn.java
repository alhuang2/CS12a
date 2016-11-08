// Lawn.java
// Alston Huang
// alyehuan@ucsc.edu
// Program Assignment 1
// A program that interacts with the user to calculate area and mowing rate of a lawn.
import java.util.Scanner; 

class Lawn{
   public static void main( String[] args ){
      double length, width, length1, width1, area, area1, area2, mowingrate, sec;
      int h, m, s;
      String str;
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the length and width of the lot, in feet: ");
      length = sc.nextDouble();
      width = sc.nextDouble();
      area1 = width*length;
      System.out.print("Enter the length and width of the house, in feet: ");
      length1 = sc.nextDouble();
      width1 = sc.nextDouble();
      area2 = width1*length1;
      area = area1 - area2;
      System.out.print("The lawn area is: ");
      System.out.println(area);
      
      System.out.print("Enter the mowing rate, in square feet per second: ");
      mowingrate = sc.nextDouble();
      sec = area/mowingrate;
      s = (int) Math.round(sec);
      m = s/60;
      s = s%60;
      h = m/60;
      m = m%60;

      str = ( h==1 ? "singular" : "plural");
      str = ( m==1 ? "singular" : "plural");
      str = ( s==1 ? "singular" : "plural");
      
      System.out.println("The mowing time is " + 
            h + " hour" + ( h==1 ? " " : "s ") + 
            m + " minute" + ( m==1? " " : "s ") + "and " + 
            s + " second" + (s==1? "." : "s.")
            );
   }
}
