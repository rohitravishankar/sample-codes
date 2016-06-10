/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multistringreverse;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Sameera
 */
public class MultiStringReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n = new Scanner(System.in).useDelimiter("\\n");
        String mys = n.next();
        Stack<Character> st = new Stack<>();
        char myar[] = mys.toCharArray();
        String fin="";
        for(int i=0;i<=myar.length;i++){
            if(i < myar.length && Character.isLetter(myar[i])){
                st.push(myar[i]);
            }
            else{
                int flag = 1;
                while(!st.empty()){
                    fin = fin + st.pop();
                    flag = 0;
                }
                if(flag==0){
                    for(int j=i;j<myar.length;j++){
                        if(!Character.isLetter(myar[j])){
                            fin = fin + myar[j];
                        }
                        else{
                            i=j-1;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(fin);
    }
    
}
