/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml1;

import exe.CpfException;
import exe.GratificacaoInvalidaException;
import exe.MensalidadeException;
import exe.NomeException;
import exe.PercentualException;
import exe.SalarioException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author batista
 */
public class Empresa {

    private static HashMap<Integer, Object> hashAluno = new HashMap<>();
    private static HashMap<Integer, Object> hashEmpregado = new HashMap<>();
    private static HashMap<Integer, Object> hashGerente = new HashMap<>();
    private static HashMap<Integer, Object> hashComissionado = new HashMap<>();
    private static HashMap<Integer, Object> hashFornecedor = new HashMap<>();

    static int idAluno = 0;
    static int idEmpregado = 0;
    static int idGerente = 0;
    static int idComissionado = 0;
    static int idFornecedor = 0;

    public Empresa() {
    }

    public static void cadAluno(Aluno aluno) {
        ArrayList<String> consultaCpfAluno = consultaCpfAluno();
        if (consultaCpfAluno.contains(aluno.getCpf())) {//verifica se o cpf já esta cadastrado
            JOptionPane.showMessageDialog(null, "CPF já cadastrado", "CPF Invalido", 0);
        } else {
            hashAluno.put(idAluno, aluno);
            Conexao.adicionaAluno(aluno);
        }
    }

    public static void cadEmpredo(Empregado empregado) {
        ArrayList<String> consultaCpfEmpregado = consultaCpfEmpregado();
        if (consultaCpfEmpregado.contains(empregado.getCpf())) {
            JOptionPane.showMessageDialog(null, "CPF já cadastrado", "CPF Invalido", 0);
        } else {
            hashEmpregado.put(idEmpregado, empregado);
            Conexao.adicionaEmpregado(empregado);
        }
    }

    public static void cadGerente(Gerente gerente) {
        ArrayList<String> consultaCpfGerente = consultaCpfGerente();
        if (consultaCpfGerente().contains(gerente.getCpf())) {
            JOptionPane.showMessageDialog(null, "CPF já cadastrado", "CPF Invalido", 0);
        } else {
            hashGerente.put(idGerente, gerente);
            Conexao.adicionaGerente(gerente);
        }
    }

    public static void cadComissionado(Comissionado comissionado) {
        ArrayList<String> consultaCpfComissionado = consultaCpfComissionado();
        if (consultaCpfComissionado.contains(comissionado.getCpf())) {
            JOptionPane.showMessageDialog(null, "CPF já cadastrado", "CPF Invalido", 0);
        } else {
            hashComissionado.put(idComissionado, comissionado);
            Conexao.adicionaComissionado(comissionado);

        }
    }

    public static void cadFornecedor(Fornecedor fornecedor) {
        hashFornecedor.put(idFornecedor, fornecedor);
        Conexao.adicionaFornecedor(fornecedor);
    }

    public static ArrayList<Fornecedor> selectFornecedor() {
        ArrayList<Fornecedor> listaFornecedores = new ArrayList<Fornecedor>();
        String SELECT = "select nome, cnpj from tb_fornecedor";
        try {
            Conexao.conecte();
            ResultSet rs = Conexao.executeQuery(SELECT);
            while (rs.next()) {
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                listaFornecedores.add(fornecedor);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return listaFornecedores;
    }

    public static ArrayList<Aluno> selectAluno() {//seleciona todos os alunos cadastrados
        ArrayList<Aluno> listaAluno = new ArrayList<>();
        String SELECT = "select nome, cpf, matricula, mensalidade from tb_aluno where nome is not null;";
        try {
            Conexao.conecte();
            ResultSet rs = Conexao.executeQuery(SELECT);
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setNome(rs.getString("nome"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setMatricula(rs.getInt("matricula"));
                aluno.setMensalidade(rs.getDouble("mensalidade"));
                listaAluno.add(aluno);
            }
        } catch (SQLException e) {
            System.out.println("Erro sql select aluno");;
        } catch (NomeException ne) {
            System.out.println("Erro nome select aluno");
        } catch (CpfException ce) {
            System.out.println("Erro cpf select aluno");
        } catch (MensalidadeException me) {
            System.out.println("Erros mensalidade select aluno");
        }
        return listaAluno;
    }

    public static ArrayList<Empregado> selectEmpregado() {//seleciona todos os alunos cadastrados
        ArrayList<Empregado> listaEmpregado = new ArrayList<>();
        String SELECT = "select nome, cpf, salario from tb_empregado where nome is not null order by nome;";
        try {
            Conexao.conecte();
            ResultSet rs = Conexao.executeQuery(SELECT);
            while (rs.next()) {
                Empregado empregado = new Empregado();
                empregado.setNome(rs.getString("nome"));
                empregado.setCpf(rs.getString("cpf"));
                empregado.setSalario(rs.getDouble("salario"));
                listaEmpregado.add(empregado);
            }
        } catch (SQLException e) {
            System.out.println("Erro sql select empregado");;
        } catch (NomeException ne) {
            System.out.println("Erro nome select empregado");
        } catch (CpfException ce) {
            System.out.println("Erro cpf select empregado");
        } catch (SalarioException se) {

        }
        return listaEmpregado;
    }

    public static ArrayList<Gerente> selectGerente() {//seleciona todos os alunos cadastrados
        ArrayList<Gerente> listaGerente = new ArrayList<>();
        String SELECT = "select nome, cpf, salario, gratificacao from tb_gerente where nome is not null order by nome;";
        try {
            Conexao.conecte();
            ResultSet rs = Conexao.executeQuery(SELECT);
            while (rs.next()) {
                Gerente gerente = new Gerente();
                gerente.setNome(rs.getString("nome"));
                gerente.setCpf(rs.getString("cpf"));
                gerente.setSalario(rs.getDouble("salario"));
                gerente.setGratificacao(rs.getDouble("gratificacao"));
                listaGerente.add(gerente);
            }
        } catch (SQLException e) {
            System.out.println("Erro sql select empregado");;
        } catch (NomeException ne) {
            System.out.println("Erro nome select empregado");
        } catch (CpfException ce) {
            System.out.println("Erro cpf select empregado");
        } catch (SalarioException se) {
            System.out.println("Erro salario select salario");
        } catch (GratificacaoInvalidaException ge) {
            System.out.println("Erro gratificação select gratificação");
        }
        return listaGerente;
    }

    public static ArrayList<Comissionado> selectComissionado() {//seleciona todos os alunos cadastrados
        ArrayList<Comissionado> listaComissionado = new ArrayList<>();
        String SELECT = "select nome, cpf, salario, percentual from tb_comissionado where nome is not null order by nome;";
        try {
            Conexao.conecte();
            ResultSet rs = Conexao.executeQuery(SELECT);
            while (rs.next()) {
                Comissionado comissionado = new Comissionado();
                comissionado.setNome(rs.getString("nome"));
                comissionado.setCpf(rs.getString("cpf"));
                comissionado.setSalario(rs.getDouble("salario"));
                comissionado.setPercentual(rs.getDouble("percentual"));
                listaComissionado.add(comissionado);
            }
        } catch (SQLException e) {
            System.out.println("Erro sql select comissionado");
        } catch (NomeException ne) {
            System.out.println("Erro nome select comissionado");
        } catch (CpfException ce) {
            System.out.println("Erro cpf select comissionado");
        } catch (SalarioException se) {
            System.out.println("Erro salario select comissionado");
        }catch (PercentualException pe){
            System.out.println("Erro percentual select comissionado");
        }
        return listaComissionado;
    }

    public static ArrayList pesquisarEmpregado(String nome) {//Pesquisa aluno fazendo filtro
        ArrayList<Empregado> listaEmpregado = new ArrayList();
        String SELECT = "select nome, cpf, salario from tb_empregado where nome like '%" + nome + "%' order by nome";
        try {
            Conexao.conecte();
            ResultSet rs = Conexao.executeQuery(SELECT);
            while (rs.next()) {
                Empregado empregado = new Empregado();
                empregado.setNome(rs.getString("nome"));
                empregado.setCpf(rs.getString("cpf"));
                empregado.setSalario(rs.getDouble("salario"));
                listaEmpregado.add(empregado);
            }
        } catch (SQLException e) {
            System.out.println("Erro sql select empregado");;
        } catch (NomeException ne) {
            System.out.println("Erro nome select empregado");
        } catch (CpfException ce) {
            System.out.println("Erro cpf select empregado");
        } catch (SalarioException se) {

        }
        return listaEmpregado;
    }

    public static ArrayList pesquisarAluno(String nome) {//Pesquisa aluno fazendo filtro
        ArrayList<Aluno> listaAluno = new ArrayList();
        String SELECT = "select nome, cpf, matricula, mensalidade from tb_aluno where nome like '%" + nome + "%'";
        ResultSet rs = Conexao.executeQuery(SELECT);
        try {
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setNome(rs.getString("nome"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setMatricula(rs.getInt("matricula"));
                aluno.setMensalidade(rs.getDouble("mensalidade"));
                listaAluno.add(aluno);
            }
        } catch (SQLException e) {
            System.out.println("Erro sql select aluno");;
        } catch (NomeException ne) {
            System.out.println("Erro nome select aluno");
        } catch (CpfException ce) {
            System.out.println("Erro cpf select aluno");
        } catch (MensalidadeException me) {
            System.out.println("Erros mensalidade select aluno");
        }
        return listaAluno;
    }

    public static ArrayList pesquisarGerente(String nome) {//Pesquisa aluno fazendo filtro
        ArrayList<Gerente> listaGerente = new ArrayList();
        String SELECT = "select nome, cpf, salario, gratificacao from tb_gerente where nome like '%" + nome + "%' order by nome";
        try {
            Conexao.conecte();
            ResultSet rs = Conexao.executeQuery(SELECT);
            while (rs.next()) {
                Gerente gerente = new Gerente();
                gerente.setNome(rs.getString("nome"));
                gerente.setCpf(rs.getString("cpf"));
                gerente.setSalario(rs.getDouble("salario"));
                gerente.setGratificacao(rs.getDouble("gratificacao"));
                listaGerente.add(gerente);
            }
        } catch (SQLException e) {
            System.out.println("Erro sql select gerente");;
        } catch (NomeException ne) {
            System.out.println("Erro nome select gerente");
        } catch (CpfException ce) {
            System.out.println("Erro cpf select gerente");
        } catch (SalarioException se) {
            System.out.println("Erro salario select gerente");
        } catch (GratificacaoInvalidaException ge) {
            System.out.println("Erro gratificação select gerente");
        }
        return listaGerente;
    }

    public static ArrayList pesquisarComissionado(String nome) {//Pesquisa aluno fazendo filtro
        ArrayList<Comissionado> listaComissionado = new ArrayList();
        String SELECT = "select nome, cpf, salario, percentual from tb_comissionado where nome like '%" + nome + "%' order by nome";
        try {
            Conexao.conecte();
            ResultSet rs = Conexao.executeQuery(SELECT);
            while (rs.next()) {
                Comissionado comissionado = new Comissionado();
                comissionado.setNome(rs.getString("nome"));
                comissionado.setCpf(rs.getString("cpf"));
                comissionado.setSalario(rs.getDouble("salario"));
                comissionado.setPercentual(rs.getDouble("percentual"));
                listaComissionado.add(comissionado);
            }
        } catch (SQLException e) {
            System.out.println("Erro sql select comissionado");;
        } catch (NomeException ne) {
            System.out.println("Erro nome select comissionado");
        } catch (CpfException ce) {
            System.out.println("Erro cpf select comissionado");
        } catch (SalarioException se) {
            System.out.println("Erro salario select comissionado");
        } catch (PercentualException pe){
            System.out.println("Erro percentual select comissionado");
        }
        return listaComissionado;
    }

    public static ArrayList consultaCpfAluno() {//Método para conferir se o cpf já esta cadastrado.
        String SELECT = "select cpf from tb_aluno";
        ArrayList<String> cpfConsultaAluno = new ArrayList<>();
        try {
            Conexao.conecte();
            ResultSet rs = Conexao.executeQuery(SELECT);
            while (rs.next()) {
                cpfConsultaAluno.add(rs.getString("cpf"));
            }
            return cpfConsultaAluno;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na verificação do CPF");
        }
        return cpfConsultaAluno;
    }

    public static ArrayList consultaCpfEmpregado() {//Método para conferir se o cpf já esta cadastrado.
        String SELECT = "select cpf from tb_empregado";
        ArrayList<String> cpfConsultaEmpregado = new ArrayList<>();
        try {
            Conexao.conecte();
            ResultSet rs = Conexao.executeQuery(SELECT);
            while (rs.next()) {
                cpfConsultaEmpregado.add(rs.getString("cpf"));
            }
            return cpfConsultaEmpregado;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na verificação do CPF");
        }
        return cpfConsultaEmpregado;
    }

    public static ArrayList consultaCpfGerente() {//Método para conferir se o cpf já esta cadastrado.
        String SELECT = "select cpf from tb_gerente";
        ArrayList<String> cpfConsultaGerente = new ArrayList<>();
        try {
            Conexao.conecte();
            ResultSet rs = Conexao.executeQuery(SELECT);
            while (rs.next()) {
                cpfConsultaGerente.add(rs.getString("cpf"));
            }
            return cpfConsultaGerente;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na verificação do CPF");
        }
        return cpfConsultaGerente;
    }

    public static ArrayList consultaCpfComissionado() {//Método para conferir se o cpf já esta cadastrado.
        String SELECT = "select cpf from tb_comissionado";
        ArrayList<String> cpfConsultaComissionado = new ArrayList<>();
        try {
            Conexao.conecte();
            ResultSet rs = Conexao.executeQuery(SELECT);
            while (rs.next()) {
                cpfConsultaComissionado.add(rs.getString("cpf"));
            }
            return cpfConsultaComissionado;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na verificação do CPF");
        }
        return cpfConsultaComissionado;
    }

    public static double consultaCustos() {
        ArrayList<Empregado> listaEmpregado = selectEmpregado();
        ArrayList<Gerente> listaGerente = selectGerente();
        ArrayList<Comissionado> listaComissionado = selectComissionado();

        ArrayList<Contabilidade> contasPagar = new ArrayList<>();
        contasPagar.addAll(listaEmpregado);
        contasPagar.addAll(listaGerente);
        contasPagar.addAll(listaComissionado);

        double totalCustos = 0.0;
        for (Contabilidade contasPagar2 : contasPagar) {
            totalCustos += contasPagar2.getValor();
        }

        return totalCustos;
    }

    public static double consultaReceita(){
        ArrayList<Aluno> listaAluno = selectAluno();
        ArrayList<Contabilidade> contasReceber = new ArrayList<>();
        
        contasReceber.addAll(listaAluno);
        double totalReceita = 0.0;
        for (Contabilidade contasReceber2: contasReceber){
            totalReceita += contasReceber2.getValor();
        }
        return totalReceita;
    }
        
    public static double totalSaldo(){
        return (consultaReceita() - consultaCustos());
    }
}
