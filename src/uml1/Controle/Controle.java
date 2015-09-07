/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml1.Controle;

import exe.ContratoFornecedorException;
import exe.CpfException;
import exe.GratificacaoInvalidaException;
import exe.MensalidadeException;
import exe.NomeException;
import exe.SalarioException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import uml1.Aluno;
import uml1.Comissionado;
import uml1.Empregado;
import uml1.Empresa;
import uml1.Fornecedor;
import uml1.Gerente;

/**
 *
 * @author batista
 */
public class Controle {

    public Controle() {
    }

    //Cria o objeto de aluno e add na coleção que fica na classe empresa. que é a classe de armazenamento 
    public static void addAluno(String nome, String cpf, int mat, double mens) {

        try {
            Aluno aluno = new Aluno();
            aluno.setCpf(cpf);
            aluno.setNome(nome);
            aluno.setMatricula(mat);
            aluno.setMensalidade(mens);
            Empresa.cadAluno(aluno);
        } catch (CpfException ce) {
            JOptionPane.showMessageDialog(null, "CPF Invalido !");
        } catch (NomeException ne){
            JOptionPane.showMessageDialog(null, "NOME Invalido !");
        } catch (MensalidadeException me){
            JOptionPane.showMessageDialog(null, "MENSALIDADE Invalida !");
        }

    }
    //Cria o objeto de empregado e add na coleção que fica na classe empresa. que é a classe de armazenamento
    public static void addEmpregado(String nome, String cpf, double salario) {
        try {
            Empregado empregado = new Empregado();
            empregado.setCpf(cpf);
            empregado.setSalario(salario);
            empregado.setNome(nome);
            Empresa.cadEmpredo(empregado);
        } catch (CpfException ce) {
            JOptionPane.showMessageDialog(null, "CPF Invalido");
        } catch (SalarioException se) {
            JOptionPane.showMessageDialog(null, "SALARIO invalido");
        } catch (NomeException ne){
            JOptionPane.showMessageDialog(null, "NOME Invalido");
        }
    }
    //Cria o objeto de gerente e add na coleção que fica na classe empresa. que é a classe de armazenamento
    public static void addGerente(String nome, String cpf, double salario, double grat) {

        try {
            Gerente gerente = new Gerente();
            gerente.setCpf(cpf);
            gerente.setSalario(salario);
            gerente.setNome(nome);
            gerente.setGratificacao(grat);
            Empresa.cadGerente(gerente);
        } catch (CpfException c) {
            JOptionPane.showMessageDialog(null, "CPF invalido!");
        } catch (SalarioException s) {
            JOptionPane.showMessageDialog(null, "SALARIO invalido !");
        } catch (GratificacaoInvalidaException ge) {
            JOptionPane.showMessageDialog(null, "GRATIFICAÇÃO Invalida !");
        } catch (NomeException ne){
            JOptionPane.showMessageDialog(null, "NOME Invalido !");
        }
    }
    //Cria o objeto de comissionado e adiciona na coleção que fica na classe empresa. que é a classe de armazenamento
    public static void addComissionado(String nome, String cpf, double salario, double per) { 

        try {
            Comissionado comis = new Comissionado();
            comis.setNome(nome);
            comis.setCpf(cpf);
            comis.setSalario(salario);
            comis.setPercentual(per);
            Empresa.cadComissionado(comis);
        } catch (CpfException ce) {
            JOptionPane.showMessageDialog(null, "CPF Invalido !");
        } catch (SalarioException se) {
            JOptionPane.showMessageDialog(null, "SALARIO Invalido !");
        } catch (NomeException ne){
            JOptionPane.showMessageDialog(null, "NOME Invalido !");
        }
    }
    //Cria o objeto de fornecedor e adiciona na coleção que fica na classe empresa. que é a classe de armazenamento
    public static void addFornecedor(String nome, String cnpj, double valorContrato ){  
        try {
            Fornecedor fornecedor = new Fornecedor ();
            fornecedor.setCnpj(cnpj);
            fornecedor.setValorContrato(valorContrato);
            fornecedor.setNome(nome);
            Empresa.cadFornecedor(fornecedor);
        }catch (ContratoFornecedorException cfe){
            JOptionPane.showMessageDialog(null, "Valor do contrato do fornecedor invalido");
        }
    }
    
    public static ArrayList selectFornecedor(){
       return Empresa.selectFornecedor();
    }
}
