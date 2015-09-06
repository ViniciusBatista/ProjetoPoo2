/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 SITE DO PROFESSO
 http://taciano-pinheiro.maxcon.com.br/
 */
package uml1;

import exe.SalarioException;

/**
 *
 * @author batista
 */
public class Empregado extends Pessoa implements Contabilidade {

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws SalarioException {//Salario do empregado não pode ser menor do que o minimo.
        if (salario >= 788) {
            this.salario = salario;
        }else {
            throw new SalarioException();
        }
    }

    @Override
    public double getValor() {
        return salario;
    }
}
