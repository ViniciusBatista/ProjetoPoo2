/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml1;

import exe.ContratoFornecedorException;

/**
 *
 * @author batista
 */
public class Fornecedor implements Contabilidade {

    private String cnpj;
    private String nome;
    private double valorContrato;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
    @Override
    public double getValor() {
        return valorContrato;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setValorContrato(double valorContrato) throws ContratoFornecedorException {
        if (valorContrato > 0) {
            this.valorContrato = valorContrato;
        }else {
            throw new ContratoFornecedorException();
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public double getValorContrato() {
        return valorContrato;
    }

}
