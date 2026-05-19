/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elvis.acordeiro
 */
public class Calcados extends Loja {
    private String marca;
    private double preco;
    private int quantidade;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void mostraDados(){
        System.out.println("Nome da Marca = " + this.marca);
        System.out.println("Preco do produto = " + this.preco);
        System.out.println("E quantidade em estoque = " + this.quantidade);
    }
            
    
}
