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
public class BowlingAlley {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            new CalculateScores().firstnineroll();
            new CalculateScores().lastRoll();
            System.out.println(new SetScores().getTotal());
        } catch (NumberFormatException e) {
            System.out.println("The first trial of a round cannot be /");
            e.printStackTrace();
        }
    }

}
