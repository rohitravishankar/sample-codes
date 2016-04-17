/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;

import java.util.Scanner;

/**
 *
 * @author Sameera
 */
public class Encryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        try {
            Scanner in = new Scanner(System.in).useDelimiter("\\n");
            String ms = in.next();
            String s = ms.replaceAll(" ", "");
            double k = Math.sqrt(s.length());
            int len1 = (int) Math.floor(k);
            int len2 = (int) Math.ceil(k);
            int min = 999, r = 0, c = 0;
            int mk = 0, max;
            while (len1 * len2 < s.length()) {
                if (len1 < len2) {
                    len1++;
                } else if (len2 < k && len2 > len1) {
                    len2++;
                }
            }
            r = len1;
            c = len2;
            int j = 0, i = 0;
            char mychar[][] = new char[r][c];
            while (mk < s.length() && i < r) {
                mychar[i][j++] = s.charAt(mk++);
                if (j >= c) {
                    j = 0;
                    i++;
                }
            }
            String[] column = new String[r];
            for (i = 0; i < r; i++) {
                column[i] = String.valueOf(mychar[i]);
            }

            for (i = 0; i < c; i++) {
                for (j = 0; j < r; j++) {
                    char a = column[j].charAt(i);
                    int myval = a;
                    if (a >= 97 && a <= 122) {
                        System.out.print(column[j].charAt(i));
                    } else {
                        break;
                    }
                }
                if (i < c - 1) {
                    System.out.print(" ");
                } else {
                    break;
                }
            }
            System.out.println();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
