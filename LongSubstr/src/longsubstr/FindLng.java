package longsubstr;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sameera
 */
public class FindLng {
    
    
    private final String mys;
    private String myss;
    private String cr;
    private int maxcount;

    public FindLng(String mys) {
        this.mys = mys.toLowerCase();
        this.myss="";
        this.cr="";
        this.maxcount = 0;
    }
     
    public void mysub(){
        for(int i=0;i<mys.length();i++)
        {
            if(myss.indexOf(mys.charAt(i))==-1){
                myss+=mys.charAt(i);
            }
            else
            {
                StringBuilder sb = new StringBuilder(myss);
                sb.replace(0,myss.indexOf(mys.charAt(i))+1,"");
                myss = sb.toString();
                myss+=mys.charAt(i);
            }
            if(myss.length() > maxcount)
            {
                cr = myss;
                maxcount = myss.length() ;
            }
        }
    }

    public String getCr() {
        return cr;
    }

    public int getMaxcount() {
        return maxcount;
    }
    
    
    
}
