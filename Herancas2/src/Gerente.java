
/*
E está é a Subclasse de "Funcionario que é a super classe" herdando todos os atributos da classe mãe
usando o "exntends" para declarar herança.
E sempre usar o Geters e Seters quando o atributo está encapsulado com o ("private" String usuario) 
quando tiver public não precisa.
*/
public class Gerente extends Funcionario {
    private String usuario;
    private String senha;
   

    public Gerente (String usuario, String senha){
        System.out.println("Instaciando Gerente");
        setUsuario(usuario);
        setSenha(senha);
        
        this.mostraDados();
    }
    
    
    public String getUsuario() {
        return usuario;
    }
    
    

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
        
        
    }
    public void mostraDados(){
        super.mostraDados();
        System.out.println("Usuario= " + this.usuario);
        System.out.println("Senha = " + this.senha);
    }
}
    /*Aqui teve rescrita do metodo com um novo calculo aumentou a bonificacao somente do Gerente
    Um metodo "calculaBonificacao" dentro da classe mae "Funcionario" e outra com o novo metodo na classe Gerente
    Quando chama na classe "Main" ele vê qu
    
    public double calculaBonificacao(){
        return this.getSalario() * 0.6 + 100;
    
    }
   */

