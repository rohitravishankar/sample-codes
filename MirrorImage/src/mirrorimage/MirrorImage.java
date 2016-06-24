/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mirrorimage;

import java.util.Scanner;

/**
 *
 * @author sameerasy
 */
public class MirrorImage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n = new Scanner(System.in);
        BinTree b = new BinTree();
        int num;
        num = n.nextInt();
        for(int i=0;i<num;i++){
            int data = n.nextInt();
            b.insert(data);
        }
        System.out.print("Before Mirroring ");
        b.print(b.root);
        System.out.println();
        b.mirror(b.root);
        System.out.print("After Mirroring ");
        b.print(b.root);
        System.out.println();
    }
}
