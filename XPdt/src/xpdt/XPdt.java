/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpdt;

import java.util.Scanner;

/**
 *
 * @author Sameera
 */
public class XPdt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n = new Scanner(System.in);
        int n1 = n.nextInt();
        int n2 = n.nextInt();
        int num[] = new int[n1];
        for(int i=0;i<n1;i++){
            num[i] = n.nextInt();
        } 
        Findnum f = new Findnum(n2);
        f.findnum(num);    
    }
}
