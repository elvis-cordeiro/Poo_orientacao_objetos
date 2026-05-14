/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javameupacote;

/**
 *
 * @author elvis.acordeiro
 */
public class TestaAgencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agencia ag1 = new Agencia ();
        Agencia ag2 = new Agencia ();
        
        //Atribuições
        ag1.nome = "Santander";
        ag1.numero = 452836;
        
        ag2.nome = "Inter";
        ag2.numero = 271546;
        
        //Mostrando Resultados
        System.out.println("O Nome da Minha Primeira Agencia = " + ag1.nome);
        System.out.println("E o Numero dessa Agencia =" + ag1.numero);
        System.out.println("-------------------------------------------");
        System.out.println("O Nome da Segunda Agencia = " + ag2.nome);
        System.out.println("E o Numero da minha Segunda Agencia = " + ag2.numero );
    }
    
}
