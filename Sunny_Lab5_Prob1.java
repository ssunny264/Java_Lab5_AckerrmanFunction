/*
 * Sara Sunny
 * Lab 5 - Problem 1 - Ackerrman Function
 */
package sunny_lab5_prob1;

/**
 *
 * @author slbru
 */
 import java.util.Scanner;

public class Sunny_Lab5_Prob1 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        
       int m, n = 0;
       
       System.out.println("Enter first value: ");
       m = in.nextInt();
       System.out.println("Enter second value: ");
       n = in.nextInt();
       
       System.out.println(Ack(m, n));
    }
    public static int Ack (int m, int n) {
        
        if (m==0) {
            return n+1;
        }
        else if (n==0) {
            return Ack(m - 1, 1);
        }
        else {
            return Ack (m - 1, Ack(m, n -1));
        }
    }
}
