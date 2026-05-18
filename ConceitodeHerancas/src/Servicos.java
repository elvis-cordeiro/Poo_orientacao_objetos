// Essa é um Super Classe ou Classe mãe e ela que vai ter os metodos principais.

public class Servicos {
    private String nomeservico;
    private int codigoServico;
    private String dataDecontratacao;

    // Metodo Construtor é como se fosse um save da programação
    public Servicos() {
        System.out.println("Usei o metodo construtor");
    }

    //Uma Sobrecarga do Metodo Construtor e Atribuindo Metodo.
    public Servicos(String nomeservico) {
        this.nomeservico = nomeservico;

    }
   
    public String getNomeservico() {
        return nomeservico;
    }

    public void setNomeservico(String nomeservico) {
        this.nomeservico = nomeservico;
    }

    public int getCodigoServico() {
        return codigoServico;
    }

    public void setCodigoServico(int codigoServico) {
        this.codigoServico = codigoServico;
    }

    public String getDataDecontratacao() {
        return dataDecontratacao;
    }

    public void setDataDecontratacao(String dataDecontratacao) {
        this.dataDecontratacao = dataDecontratacao;
    }
    public double calculaTaxa(){
        return 15;
    }
    
}
