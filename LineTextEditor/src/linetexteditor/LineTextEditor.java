/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linetexteditor;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author sameerasy
 */
public class LineTextEditor {

    /**
     * @param args the command line arguments
     */
    static Scanner n = new Scanner(System.in);
    static int counter = 0;
    static int cpindexs, cpindexe;
    static ArrayList<String> my_list = new ArrayList<>();
    static Stack<ArrayList<String>> my_undo = new Stack<>();
    static Stack<ArrayList<String>> my_redo = new Stack<>();

    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            n.useDelimiter("\\n");
            String a = n.next();
            n.useDelimiter(" ");
            if(a.equals("z")){
                undo();
            }
            else if(a.equals("zz")){
                redo();
            }
            else if(a.startsWith("i")){
                insert(Integer.parseInt(a.split("\\.")[1]), a.split("\\.")[2]);
            }
            else if(a.startsWith("xx")){
                cpindexs = Integer.parseInt(a.split("\\.")[1]);
                cpindexe = Integer.parseInt(a.split("\\.")[2]);
            }
            else if(a.startsWith("p")){
                paste(Integer.parseInt(a.split("\\.")[1]));
            }
            else if(a.startsWith("dd")){
                if(a.indexOf(".",4)==-1){
                    delete(Integer.parseInt(a.split("\\.")[1]), Integer.parseInt(a.split("\\.")[1]));
                }
                else{
                    delete(Integer.parseInt(a.split("\\.")[1]), Integer.parseInt(a.split("\\.")[2]));
                }
            }
            else if(a.startsWith("d")){
                if(!a.contains(".")){
                    print(0,0);
                }
                else{
                    print(Integer.parseInt(a.split("\\.")[1]), Integer.parseInt(a.split("\\.")[2]));
                }
            }
        }
    }

    private static void print(int i, int i0) {
        if(my_list.isEmpty()){
            System.out.println("Empty");
        }
        else if (i == i0) {
            try {
                for(int j = 0;j<my_list.size();j++){
                    System.out.println(j + " : " + my_list.get(j));
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Line number does not exist");
            }
    
        } else {
            try {
                for (int j = i - 1; j < i0; j++) {
                    System.out.println(j + " : " + my_list.get(j));
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Line number does not exist. Printed till found");
            }
        }

    }

    private static void insert(int n2, String a) {
        //n2--;
        //n.useDelimiter("\\n");
        if (my_list.isEmpty() || n2 >= my_list.size()) {
            my_list.add(a);
        } else {
            my_list.add(n2 - 1, a);
        }
        //System.out.println(my_undo);
        my_undo.push((ArrayList<String>) my_list.clone());
        //System.out.println(my_undo);
    }

    private static void delete(int n3, int n30) {
        if (n3 == n30) {
            try {
                my_list.remove(n3 - 1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Line not present");
            }
        } else {
            try {
                for (int i = n3 - 1; i < n30; i++) {
                    my_list.remove(i);
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Line number not found. Deleted till found");
            }
        }
        my_undo.push((ArrayList<String>) my_list.clone());
    }

    private static void paste(int n7) {
        n7--;
        int c = 0;
        ArrayList<String> cpy = new ArrayList<>();
        for(int i=cpindexs;i<cpindexe;i++){
            cpy.add(my_list.get(i));
        }
        //cpindexs--;
        //cpindexe--;
        n7 = Math.min(n7, my_list.size() + 1);
        for (int i = n7+1; i < n7+cpy.size()+1; i++) {
            my_list.add(i, cpy.get(c));
            c++;
        }
        my_undo.push((ArrayList<String>) my_list.clone());
    }

    private static void undo() {
        //System.out.println(my_undo);
        if(my_undo.isEmpty()){
            System.out.println("Cannot be undone");
        }
        else{
            my_list = my_undo.pop();
            my_redo.push((ArrayList<String>) my_list.clone());
        }
    }

    private static void redo() {
        if(my_redo.isEmpty()){
            System.out.println("Already at latest change");
        }
        else{
            my_list = my_redo.pop();
        }
    }
}
