/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myaccess;

import java.util.Scanner;

/**
 *
 * @author sameerasy
 */
public class MyAccess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner n = new Scanner(System.in).useDelimiter("\\n");
        Create c = new Create();
        Create c2 = new Create();

        /* Created 2 objects for example purpose (any number of objects can be created and interacted with.
         The instructions remain same, but a number extra in the beginning would specify the object that we are accessing
         for example:
        // Input format to be followed
        
        1 set a 5 --> setting a to 5
        2 set b 5 --> setting b to 5
        1 start
        1 commit
        1 rollback
        2 delete a
        1 count 5

         */
        /*
        
        c.access("set a 5");  // a = 5
        c2.access("get a");   // prints a
        c.access("start");    // starting transaction and locking the memory
        c.access("set b 5");  // adding new variable to local
        c2.access("get a");   // accessing main a, prints 5
        c2.access("get b");   // gets null as the main memory does not have b yet
        c.access("commit");   // commiting the local changes and releasing the lock
        c2.access("get b");    // now b prints 5
        c2.access("delete a"); // deleting from main memory 
        c.access("get a");     // prints null
        c.access("count 5");   // prints 1 as one entry was deleted
        
         */
        while (true) {
            String p = n.next();
            String[] arr = p.split(" ");
            p = p.substring(2);
            if (Integer.parseInt(arr[0]) == 1) {
                c.access(p);
            } else if (Integer.parseInt(arr[0]) == 2) {
                c2.access(p);
            }
        }

    }
}
