/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexographicallygreater;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sameerasy
 */
public class LexographicallyGreater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        while (a-- > 0) {
            String b = n.next();
            int beg = -1;
            int end = -1;
            for (int i = 0; i < b.length() - 1; i++) {
                if (b.charAt(i) < b.charAt(i + 1)) {
                    beg = i;
                }
            }
            if (beg == -1) {
                System.out.println("no answer");
                continue;
            }
            for (int i = beg + 1; i < b.length(); i++) {
                if (b.charAt(i) > b.charAt(beg)) {
                    end = i;
                }
            }
            StringBuilder sb = new StringBuilder(b);
            sb.setCharAt(beg, b.charAt(end));
            sb.setCharAt(end, b.charAt(beg));
            b = sb.toString();
            String c = b.substring(beg + 1);
            char[] my_arr = c.toCharArray();
            Arrays.sort(my_arr);
            c = new String(my_arr);
            int k = beg + 1;
            for (int i = 0; i < c.length(); i++) {
                sb.setCharAt(k++, c.charAt(i));
            }
            System.out.println(sb);
        }
    }
}
