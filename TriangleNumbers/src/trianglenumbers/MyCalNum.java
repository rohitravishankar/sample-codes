/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianglenumbers;

import static java.lang.Math.sqrt;

/**
 *
 * @author Sameera
 */
public class MyCalNum implements Runnable {

    private int mynum;
    private Thread mytr;
    
    public MyCalNum(int i) {
        this.mynum = i;
    }

    private static int findivs(int num) {
        int count=0,square=(int)sqrt(num);
        for(int i=1;i<square;i++){
            if(num%i==0){
                count+=2;
            }
        }
        if(square * square == num)
        {
            count--;
        }
        return count;
    }
    
    @Override
    public void run() {
        int num=0,sum;
        while(true){
            num = num+this.mynum;
            sum = findivs(num);
            if(sum > 500){
                System.out.println("The number is : "+this.mynum+"  Triangle Number is : "+num+" The Sum of divisors : "+sum);
                System.exit(0);
            }
            this.mynum++;
            //System.out.println(mytr.getName()+"  "+num+" "+sum);
        }
    }
    
    public void start ()
   {
      if (mytr == null)
      {
         mytr = new Thread(this);
         mytr.setPriority(Thread.NORM_PRIORITY);
         mytr.start();
      }
   }
    
    
}
