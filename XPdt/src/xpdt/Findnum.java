/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpdt;

/**
 *
 * @author Sameera
 */
class Findnum {

    int mymod;

    public Findnum(int a) {
        this.mymod = a;
    }

    String[] perms;

    public void findnum(int[] numbers) {
        int tm = 0, max = 0, tmi = 0, maxi = 0;
        perms = new String[(int) Math.pow(2, numbers.length)];
        String lim = "%" + numbers.length + "s";
        fillinperms(lim);
        for (String a : perms) {
            tm = checkmymax(a, numbers);
            tmi = checkmaxind(a);
            if (tm >= max) {
                if (tmi > maxi) {
                    maxi = tmi;
                }
                max = tm;
            }
        }
        System.out.println(max + " " + maxi);
    }

    private void fillinperms(String limit) {

        for (int i = 0; i < perms.length; i++) {
            perms[i] = String.format(limit, Integer.toBinaryString(i)).replace(' ', '0');
        }
    }

    private int checkmymax(String a, int[] numbers) {

        int xor = 0, sum = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1') {
                xor = xor ^ numbers[i];
                sum = sum + numbers[i];
            }
        }
        //System.out.println(" "+a+" "+xor+" "+sum+" "+(xor * sum) % mymod);
        return (xor * sum) % mymod;
    }

    private int checkmaxind(String a) {
        int xor = 0, sum = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1') {
                xor = xor ^ (i + 1);
                sum = sum + i + 1;
            }
        }
        //System.out.println(" "+a+" "+xor+" "+sum+" "+(xor * sum) % mymod);
        return (xor * sum) % mymod;
    }

}
