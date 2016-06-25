/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author sameerasy
 */
public class Maze {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Integer> ar = new ArrayList<>();
    static ArrayList<Integer> br = new ArrayList<>();
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int[] nodes;
        nodes = new int[a];
        int max = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<a;i++){
            nodes[i] = n.nextInt();
            if(hm.get(nodes[i])==null){
                hm.put(nodes[i],1);
            }
            else{
                hm.put(nodes[i], hm.get(nodes[i])+1);
            }
            if(hm.get(nodes[i]) > max){
                max = hm.get(nodes[i]);
            }
        }
        int b = n.nextInt();
        int c = n.nextInt();
        int nearmeet;
        nearmeet = nearestMeetingCell(nodes, a, b, c);
        System.out.println(nearmeet+"\n"+max+"\n");
    }

    private static int nearestMeetingCell(int[] nodes, int a, int b, int c) {
        if(a==0 || b==-1 || c ==-1){
            return -1;
        }
        for(int val1 : ar){
            for(int val2 : br){
                if (val1==val2){
                    return val1;
                }
            }
        }
        br.add(c);
        ar.add(b);
        return nearestMeetingCell(nodes, --a, nodes[b], nodes[c]);
    }

    private static int checklen(int nodes[], int a, int i, int j,int count) {
        if(i!=nodes[j]){
            a--;
            count++;
            return checklen(nodes,a,i,nodes[j],count);
        }
        else if(i == -1 || nodes[j]==-1|| a==0){
            return -1;
        }
        return count;
    }
}
