/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longsubstr;

import java.util.Scanner;

/**
 *
 * @author Sameera
 */
public class LongSubstr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n = new Scanner(System.in);
        FindLng f = new FindLng(n.next());
        f.mysub();
        System.out.println(f.getCr()+" "+f.getMaxcount());
    }
    
}
