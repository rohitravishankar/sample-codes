/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxelemstack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Sameera
 */
public class MaxElemStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Stack<Long> st = new Stack<>();
        Stack<Long> aux = new Stack<>();
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        n.useDelimiter("\\n");
        for(int i=0;i<a;i++){
            String ss = n.next();
            if(ss.length() > 1){
                String mys[] = ss.split(" ");
                st.push(Long.parseLong(mys[1]));
                if(aux.isEmpty()){
                    aux.push(Long.parseLong(mys[1]));
                }
                else{
                    if(aux.peek() <= Long.parseLong(mys[1])){
                        aux.push(Long.parseLong(mys[1]));
                    }
                    else{
                        aux.push(aux.peek());
                    }
                }
            }
            else if (Long.parseLong(ss)==2){
                st.pop();
                aux.pop();
            }
            else if (Long.parseLong(ss)==3){
                System.out.println(aux.peek());
            }
            //System.out.println(aux+"  "+st);
        }
     }
}