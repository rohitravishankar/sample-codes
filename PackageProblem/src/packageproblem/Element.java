package packageproblem;

import java.util.HashSet;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sameerasy
 */
public class Element {

    public static HashSet<String> allSubsets = new HashSet<>();
    public static final String token = " ";
    
    public static void findTargetSumSubsets(int[] input, int target, String ramp, int index) {

        if (index > (input.length - 1)) {
            if (getSum(ramp) == target) {
                allSubsets.add(ramp);
            }
            return;
        }

        findTargetSumSubsets(input, target, ramp + input[index] + token, index + 1);
        findTargetSumSubsets(input, target, ramp, index + 1);
    }

    private static int getSum(String intString) {
        int sum = 0;
        StringTokenizer sTokens = new StringTokenizer(intString, token);
        while (sTokens.hasMoreElements()) {
            sum += Integer.parseInt((String) sTokens.nextElement());
        }
        return sum;
    }

}
