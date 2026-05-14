/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author elvis.acordeiro
 */
public class TestaFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Instancias
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario ();
        
        //Atribuições
        f1.nomes = "Chespirito";
        f1.salarios = 3000.45;
        f1.mostrarSalarioAtual();
        //---------------------------------
        f2.nomes = "Anastacia";
        f2.funcoes = "Operadora";
        f2.salarios = 2400.56;
        
        //Mostrar Resultado
        System.out.println("O salario do Chespirito e de R$ = " + f1.salarios);
        System.out.println("E teve aumento de R$ 400" );
        f1.aumentarSalario(400);
        System.out.println("E o salario do Chespirito foi para = R$ " + f1.mostrarSalarioAtual());
        System.out.println("-------------------------------------------------------------------");
        System.out.println("O salario da Anastacia R$= " + f2.salarios);
        System.out.println("E teve aumento de R$550");
        f2.aumentarSalario(550);
        System.out.println("E o salario da Anastacia foi para R$=" + f2.mostrarSalarioAtual());
    }
    
}
