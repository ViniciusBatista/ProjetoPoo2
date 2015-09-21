/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml1;

import exe.PercentualException;

/**
 *
 * @author batista
 */
public class Comissionado extends Empregado {

    private double percentual;

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) throws PercentualException {
        if (percentual > 0 && percentual <= 100) {
            this.percentual = percentual;
        } else {
            throw new PercentualException();
        }
    }

    @Override
    public double getValor() {
        return super.getSalario() + ((super.getSalario() * getPercentual()) / 100);
    }
}
