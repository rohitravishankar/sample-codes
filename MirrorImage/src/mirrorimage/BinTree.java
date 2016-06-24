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
public class BinTree {
    
    Node root;
    
    BinTree(){
        this.root = null;
    }
    
    public void insert(int data){
        Node a = new Node(data);
        if(root == null){
            root = a;
        }
        else{
            Node temp = root;
            Node prev = null;
            while(temp!=null){
                if(temp.data < a.data){
                    prev = temp;
                    temp = temp.right;
                }
                else{
                    prev = temp;
                    temp = temp.left;
                }
            }
            if(prev.data < a.data){
                prev.right = a;
            }
            else{
                prev.left =a ;
            }
        }
    }
    
    public void print(Node a){
        if(a!=null){
            print(a.left);
            System.out.print(a.data+" ");
            print(a.right);
        }
    }
    
    public void mirror(Node root){
        Node temp;
        if(root!=null){
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            mirror(root.left);
            mirror(root.right);
        }
        
        
    }
    
}
