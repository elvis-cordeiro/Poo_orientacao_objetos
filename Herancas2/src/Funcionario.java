/*
 * Estamos codificando mais uma vez usando o conceito de Super classe onde tem 
   os atributos "private String nome;", "private double salario"
   e os Geters e Seters com ALT + Insert quando não aparecer o Get e os Seters vá "add property" e selecione a opção
   para automatizar o codigo
*/

public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
