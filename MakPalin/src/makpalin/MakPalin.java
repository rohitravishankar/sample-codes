/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makpalin;

import java.util.Scanner;

/**
 *
 * @author Pavan
 */
public class MakPalin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String mystr = scan.next();
        int len = mystr.length();
        int i;
        i = retindex(mystr);
        //System.out.println(i);
        while (ispalin(mystr, len)) {
              mystr = mystr.charAt(i)+mystr;
              i+=2;
            //System.out.println(mystr.charAt(i)+" "+mystr);
            len = mystr.length();
        }
        System.out.println(mystr);
    }

    private static boolean ispalin(String mystr, int n) {
        for (int i = 0; i < n; i++) {
            if (mystr.charAt(i) != mystr.charAt(n - 1 - i)) {
                return true;
            }
        }
        return false;

    }

    private static int retindex(String mystr) {
        int k=1,max=1;
        for(int i=0;i<mystr.length();i++){
            k=checkpalin(i,mystr.substring(0, i));
            if(k>max){
                max=k;
            }
        }
        return max;
    }

    private static int checkpalin(int j, String mystr) {
        int count=0;
        //System.out.println(mystr);
        for(int k=0;k<j;k++){
            if(mystr.charAt(k)== mystr.charAt(j-k-1)){
                count++;
            }
            else
            {
                count=0;
            }
        }
        return count;
    }

}


