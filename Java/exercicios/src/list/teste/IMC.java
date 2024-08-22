package list.teste;

public class IMC {
    
     public static Double getIMC(Pessoa pessoa){
     return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
     }
    
     public static String getClassificacao(Pessoa pessoa){
     Double imc = IMC.getIMC(pessoa);
     if (imc < 18.5){
 return "Abaixo do peso";
 } else if (imc < 25){
 return "Peso normal";
 } else if (imc < 30){
 return "Sobrepeso";
 } else if (imc < 35){
 return "Obesidade nivel 1";
 } else if (imc < 40){
 return "Obesidade nivel 2";
 } else{
 return "Obesidade nivel 3";
 }
 }

 public Double getIMCMedio() {
    double imcMedio = 0.0;
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
 }