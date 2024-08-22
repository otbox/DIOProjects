package list.teste;

import java.util.ArrayList;

public class GrupoIMC {
    private Double imcMedio = 0.0;
    private ArrayList<Pessoa> pessoas;
    public GrupoIMC() {
    this.pessoas = new ArrayList<>();
    }
    
     public void addPessoa(Pessoa pessoa) {
     this.pessoas.add(pessoa);
     }
    
     public Double getIMCMedio() {
     if (!this.pessoas.isEmpty()) {
     Double soma = 0.0;
     for (Pessoa p : this.pessoas) {
     soma += IMC.getIMC(p);
     }
     return imcMedio = (soma / this.pessoas.size());
     } else {
     return 0.0;
     }
     }
    
     public void showComparacao() {
     for (Pessoa pessoa : this.pessoas) {
     if (IMC.getIMC(pessoa) < this.imcMedio) {
     System.out.println(pessoa.getNome() + ": IMC abaixo da media do grupo");
     }
     System.out.println(pessoa.getNome() + "IMC maior ou igual a media do grupo");
     }
     }
}