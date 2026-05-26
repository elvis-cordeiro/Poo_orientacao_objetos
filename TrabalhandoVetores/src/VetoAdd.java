
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author elvis.acordeiro
 */

public class VetoAdd {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        
        // ==================== INSERÇÃO ====================
        int[] novoVetor = new int[numeros.length + 1];
        
        for (int i = 0, j = 0; i < novoVetor.length; i++) {
            if (i == 2) {
                novoVetor[i] = 25;        // insere 25 na posição 2
            } else {
                novoVetor[i] = numeros[j];
                j++;
            }
        }
        
        System.out.println("Apos insercao: " + Arrays.toString(novoVetor));
        
        // ==================== REMOÇÃO ====================
        int[] vetorRemovido = new int[novoVetor.length - 1];
        
        for (int i = 0, j = 0; i < novoVetor.length; i++) {
            if (i != 3) {                 // remove o elemento na posição 3
                vetorRemovido[j] = novoVetor[i];
                j++;
            }
        }
        
        System.out.println("Apos remocao : " + Arrays.toString(vetorRemovido));
    }
}
