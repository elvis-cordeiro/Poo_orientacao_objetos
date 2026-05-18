
//E essa é uma Subclasse

// Usando o "extends" ele herda todos os atributos e comportamentos da Class Mãe "Servicos"

public class Emprestimos extends Servicos {
    
     private double codigoServico;
     private String nomeServico;
     private String dataContratacao;
     private double valor;
     private double taxa; 
 
 
     //Usando o comando atalho ALT + Insert para os comando Get e Seters
    public void setCodigoServico(double codigoServico) {
        this.codigoServico = codigoServico;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
        
    }
    
    
    /*O calcula taxa é para informa uma taxa em cima do valor e 
    comando Super.calculadora é para chamar o valor setado na classe Super
    */
    public double calculaTaxaDeEmprestimo() {
        return this.valor * 0.1 + super.calculaTaxa();
    }
    
 }
    
    
