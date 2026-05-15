/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javameupacote;


public class Gerente {
    String nome;
    double salario;
    
    void aumentaSalario(){
        this.aumentaSalario(0.1);
    }
    
    void aumentaSalario(double taxa){
        this.salario += this.salario*taxa;
    }
    

}
