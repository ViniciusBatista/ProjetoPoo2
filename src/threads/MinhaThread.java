/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;


/**
 *
 * @author batista
 */
public class MinhaThread implements Runnable {

    private int m[];

    public MinhaThread(int m[]) {
        this.m = m;
    }

    @Override
    public void run() {
        int soma = 0;
        for (int i = 0; i < m.length; i++){
            soma += m[i];
        }
        System.out.println("Soma:" + soma);
    }
}
