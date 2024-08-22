package list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.altura = altura;
        this.idade =  idade;
        this.nome = nome;
    }
    @Override
    public int compareTo(Pessoa p) {
        // TODO Auto-generated method stub
        return Integer.compare(idade, p.getIdade());
    }
    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
}
class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p0, Pessoa p1) {
        Double.compare(p0.getAltura(), p1.getAltura());
        return 0;
    }
    
}

