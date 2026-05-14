/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javameupacote;

/**
 *
 * @author elvis.acordeiro
 * Classe mãe
 */
public class Conta {
    
    //Atributos
    double saldo;
    double numero;
    double limite;
    int base;
    
    //Metodos De somar Atributos
    void deposita (double valor) {
        this.saldo += valor;
      
    }
    //Metodo de Subtrair Valor
   void saque ( double valor) {
        this.saldo -= valor;
    }
   
   //Metodo Retorno dos Valores Com o tipo de dado primeiro/Depois o nome do metodo/ e depois retono com o "Return" + "this.saldo" somando com o "this.limite"
   double consultaSaldoDisponivel (){
       return this.saldo + this.limite;
   }
}
