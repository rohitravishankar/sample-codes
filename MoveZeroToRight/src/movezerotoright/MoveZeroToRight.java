/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movezerotoright;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author sameerasy
 */
public class MoveZeroToRight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        for (int i = 0; i < a; i++) {
            int b = n.nextInt();
            int[] arr = new int[b];
            for (int j = 0; j < b; j++) {
                arr[j] = n.nextInt();
            }
            Queue queue = new LinkedList();
            for (int j = 0; j < b; j++) {
                if (arr[j] == 0) {
                    queue.add(j);
                } else if (!queue.isEmpty()) {
                    int index = (int) queue.remove();
                    int temp = arr[index];
                    arr[index] = arr[j];
                    arr[j] = temp;
                    queue.add(j);
                }
            }
            for (int j = 0; j < b; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
