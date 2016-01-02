/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple;

import java.util.Scanner;

/**
 *
 * @author Pavan
 */
public class Simple {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int i, j, k = 0, count = 0, num, mycheck, flag = 0;
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            for (int G_i = 0; G_i < R; G_i++) {
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            for (int P_i = 0; P_i < r; P_i++) {
                P[P_i] = in.next();
            }
            flag = 0;
            for (i = 0; i < R; i++) {
                count = 0;
                mycheck = G[i].indexOf(P[k]);
                int g = i;
                while (mycheck >= 0) {
                    //System.out.println(mycheck+" "+i);
                    for (j = 0; j < r; j++) {
                        //System.out.println(g);

                        num = G[g++].indexOf(P[j], mycheck);
                        if (num != mycheck) {
                            count = 0;
                            k = 0;
                            g--;
                            break;
                        } else if (num == mycheck) {
                            //System.out.println(G[i++]+"  "+P[j]+"  "+j+" "+count);
                            count++;
                        }
                        if (count == r) {
                            System.out.println("YES");
                            flag = 1;
                            i = R - 1;
                            break;
                        }

                    }
                    mycheck = G[i].indexOf(P[k], mycheck + 1);
                    g = i;
                }

            }
            if (flag == 0) {
                System.out.println("NO");
            }
        }
    }
}
