/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findpages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author sameerasy
 */
public class FindPages {

    /**
     * @param args the command line arguments
     */
    static int my_score = 0;

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner n = new Scanner(System.in).useDelimiter("\\n");
        ArrayList<String> ar = new ArrayList<>();
        int my_var = 1;
        while (n.hasNext()) {
            String a = n.next();
            if (a.startsWith("P")) {
                ar.add(a);
                if (a.split(" ").length - 1 > my_score) {
                    my_score = a.split(" ").length + 1;
                }
            } else if (a.startsWith("Q")) {
                String res = "";
                String[] a_res = a.split(" ");
                if (a_res.length > 2) {
                    System.out.println("Q" + (my_var++) + " : " + sumPriorities(a_res, ar, my_score - 1));
                } else {
                    for (int i = 1; i < a_res.length; i++) {
                        res += printPriority(a_res[i], ar, my_score - i);
                    }
                    System.out.println("Q" + (my_var++) + " : " + res);
                }
            }
        }
    }

    private static String printPriority(String a, ArrayList<String> ar, int my_score) {
        Map<Integer, String> hm = new TreeMap<>(Collections.reverseOrder());
        int i = 1;
        for (String b : ar) {
            String[] my_arr = b.split(" ");
            for (int j = 1; j < my_arr.length; j++) {
                if (a.equals(my_arr[j])) {
                    if (hm.get(my_score * (my_score - j + 1)) == null) {
                        hm.put(my_score * (my_score - j + 1), "P" + String.valueOf(i));
                    } else {
                        hm.put(my_score * (my_score - j + 1), hm.get(my_score * (my_score - j + 1)) + " P" + String.valueOf(i));
                    }
                }
            }
            i++;
        }
        String res = "";
        for (int g : hm.keySet()) {
            res += " " + hm.get(g);
        }
        return res;
    }

    private static String sumPriorities(String[] a, ArrayList<String> ar, int weights) {
        Map<Integer, String> hm = new TreeMap<>(Collections.reverseOrder());
        int g = 1;
        for (String b : ar) {
            int m = weights;
            int sum = 0;
            String p = "";
            for (int i = 1; i < a.length; i++) {
                if (b.contains(a[i])) {
                    sum += posAtA(a[i], b) * m;
                }
                m--;
            }
            if (sum != 0) {
                if (hm.get(sum) == null) {
                    hm.put(sum, "P" + g);
                } else {
                    hm.put(sum, hm.get(sum) + " P" + g);
                }
            }
            g++;
        }
        String res = "";
        for (int gm : hm.keySet()) {
            res += " " + hm.get(gm);
        }
        return res;
    }

    private static int posAtA(String a, String b) {
        String[] my_arr = b.split(" ");
        for (int i = 1; i < my_arr.length; i++) {
            if (my_arr[i].equals(a)) {
                return my_score - i;
            }
        }
        return 0;
    }

}