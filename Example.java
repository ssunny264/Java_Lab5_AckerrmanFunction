/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunny_lab5_prob1;

/**
 *
 * @author slbru
 */
import java.util.StringTokenizer;

public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringTokenizer ex = new StringTokenizer("A single word can be critical.");
        int count = 0;
        
        while (ex.hasMoreTokens()){
            System.out.println(ex.nextToken());
            count++; 				//counter to gain the number of items in the string
        }
        System.out.println(count);
    }
    
}
