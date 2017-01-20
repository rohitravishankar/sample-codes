/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makinganagrams;

import java.util.Scanner;

/**
 *
 * @author sameerasy
 */
public class MakingAnagrams {

    /**
     * @param args the command line arguments
     */
    private static int numberNeeded(String first, String second) {
        String fc = first;
        for(int i=0;i<second.length();i++){
            fc = fc.replaceFirst(String.valueOf(second.charAt(i)),"");
        }
        for(int i=0;i<first.length();i++){
            second = second.replaceFirst(String.valueOf(first.charAt(i)),"");
        }
        return fc.length()+second.length();
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
    
}
