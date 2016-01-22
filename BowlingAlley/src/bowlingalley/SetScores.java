/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingalley;

/**
 *
 * @author Sameera
 */
public class SetScores {
    int try1;
    int try2;
    int bonus;
    static int total = 0;
    
    public SetScores(){}

    public SetScores(int try1, int try2, int bonus) {
        this.try1 = try1;
        this.try2 = try2;
        this.bonus = bonus;
        SetScores.total += this.try1+this.try2+this.bonus;
    }

    public static void setTotal(int total) {
        SetScores.total += total;
    }

    public static int getTotal() {
        return total;
        //return 1;
    }
}
