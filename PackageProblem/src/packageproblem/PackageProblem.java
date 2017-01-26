/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageproblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author sameerasy
 */
public class PackageProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner n = new Scanner(System.in).useDelimiter("\\n");
        ArrayList<Float> myl1 = new ArrayList();
        ArrayList<Integer> myl2 = new ArrayList();
        int limit;
        while (n.hasNext()) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            myl1.clear();
            myl2.clear();
            int count = 0;
            String a = n.next();
            if (a.equals("exit")) {
                System.exit(0);
            }
            String[] arr = a.split(":");
            limit = Integer.parseInt(arr[0].trim());
            for (String g : arr[1].split(" ")) {
                String pattern = "[-+]?([0-9]*\\.[0-9]+|[0-9]+)";
                Pattern r = Pattern.compile(pattern);
                Matcher m = r.matcher(g);
                if (!m.find()) {
                    continue;
                }
                count++;
                int index = Integer.parseInt(m.group());
                m.find();
                float weight = Float.parseFloat(m.group());
                m.find();
                int value = Integer.parseInt(m.group());
                myl1.add(weight);
                myl2.add(value);
                hm.put(index, value);
            }
            float[] weights = new float[count];
            int[] val = new int[count];
            for (int x = 0; x < count; x++) {
                weights[x] = myl1.get(x);
                val[x] = myl2.get(x);
            }
            Element.findTargetSumSubsets(val, (int) Filter.filter(limit, weights, val, count), "", 0);
            int check = -1;
            for (String str : Element.allSubsets) {
                int sum = 0;
                String[] myarr = str.split(" ");
                for (String myarr1 : myarr) {
                    if (!myarr1.equals("")) {
                        float ind = myl1.get(myl2.indexOf(Integer.parseInt(myarr1)));
                        sum += ind;
                        if (sum > limit) {
                            sum = -1;
                            break;
                        }
                    }
                }
                if (sum != -1) {
                    for (String myarr1 : myarr) {
                        if (!myarr1.equals("")) {
                            int g = Integer.parseInt(myarr1);
                            float mweight = 2147483647f;
                            int myind = -1;
                            for (int myv : hm.keySet()) {
                                if (hm.get(myv) == g) {
                                    if (myl1.get(myv - 1) < mweight) {
                                        mweight = myl1.get(myv - 1);
                                        myind = myv;
                                    }
                                }
                            }
                            System.out.print(myind + " ");
                            check = 0;
                            hm.put(myind, -1);
                        }
                    }
                }

            }
            if (check == -1) {
                System.out.println("-");
            } 
            else 
            {
                System.out.println();
            }
            Element.allSubsets.clear();
        }
    }
}
