
package pacote.encapsulamento;

public class Funcionario {
    
    //Atributos Privados para o encpasulamento
    private String nome;
    private double Salario;
   
    
//Metodos Gets Criado para os atributos encpasulados
    public String getNome(){
        return this.nome;
    }
    public double getSalario(){
        return this.Salario;
    }
    
    //Metodos Sets Criados para Insertar novos valores aos atributos privados
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario (double Salario){
        this.Salario = Salario;
    }
}
