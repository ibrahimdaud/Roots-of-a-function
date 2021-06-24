/*
* Program to find the root of x-cos(x)=0 accurate to 6 decimal places so
* that abs(xupper-xlower)/2 < 0.000001 using Bisection method. Assumes that
* f(xlower) and f(xupper) have different signs to start with.
*/
package gui;

public class Bisection {
    
    public static void main(String[] args) {
        
        double xlower, xupper, xnew, fxlower, fxupper, fxnew, diff;
        int iteration;
        xlower = 0.0;
        fxlower = xlower - Math.cos(xlower);
        xupper = 1.0;
        fxupper = xupper - Math.cos(xupper);
        iteration = 0;
        
        do {
            iteration = iteration + 1;
            // determine xnew and f(xnew)
            xnew = (xlower + xupper) / 2.0;
            fxnew = xnew - Math.cos(xnew);
            System.out.println("Approx for iteration " + iteration + "is " + xnew);
            diff = Math.abs(xupper - xlower) / 2;
            if (fxlower * fxnew > 0) {
                xlower = xnew;
                fxlower = fxnew;
            }
            else if (fxupper * fxnew > 0) {
                xupper = xnew;
                fxupper = fxnew;
            }
        }
        while (diff > 0.000001);
        System.out.println("root to 6 d.p is " + xnew);
    }
}
