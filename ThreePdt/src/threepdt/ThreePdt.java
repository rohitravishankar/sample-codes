/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threepdt;

/**
 *
 * @author Sameera
 */
public class ThreePdt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fnum, snum ,mf=0,ml=0;
        int pdt,max=1;
        for (fnum = 999; fnum > 100; fnum--) {
            for (snum = 999; snum > 100; snum--) {
                pdt = snum * fnum;
                String s = Integer.toString(pdt);
                if (ispalin(s)){
                    //System.out.println(pdt+" "+fnum+" "+snum);
                    if(pdt>max){
                        max=pdt;
                        mf=fnum;
                        ml=snum;
                    }
                }
            }
        }
        System.out.println("Product is: "+max+" Numbers are : "+mf+" and "+ml);
        
        

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
