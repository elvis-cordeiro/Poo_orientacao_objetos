/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elvis.acordeiro
 */
public class Funcionarios extends Loja {
    private String funcoes;
    private double salario;


    
    public String getFuncoes() {
        return funcoes;
    }

    public void setFuncoes(String funcoes) {
        this.funcoes = funcoes;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void mostraDados(){
        System.out.println("A funcao do funcionario = " + this.funcoes);
        System.out.println("E o salario e = " + this.salario);
        System.out.println("---------------------------------");
    }
    
    
}
