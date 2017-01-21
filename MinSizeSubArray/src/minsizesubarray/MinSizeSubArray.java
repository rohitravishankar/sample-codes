/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minsizesubarray;

import java.util.Scanner;

/**
 *
 * @author sameerasy
 */
public class MinSizeSubArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int[] nums = new int[a];
        for(int i=0;i<a;i++){
            nums[i] = n.nextInt();
        }
        int s = n.nextInt();
        System.out.println(minSubArrayLen(s, nums));
    }

    private static int minSubArrayLen(int s, int[] nums) {
        int min = 2147483647;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                //System.out.println(sum+" "+i+" "+j);
                if (sum >= s) {
                    if (j - i < min) {
                        min = j - i + 1;
                    }
                    break;
                }
            }
        }
        if (min == 2147483647) {
            return 0;
        }
        return min;
    }

}
