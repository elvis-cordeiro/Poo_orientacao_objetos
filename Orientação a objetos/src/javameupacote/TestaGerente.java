/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javameupacote;

/**
 *
 * @author elvis.acordeiro
 */
public class TestaGerente {

   
    public static void main(String[] args) {
        //instanciando a classe e criando o objeto
        Gerente g1 = new Gerente();
        
        g1.nome = "Elvis - DBA_Senior";
        g1.salario = 57.245;
        
        //Aumenta Salario em 10%
        g1.aumentaSalario();
        System.out.println("Funcionario de tecnologia " + g1.nome + ":" + " Salario com 10% de aumento R$ " + g1.salario);
        
    }
    
}
