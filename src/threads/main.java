/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.Random;

/**
 *
 * @author batista
 */
public class main {

    public static void main(String[] args) {
        int TAM = 20;    
        int m[][] = new int[TAM][TAM];
        Random random = new Random();
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                m[i][j] = random.nextInt(9);
                System.out.println(m[i][j]);
            }
        }

        MinhaThread mt = new MinhaThread(m[0]);
        Thread t = new Thread(mt);
        t.start();
        
        MinhaThread mt1 = new MinhaThread(m[1]);
        Thread t1 = new Thread(mt1);
        t1.start();
        
        MinhaThread mt2 = new MinhaThread(m[2]);
        Thread t2 = new Thread(mt2);
        t2.start();
    }
}
