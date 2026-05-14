/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javameupacote;

/**
 *
 * @author elvis.acordeiro
 * TestaCliente nome da Classe
 */
public class ClasseMainReprodução {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Instanciando a classe e criando o objeto
        Cliente c1 = new Cliente();
        Carro v1 = new Carro();
        CartaoDeCredito cr1 = new CartaoDeCredito();
        
        // Fazendo a atribuição de valores
        c1.codigo = 12;
        c1.nome = "Elvis";
        
        //Criando outro objeto Cliente no caso c2
        Cliente c2 = new Cliente();
        
        
        // 2º Fazendo atribuição
        v1.nome = "Tesla";
        v1.documento = 45286;
        
        // 4º Fazendo atribuição
        
        cr1.numero = 1254;
        
        
        //Mostrar os resultados
        System.out.println("O Numero do cartao de credito= " + cr1.numero);
        System.out.println("----------------------------------------------");
        System.out.println("O Nome do Empresario = " + c1.nome);
        System.out.println("-----------------------------------------------");
        System.out.println("E o Carro que ele chegou = " + c1.nome);
        System.out.println("------------------------------------------------");
    }
    
}
