/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topkfrequent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author sameerasy
 */
public class TopKFrequent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = n.nextInt();
        }
        int k = n.nextInt();
        System.out.println(topKFrequent(arr, k));
    }
    
    private static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> l = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i]) == null){
                hm.put(nums[i], 1);
            }
            else{
                hm.put(nums[i], hm.get(nums[i])+1);
            }
        }
        for(int i : hm.keySet()){
            pq.add(hm.get(i));
        }
        for(int i=0;i<k;i++){
            int j = pq.poll();
            for(int g : hm.keySet()){
                if((hm.get(g) == j) && (!l.contains(g))){
                    l.add(g);
                }
            }
        }
        return l;
    }
    
}
