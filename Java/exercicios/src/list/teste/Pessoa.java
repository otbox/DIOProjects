package list.teste;

public class Pessoa {
    private String nome;
    private Double altura;
    private Double peso;

    public Pessoa(String nome, Double altura, Double peso) {
    this.nome = nome;
    this.altura = altura;
    this.peso = peso;
     }
     public String getNome() {
     return nome;
     }
    
     public Double getAltura() {
     return altura;
     }
    
     public void setAltura(Double altura) {
     this.altura = altura;
     }
    
     public Double getPeso() {
     return peso;
     }
    
     public void setPeso(Double peso) {
     this.peso = peso;
     }
     }