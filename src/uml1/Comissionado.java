/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml1;

/**
 *
 * @author batista
 */
public class Comissionado extends Empregado{
    private double percentual;
    
    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }
    
    
    @Override
    public double getValor (){
      return super.getSalario()+ ((super.getSalario() * getPercentual())/100);
    }
}
