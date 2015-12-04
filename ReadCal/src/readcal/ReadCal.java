/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readcal;

/**
 *
 * @author Sameera
 */
public class ReadCal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        MyCal m = new MyCal();
        System.out.println(m.letMeCal());
        long time = System.currentTimeMillis() - start;
        System.out.println("Code took " + time + " milliseconds");

       // 
    }
    
}
