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

//        Empregado empregado = new Empregado();
//        empregado.setSalario(1300);
//        
//        Gerente gerente = new Gerente();
//        gerente.setGratificacao(300);   
//        gerente.setSalario(2500);
//        
//        Gerente gerente2 = new Gerente();
//        gerente2.setGratificacao(500);
//        gerente2.setSalario(3000);
//        
//        Comissionado comissionado = new Comissionado();
//        comissionado.setPercentual(2);
//        comissionado.setSalario(800);
//        
//        Aluno aluno = new Aluno();
//        aluno.setMatricula(1234);
//        aluno.setMensalidade(1000);
//        aluno.setCpf("123456");
//        aluno.setNome("João Maria das Flores");
//        
//        Aluno aluno2 = new Aluno();
//        aluno2.setMatricula(1234);
//        aluno2.setMensalidade(1000);
//        
//        Aluno aluno3 = new Aluno();
//        aluno3.setMatricula(1234);
//        aluno3.setMensalidade(3000);
////        
////        System.out.println("Salario do gerente: " + gerente.getValor());
////        System.out.println("Salario do empregado: " + empregado.getValor());
////        System.out.println("Salario do comissionado: " + comissionado.getValor());
//        
//        ArrayList<Contabilidade> contasPagar = new ArrayList(); 
//        ArrayList<Contabilidade> contasReceber = new ArrayList();
//        
//        contasPagar.add(empregado);
//        contasPagar.add(gerente);
//       // contasPagar.add(gerente2);
//        contasPagar.add(comissionado);
//        
//        
//        contasReceber.add(aluno);
//        contasReceber.add(aluno2);
//        contasReceber.add(aluno3);
//        
//        
//        double totalContasPagar = 0;
//        for  (Contabilidade contasPagar2 : contasPagar) {
//                 totalContasPagar += contasPagar2.getValor();
//        }
//        
//        double totalContasReceber = 0;
//        for (Contabilidade contasReceber1 : contasReceber) {
//            totalContasReceber += contasReceber1.getValor();
//        }
//       
//        
//        System.out.println("TOTAL DE CONTAS A PAGAR  : " + totalContasPagar);
//        System.out.println("TOTAL DE CONTAS A RECEBER: " + totalContasReceber);
//        double Saldo = totalContasReceber - totalContasPagar;
//        System.out.println("SALDO: " + Saldo);
        
public class main {
    public static void main (String [] args) {
        
       uml1.Interface.FramePrincipal Frame = new uml1.Interface.FramePrincipal();
       Frame.setVisible(true);
       Empresa.consultaCustos();
   
    }
}
