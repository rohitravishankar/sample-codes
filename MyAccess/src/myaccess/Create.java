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
public class Create {

    HashMap<String, Integer> local = new HashMap<>();
    HashMap<Integer, Integer> lc = new HashMap<>();
    static int start = 1;

    public void access(String p) {
        if (p.startsWith("start")) {
            Create.start = 0;
            return;
        }
        String[] command = p.split(" ");
        if (Create.start == 0) {
            if (command[0].equals("get")) {
                if (local.get(command[1]) == null) {
                    Main.get(command[1]);
                } else {
                    System.out.println(local.get(command[1]));
                }
            }
            if (command[0].equals("set")) {
                local.put(command[1], Integer.parseInt(command[2]));
                if (lc.get(local.get(command[1])) == null) {
                    lc.put(local.get(command[1]), 1);
                } else {
                    lc.put(local.get(command[1]), lc.get(local.get(command[1])) + 1);
                }
            }
            if (command[0].equals("delete")) {
                if (lc.get(local.get(command[1])) != null) {
                    lc.put(local.get(command[1]), lc.get(local.get(command[1])) - 1);
                }
                local.remove(command[1]);
            }
            if (command[0].equals("count")) {
                System.out.println(lc.get(command[1]));
            }

            if (p.equals("commit")) {
                Main.goal = 0;
                for (String k : local.keySet()) {
                    Main.set(k, local.get(k));
                }
                Main.goal = 1;
                Create.start = 1;
            }
        } else {
            if (command[0].equals("set")) {
                while (Main.goal == 0) {
                    ;
                }
                Main.set(command[1], Integer.parseInt(command[2]));

            }
            if (command[0].equals("get")) {
                Main.get(command[1]);
            }
            if (command[0].equals("delete")) {
                while (Main.goal == 0) {
                    ;
                }
                Main.delete(command[1]);
            }
            if (command[0].equals("count")) {
                Main.count(Integer.parseInt(command[1]));
            }
        }
    }
}
