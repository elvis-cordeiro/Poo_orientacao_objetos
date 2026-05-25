/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author elvis.acordeiro
 */
public class VeteoresSMMM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int[] numeros = {10,20,30,40,50};
            int soma = 0;
            int maior = numeros[0];
            int menor = numeros [0];
            
            for (int num: numeros ){
                soma += num;
                
                if (num> maior){
                    maior = num;
                }
                if (num > maior){
                    maior = num;
                }
                if (num < menor){
                    menor = num;
                }
            }
            double media = (double) soma/ numeros.length;
            System.out.println("Soma: " + soma);
            System.out.println("Maior: "+ maior);
            System.out.println("Menor: " + menor);
            System.out.println("Media: " + media);
    } 
}

    
