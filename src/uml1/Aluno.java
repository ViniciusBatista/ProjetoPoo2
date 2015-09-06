/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml1;

import exe.MensalidadeException;

/**
 *
 * @author batista
 */
public class Aluno extends Pessoa implements Contabilidade{
    private int matricula;
    private double mensalidade;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public double getValor(){
        return mensalidade;
    }

    public double getMensalidade() {
        
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) throws MensalidadeException{
        if (mensalidade > 0){
        this.mensalidade = mensalidade;
        }else {
            throw new MensalidadeException();
        }
    }
    
}
