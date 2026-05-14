/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javameupacote;

/**
 *
 * @author elvis.acordeiro
 */
public class TestaConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        
        
        //Atribuições
        c1.limite = 5000.41;
        c1.saldo = 1000;
        c1.numero = 425.154;
        c1.deposita(450.00);
        c1.consultaSaldoDisponivel();
        
        c2.limite = 8400.00;
        c2.saldo = 100;
        c2.numero = 154.488;
        c2.base = 2;
        
        //Mostrando Resultados
        System.out.println("O Numero da Primeira Conta = " + c1.numero);
        System.out.println("O Saldo da Primeira conta = " + c1.saldo);
        System.out.println("O Limite da Primeira Conta = " +c1.limite);
        System.out.println("-------------------------------------------");
        System.out.println(" O Saldo Atualizado = " + c1.saldo);
        System.out.println("------------------------------------------");
        System.out.println("O Numero da Segunda Conta = " + c2.numero);
        System.out.println("O Saldo da Segunda conta = " + Math.pow(c2.saldo, 2));
        System.out.println("O Limite da Segunda Conta = " +c2.limite);
        System.out.println("-------------------------------------------");
        System.out.println("E a soma do saldo e do limite sao = " + c1.consultaSaldoDisponivel());
        System.out.println("A soma do saldo das duas contas = " + (c1.saldo + c2.saldo));
        
    }
    
}
