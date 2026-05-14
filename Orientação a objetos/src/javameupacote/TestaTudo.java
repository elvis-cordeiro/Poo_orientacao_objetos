/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javameupacote;

/**
 *
 * @author elvis.acordeiro
 */
public class TestaTudo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agencia ag1 = new Agencia ();
        Cliente c1 = new Cliente();
        Conta co1 = new Conta();
        CartaoDeCredito cr1 = new CartaoDeCredito();
        Carro car1 = new Carro();
 
        //Atribuições 
        
       ag1.nome = "Caixa";
       c1.nome = "Japa";
       co1.saldo = 4500;
       cr1.numero = 24545;
       car1.nome = "Porsche";
       
        System.out.println(" O Nome da Agencia = " + ag1.nome);
        System.out.println("---------------------------------");
        System.out.println(" O Nome do Cliente = " + c1.nome);
        System.out.println("----------------------------------");
        System.out.println("O Saldo do Cliente Japa = " + co1.saldo);
        System.out.println("-----------------------------------");
        System.out.println("E o Numero do Cartao de Credito = " + cr1.numero);
        System.out.println("---------------------------------------");
        System.out.println("E o Carro do Cliente = " + car1.nome );
        
        
    }
    
}
