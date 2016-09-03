/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancedbrackets;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author sameerasy
 */
public class BalancedBrackets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        for (int j = 0; j < a; j++) {
            String s = n.next();
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (st.isEmpty()) {
                    st.push((int) s.charAt(i));
                } else if (st.peek() == (int) s.charAt(i) - 1 || st.peek() == (int) s.charAt(i) - 2) {
                    st.pop();
                } else {
                    st.push((int) s.charAt(i));
                }
            }
            if (!st.isEmpty()) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
