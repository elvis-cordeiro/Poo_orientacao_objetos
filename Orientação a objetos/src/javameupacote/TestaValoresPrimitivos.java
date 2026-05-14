/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javameupacote;

/**
 *
 * @author elvis.acordeiro
 */
public class TestaValoresPrimitivos {

   
    public static void main(String[] args) {
        Conta C = new Conta();
        
     /*   System.out.println(C.Saldo);
        System.out.println(C.Numero);
        System.out.println(C.Limite);
        */
        //Atribuição
        C.saldo = 6000;
        C.limite = 5000.00;
        
       if (C.saldo <= C.limite) {
           System.out.println("O saldo e menor que o limite " + C.limite);
       }else{
           System.out.println("O saldo e maior do que o limite " + C.saldo);
       System.out.println(" ");
           
       }
    }
    
}
