/*
* Program to find the root of x-cos(x)=0 accurate to 6
* decimal places so that abs(xnew-xold) < 0.000001
* using Secant method
*/
package gui;

public class Secant {
    
    public static void main(String[] args) {
        
        double xold1, xold2, xnew, fxold1, fxold2, diff;
        int iteration;
        xold1 = 0.0;
        xold2 = 0.5;
        iteration = 0;
        
        do {
            iteration = iteration + 1;
            // determine f(xold1) and f(xold2)
            fxold1 = xold1 - Math.cos(xold1);
            fxold2 = xold2 - Math.cos(xold2);
            xnew = xold1 - (fxold1 * (xold1 - xold2) / (fxold1 - fxold2));
            System.out.println("Approx for iteration " + iteration + "is " + xnew);
            diff = Math.abs(xnew - xold1);
            xold2 = xold1;
            xold1 = xnew;
        }
        while (diff > 0.000001);
        System.out.println("root to 6 d.p is " + xnew);
    }
}
