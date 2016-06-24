/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mirrorimage;

/**
 *
 * @author sameerasy
 */
public class Node {
    int data;
    Node left;
    Node right;
    
    Node(int a, Node b, Node c){
        this.data = a;
        this.left = b;
        this.right = c;
    }
    Node(int a){
        this.data = a;
        this.left = null;
        this.right = null;
    }
    
}
