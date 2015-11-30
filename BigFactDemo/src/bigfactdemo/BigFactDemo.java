/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigfactdemo;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Sameera
 */
public class BigFactDemo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        BigInteger fact=new BigInteger("1");
        int n = scan.nextInt();
        for(int i=n;i>1;i--){
                BigInteger k = new BigInteger(String.valueOf(i));
                fact = fact.multiply(k);
            }
        System.out.println(fact);
    }
    
}
