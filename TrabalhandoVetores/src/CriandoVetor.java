
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author elvis.acordeiro
 */
public class CriandoVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] numeros = {15,25,35,45,55};
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
        System.out.println("=========== Soma,Media,Maior e Menor valor ===============");
        System.out.println("Soma: " + soma);
        System.out.println("Maior: "+ maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media);
        
        // ==================== INSERÇÃO ====================
        int[] novoVetor = new int[numeros.length + 1];
        
        for (int i = 0, j = 0; i < novoVetor.length; i++) {
            if (i == 2) {
                novoVetor[i] = 20;        // insere 25 na posição 2
            } else {
                novoVetor[i] = numeros[j];
                j++;
            }
        }
        System.out.println("======================= Insercoes ======================");
        System.out.println("Apos primeira insercao: " + Arrays.toString(novoVetor));
        
        //================ Altarando duas posições=====================
        novoVetor[0] = 15;   // altera duas posições posição 1 (segundo elemento)
        novoVetor[4] = 88;
        System.out.println("Apos nova insercao: " + Arrays.toString(novoVetor));
        
        // ==================== REMOÇÃO ====================
        int[] vetorRemovido = new int[novoVetor.length - 1];
        
        for (int i = 0, j = 0; i < novoVetor.length; i++) {
            if (i != 3 && i != 4) {       // remove o elemento na posição 3
                vetorRemovido[j] = novoVetor[i];
                j++;
            }
        }
        System.out.println("======================= Remocoes ======================");
        System.out.println("Apos remocao : " + Arrays.toString(vetorRemovido));
        
    }
    
}
