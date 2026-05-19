
/*
Subclasse de Funcionario criamos mais um objeto "Telefonista" com atributo encapsulado 
com "private"
*/

public class Telefonista extends Funcionario {
    
    private int estacaoDetrabalho;
  
    public Telefonista (String nome, double salario){
        System.out.println("Instaciando Telefonista");
        setNome(nome);
        setSalario(salario);
       
        this.mostraDados();
        
    }
    
    public void mostraDados(){
        super.mostraDados();
        System.out.println("Estação de Trabalho= " +this.estacaoDetrabalho);
       
    }
    
}
