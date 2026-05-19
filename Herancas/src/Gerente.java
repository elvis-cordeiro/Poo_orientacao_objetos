
/*
E está é a Subclasse de "Funcionario que é a super classe" herdando todos os atributos da classe mãe
usando o "exntends" para declarar herança.
E sempre usar o Geters e Seters quando o atributo está encapsulado com o ("private" String usuario) 
quando tiver public não precisa.
*/
public class Gerente extends Funcionario {
    private String usuario;
    private String senha;

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
    
    
}
