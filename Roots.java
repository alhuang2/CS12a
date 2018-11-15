// Roots.java
// Alston Huang
// 1471706
// pa4
// Finds the roots of a polynomial in a given range.
//

import java.util.*;

class Roots {
    public static int degree, coef;
    public static double[] diffArray, poly;

    public static void main( String[] args ){
        double resolution = 0.01, tolerance = 0.0000001, threshold = 0.001;
        double a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the degree: ");
        degree = sc.nextInt();
        coef = degree + 1;
        System.out.print("Enter " + coef + " coefficients: ");
        double[] C = new double[coef]; 
        for(int i = 0; i < coef; i++) {
            C[i] = sc.nextDouble();
        }
        System.out.print("Enter the left and right endpoints: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        
        double[] diff = new double[coef];
        diff = diff (C);
        int counter = 0;
        for (double i = a; i < b; i+= resolution){
            if(poly(C,i)* poly(C,i+resolution) < 0) 
            
            {
                double root = findRoot(C,i,i+resolution,tolerance);
                counter++;
                System.out.printf("Root found at: %.5f\n", root);
                continue;
            }
           
            else if (i+resolution>=b && counter == 0)
            {
                System.out.println("No roots were found in that range.");
            }
        }
         
    }
    
    static double poly(double[] C, double x)
    {
        double sum = 0;
        for (int i = 0; i < C.length; i++)
        {
            sum = C[i]*(Math.pow(x, i) )+ sum;
        }
        return sum;
    }

    static double[] diff(double[] C){ 
        int e = C.length - 1;
        double diffArray[] = new double[e];
        for (int i = 0; i < C.length-1; i++)
        {
            diffArray[i] = (i+1)*C[i+1];
        }
        return(diffArray);
    }

    static double findRoot(double[] C, double a, double b, double tolerance){
        double mid = a;
        while ( (b - a) > tolerance ) {
            mid = (a + b) / 2.0;
            if (poly(C, a)*poly(C,mid) < 0) {
                b = mid;
            }
            else
                a = mid;
        }
        return mid;
    }
}