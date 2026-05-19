/*
Agora uma Classe "Main" para Testar as classes e orientar os objetos.
*/

public class TestaFuncionario {
    
    public static void main(String[] args) {
      Gerente g = new Gerente();
      g.setNome("Michael");
      g.setSalario(36.000);
      
      g.setUsuario("michael.2026");
      g.setSenha("Rusbé");
      
     Telefonista t1 = new Telefonista ();
     t1.setNome("Marcia");
     t1.getEstacaoDetrabalho();
  
      
      Secretaria s = new Secretaria();
      s.setNome("Mara");
      s.setSalario(6.500);
      s.setRamal(11);
      
        System.out.println("Nome do Gerente " + g.getNome());
        System.out.println("Usuario do Gerente: " + g.getUsuario());
        System.out.println("Senha do Gerente " + g.getSenha());
        System.out.println("-----------------------------------");
        System.out.println("Nome da Telefonista " + t1.getNome());
        System.out.println("------------------------------------");
        System.out.println("Nome da Secretaria " + s.getNome());
        System.out.println("Salario da Secretaria "+ s.getSalario());
        System.out.println("Ramal da Secretaria " +s.getRamal());
    }
    
}
