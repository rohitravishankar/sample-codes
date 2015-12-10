/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decbin;

/**
 *
 * @author Sameera
 */
public class DecBin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum=0;
        for(int i=1;i<=1000000;i++){
            if(ispalin(String.valueOf(i)) && ispalin(Integer.toBinaryString(i))){
                //System.out.println("Decimal Value : "+i+" Binary Value : "+Integer.toBinaryString(i));
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    
    private static boolean ispalin(String mystr) {
        int n = mystr.length();
        for (int i = 0; i < n; i++) {
            if (mystr.charAt(i) != mystr.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;

    }
    
}
