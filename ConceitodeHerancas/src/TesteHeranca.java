public class TesteHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Usando o Construtor c
       Servicos s1 = new Servicos ("Ativo");
       System.out.println(s1.getNomeservico());
       
       SeguroDeVeiculo sdv = new SeguroDeVeiculo();
       
       sdv.setCodigoServico(1);
       sdv.setNomeservico("Seguro Do Veiculo - Porsche");
       sdv.setDataDecontratacao("18/05/2026");
       sdv.setFranquia(985.99);
       sdv.setValorDeSeguroVeiculo(17.549);
       
       Emprestimos e = new Emprestimos ();
       
       e.setCodigoServico(1);
       e.setNomeServico("Emprestimo - Elvis");
       e.setDataContratacao("18/05/2026");
       e.setValor(25.00);
       e.setTaxa(0.1);
       
       /* Exitste as Rescritas dos Metodos Por exemplo:
       Existe um metodo CalculaTaxa na SubClasse Servicos
       Existe o Metodo taxa também no Emprestimos
       Conseguimos usar o mesmo nome do Metodos Taxa na hora de instanciar na Main Classe
       Exemplo e.setTaxa e sdv.Taxa
       */
       
        System.out.println(e.getNomeServico());
        System.out.println(e.getCodigoServico());
        System.out.println(e.getDataContratacao());
        System.out.println(e.getTaxa());
        System.out.println(e.getValor());
        System.out.println(e.calculaTaxaDeEmprestimo());
        System.out.println("------------------");
        System.out.println(sdv.getNomeservico());
        System.out.println(sdv.getCodigoServico());
        System.out.println(sdv.calculaTaxa());
        System.out.println(sdv.getFranquia());
    }
    
}
