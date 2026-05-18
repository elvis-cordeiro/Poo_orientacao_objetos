
/*
Subclasse de Funcionario criamos mais um objeto "Telefonista" com atributo encapsulado 
com "private"
*/

public class Telefonista extends Funcionario {
    
    private int estacaoDetrabalho;

    public int getEstacaoDetrabalho() {
        return estacaoDetrabalho;
    }

    public void setEstacaoDetrabalho(int estacaoDetrabalho) {
        this.estacaoDetrabalho = estacaoDetrabalho;
    }
    
    
}
