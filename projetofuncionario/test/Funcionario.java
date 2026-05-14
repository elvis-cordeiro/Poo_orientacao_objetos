/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elvis.acordeiro
 */
public class Funcionario {
    
    String nomes;
    String funcoes;
    double salarios;
    
    //Metodo para Adição
    void aumentarSalario (double valor) {
        this.salarios += valor;    
    }
    
    //Metodo para retornar o valor
    double mostrarSalarioAtual () {
        return this.salarios;
    }
}
