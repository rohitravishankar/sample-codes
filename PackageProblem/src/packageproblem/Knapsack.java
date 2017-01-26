/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageproblem;

/**
 *
 * @author sameerasy
 */
class Filter {

    static float max(float a, float b) {
        if(a > b){
            return a;
        }
        return b;
    }

    static float filter(int W, float wt[], int val[], int n) {
        int i, w;
        float K[][] = new float[n + 1][W + 1];

        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    K[i][w] = 0;
                } else if (wt[i - 1] <= w) {
                    K[i][w] = max(val[i - 1] + K[i - 1][Math.round((int) w - (int) wt[i - 1])], K[i - 1][w]);
                } else {
                    K[i][w] = K[i - 1][w];
                }
            }
        }
        return K[n][W];
    }
}
