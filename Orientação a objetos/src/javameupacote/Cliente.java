
package javameupacote;

/**
 *
 * @author elvis.acordeiro
 */
public class Cliente {
    //Atributos
    public String nome = "Elvis";
    int cpf;
    int codigo;
    //Criando Metodo Para consulta e alteração do nome é o encapsulado "Private" 
    public String consultaNome(){
        return this.nome;
    }
    
    public void alteraNome(String nome){
        this.nome = nome;
    }
     
    /*Metodo Get e Set no Java é primitivo em Java sem instanciar 
    Get = Selecione o atribudo e consulta
    Set = Insertar(alterar) um novo valor no atributo atráves do Metodo
    */
     public String getNome(){
         return this.nome;
     }
      public void setNome(String nome){
          this.nome = nome;
      }      
     }
    
    

