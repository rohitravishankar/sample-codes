/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disprifact;

/**
 *
 * @author Sameera
 */
public class DisPriFact {

    static String myprime = "";
    static int lastnum=50000, mcount = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 3;
        while (i < lastnum) {
            findprim(i);
            i++;
        }

    }

    private static void findprim(int i) {
        int k = 2, count = 0;
        String str = "";
        while (k != i) {
            if (i % k == 0 && isprime(k)) {
                str = str + " " + k;
                count++;
                if (count == 4) {
                    myprime = myprime + " " + i;
                    System.out.println(i+" "+str);
                    mcount++;
                }
            }
            k++;
        }
    }

    private static boolean isprime(int k) {
        for (int i = 2; i <= k / 2; i++) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }

}
