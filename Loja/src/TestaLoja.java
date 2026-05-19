/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author elvis.acordeiro
 */
public class TestaLoja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Loja lj = new Loja();
        lj.setNome("Calcados mais você");
        lj.setCnpj(421);
        lj.setEndereco("Rua Eunastacio, Numero 857");
        lj.mmostrarDados();
        
        Calcados c = new Calcados();
        c.setMarca("Adidas");
        c.setPreco(459.98);
        c.setQuantidade(12);
        c.mostraDados();
        
        Funcionarios f = new Funcionarios();
        f.setFuncoes("Vendedor");
        f.setSalario(2400.45);
        f.mostraDados();
        
    }
    
}
