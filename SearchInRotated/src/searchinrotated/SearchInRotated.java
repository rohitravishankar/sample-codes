/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchinrotated;

import java.util.Scanner;

/**
 *
 * @author sameerasy
 */
public class SearchInRotated {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = n.nextInt();
        }
        int t = n.nextInt();
        search(arr, t);
    }

    public static int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }
        for (int i = 0; i <= n / 2; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[n - i - 1] == target) {
                return n - i - 1;
            }
        }
        return -1;
    }
}
