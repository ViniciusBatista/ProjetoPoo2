/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author batista
 */
public class Conexao {

    public static Connection con;

    public Conexao() {
    }

    public static void conecte() {
        String Driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "918171";
        String url = "jdbc:postgresql://localhost:5432/firma";

        try {
            Class.forName(Driver);

            con = (Connection) DriverManager.getConnection(url, user, senha);
            System.out.println("Conexão realizada com sucesso");
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void execute(String sql) {
        try {
            PreparedStatement stmt = con.prepareCall(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            st.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static ResultSet executeQuery(String sql) {
        try {
            Statement st = con.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public static void adicionaAluno(Aluno aluno) {
        conecte();
        String INSERT = "insert into tb_aluno (nome, cpf, mensalidade, matricula)"
                + "values (?,?,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(INSERT);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCpf());
            stmt.setDouble(3, aluno.getMensalidade());
            stmt.setInt(4, aluno.getMatricula());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void adicionaEmpregado(Empregado empregado) {
        conecte();
        String INSERT = "insert into tb_empregado (nome, cpf, salario)"
                + "values (?,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(INSERT);
            stmt.setString(1, empregado.getNome());
            stmt.setString(2, empregado.getCpf());
            stmt.setDouble(3, empregado.getSalario());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
