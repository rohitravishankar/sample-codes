/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibcheck;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Sameera
 */
public class FibCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        BigInteger zero=new BigInteger("0");
        BigInteger one=new BigInteger("1");
        int j=2;
        
            int index = scan.nextInt();
            if(index==0){
                System.out.println("0");
                System.exit(0);
            }
            if(index==1){
                System.out.println("1");
                System.exit(0);
            }
            String check = String.valueOf(index);
            BigInteger treshold = new BigInteger(check);
            while(true){
                one = zero.add(one);
                zero = one.subtract(zero);
                String chec = String.valueOf(one);
                if(chec.equals(check)){
                    System.out.println(j);
                    break;
                }
                j++;
                if(one.compareTo(treshold)==1){
                    System.out.println("Number Doesn't exist in series");
                    System.exit(0);
                }
            }
        }
    }

    

