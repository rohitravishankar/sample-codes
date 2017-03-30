/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strbomber;

import java.util.Scanner;

/**
 *
 * @author sameerasy
 */
public class StrBomber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // your code goes here
        Scanner n = new Scanner(System.in);
        String s = n.next();
        for (int i = 0; i < s.length(); i++) {
            int j = i;
            int count = 1;
            while (++j < s.length() && s.charAt(j) == s.charAt(i)) {
                count++;
            }
            if (count >= 3) {
                s = s.replace(s.substring(i, i + count), "");
                if (i > 2) {
                    i -= 3;
                } else if (i > 1) {
                    i = -1;
                }
            }
        }
        System.out.println(s);
    }
}
