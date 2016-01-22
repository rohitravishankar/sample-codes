/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingalley;

import java.util.Scanner;

/**
 *
 * @author Sameera
 */
public class CalculateScores {
    
    Scanner n = new Scanner(System.in);
    public void firstnineroll(){
        int choices = 9;
        
        for(int i=0;i<choices;i++){
            String a = n.next();
            if(a.equals("X")){
                new SetScores(10,0,10);
            }
            else
            {
                String b = n.next();
                if(b.equals("/")){
                    new SetScores(Integer.valueOf(a), 10-Integer.valueOf(a), 5);
                }
                else
                {
                    new SetScores(Integer.valueOf(a),Integer.valueOf(b),0);
                }
            }
            //System.out.println(new SetScores().getTotal());
        }
    }
    
    void lastRoll(){
        int sum=0,mychoice=2,flag=0,mf=0;
        String a = n.next();
        for(int i=0;i<mychoice;i++)
        {
            //mysum = Integer.valueOf(a);
            switch (a) {
                case "X":
                    sum=20;
                    flag = 1;
                    break;
                case "/":
                    sum = 10 - sum;
                    sum = sum+5;
                    flag = 1;
                    break;
                default:
                    sum = Integer.valueOf(a);
                    flag=0;
                    break;
            }
            if(flag==1 && mychoice<3)
            {
                mychoice++;
                mf=1;
            }
            if(mf ==1 && i ==2){
                new SetScores().setTotal(sum);
                break;
            }
            if(mf==0 && i==1){
                new SetScores().setTotal(sum);
                break;
            }
            
            new SetScores().setTotal(sum);
            a = n.next();
        }
    }
    
}

    

