/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readcal;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author Sameera
 */
public class ReadCal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        BufferedReader b = null;
        int sum=0;
        HashMap hm = new HashMap();
        try {
            b = new BufferedReader(new InputStreamReader(new FileInputStream("names.txt")));
            String data;
            while((data=b.readLine())!=null){
                String[] words = data.split(",");
                Arrays.sort(words);
                char a = 'A',c;
                int k,count=1,lsum=0;
                //System.out.println(Arrays.toString(words));
                for(int i=0;i<26;i++){
                    hm.put(a, i+1);
                    a++;
                }
                for (String word : words){
                    lsum=0;
                    for(int i=1;i<word.length()-1;i++){
                        c = word.charAt(i);
                        
                        k = (int) hm.get(c);
                        lsum+=k;
                    }
                    sum+=count*lsum;
                    count++;
                }    
            }
            System.out.println(sum);
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getLocalizedMessage());
        } catch (IOException ex) {
            System.err.println(ex.getLocalizedMessage());
        } finally {
            try {
                b.close();
            } catch (IOException ex) {
                System.err.println(ex.getLocalizedMessage());
            }
        }
        
    }
    
}
