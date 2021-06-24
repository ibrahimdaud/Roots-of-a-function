/*
* Program to find the root of x-cos(x)=0 accurate to 6
* decimal places so that abs(xnew-xold) < 0.000001
* using Newton-Raphson method

I need to find root of x-x^2
*/
package gui;

public class NewtonRaphson {
    
    public static void main(String[] args) {
        
        double xold, xnew, fxold, fdashxold, diff;
        int iteration;
        xold = 0.0;
        iteration = 0;
        
        do {
            iteration = iteration + 1;
            // determine f(xold) and f'(xold)
            fxold = xold - Math.cos(xold);
            fdashxold = 1.0 + Math.sin(xold);
            xnew = xold - (fxold / fdashxold);
            System.out.println("Approx for iteration " + iteration + "is " + xnew);
            diff = Math.abs(xnew - xold);
            xold = xnew;
        }
        while (diff > 0.000001);
        System.out.println("root to 6 d.p is " + xnew);
    }
}
