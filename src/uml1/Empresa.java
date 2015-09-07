/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

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
    
    public static void  cadAluno(Aluno aluno) {
        hashAluno.put(idAluno, aluno);
        Conexao.adicionaAluno(aluno);
    }
    
    public static void cadEmpredo (Empregado empregado){
        hashEmpregado.put(idEmpregado, empregado);
        Conexao.adicionaEmpregado(empregado);
    }
    
    public static void cadGerente(Gerente gerente){
        hashGerente.put(idGerente, gerente);
        Conexao.adicionaGerente(gerente);
    }
    
    public static void cadComissionado(Comissionado comissionado){
        hashComissionado.put(idComissionado, comissionado);
        Conexao.adicionaComissionado(comissionado);
    }
    
    public static void cadFornecedor(Fornecedor fornecedor){
        hashFornecedor.put(idFornecedor, fornecedor);
        Conexao.adicionaFornecedor(fornecedor);
    }
    
      public static ArrayList<Fornecedor> selectFornecedor(){
        ArrayList<Fornecedor> listaFornecedores = new ArrayList<Fornecedor>();
        String SELECT = "select nome, cnpj from tb_fornecedor";
            try{
            Conexao.conecte();
            ResultSet rs = Conexao.executeQuery(SELECT);
            while (rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                listaFornecedores.add(fornecedor);
            }
            }catch(SQLException e){
                System.err.println(e.getMessage());
            }
            return listaFornecedores;
    }
    

}
