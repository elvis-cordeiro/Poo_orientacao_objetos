/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javameupacote;

/**
 *
 * @author elvis.acordeiro
 */
public class TestaCartao {

   
    public static void main(String[] args) {
        CartaoDeCredito cr2 = new CartaoDeCredito ();
        
        cr2.datadevalidade = "15/04/98";
        cr2.numero = 12545;
        
        System.out.println("Data de validade do Cartao Generico = " + cr2.datadevalidade);
        System.out.println("Numero do Cartao Generico = " + cr2.numero);
        System.out.println("------------------------------------------------------");
        
        CartaoDeCredito C6Bank = new CartaoDeCredito ();
        
        C6Bank.datadevalidade = "04.05.2026";
        C6Bank.numero = 45568;
        
        System.out.println("Numero do Cartao do C6Bank = " + C6Bank.numero);
        System.out.println("Data de validade do Cartao C6 = " + C6Bank.datadevalidade);
    }
    
}
