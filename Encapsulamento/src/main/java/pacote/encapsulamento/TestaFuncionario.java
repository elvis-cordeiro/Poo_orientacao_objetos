package pacote.encapsulamento;

/**
 *
 * @author elvis.acordeiro
 */
public class TestaFuncionario {
    public static void main(String[] args) {
       
        //Instancias e criação dos objetos refe. a Classe Funcionario
       Funcionario f1 = new Funcionario();
       //intanciando e chamando o metodo Set do encapsulamento da Classe
       f1.setNome("Elvis");
       f1.setSalario(70.456);
       
       //Mostrando o resultado encapsulado Feito com o Metodo Get 
       System.out.println(" Nome: "+ f1.getNome() + " e o Salario R$:" + f1.getSalario());
               
    }
    
}
