
package javameupacote;

/**
 *
 * @author elvis.acordeiro
 */
public class Cliente {
    //Atributos
    private String nome = "Elvis";
    int cpf;
    int codigo;
    //Criando Metodo Para consulta e alteração do nome é o encapsulado "Private" 
    public String consultaNome(){
        return this.nome;
    }
    
    public void alteraNome(String nome){
        this.nome = nome;
    }
    }

