/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml1;

import exe.GratificacaoInvalidaException;

/**
 *
 * @author batista
 */
public class Gerente extends Empregado  {
   private double gratificacao;
   
    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) throws GratificacaoInvalidaException{
        if (gratificacao > 0 && gratificacao < super.getSalario()) {
        this.gratificacao = gratificacao;
        }else {
            throw new GratificacaoInvalidaException();
        }
    }
    
    @Override
    public double getValor(){
        return super.getSalario() + gratificacao;
    }
     
}
