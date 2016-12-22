/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myaccess;

import java.util.HashMap;

/**
 *
 * @author sameerasy
 */
public class Main{
    
    static HashMap<String, Integer> hm = new HashMap<>();
    static HashMap<Integer, Integer> count = new HashMap<>();
    
    static int goal = 1;
    
    public static void set(String key, int value){
        hm.put(key, value);
        if(count.get(value) == null){
            count.put(value, 1);
        }
        else{
            count.put(value, count.get(value)+1);
        }
    }
    
    public static void get(String key){
        System.out.println(hm.get(key));
    }
    
    public static void delete(String key){
        
        if(count.get(hm.get(key))!=null){
            count.put(hm.get(key), count.get(hm.get(key)) -1);
        }
        hm.remove(key);
    }
    
    public static void count(int key){
        System.out.println(count.get(key));
    }
    
}
