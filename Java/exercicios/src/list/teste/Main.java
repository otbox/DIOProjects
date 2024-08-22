package list.teste;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
public static void main (String args[]){
Scanner inNumerico = new Scanner(System.in);
Scanner inString = new Scanner(System.in);
ArrayList<Pessoa> pessoas = new ArrayList<>();
 String nome;
 Double peso;
 Double altura;
 Double imcMedio;

 System.out.println("Digite o Nome, Peso e Altura de uma pessoa (END para encerrar): ");
 do{
 System.out.println("Nome: ");
 nome = inString.nextLine();
 if(!nome.equals("END")){
 System.out.println("Peso (kg): ");
 peso = inNumerico.nextDouble();
 System.out.println("Altura (m): ");
 altura = inNumerico.nextDouble();
 Pessoa pessoa = new Pessoa(nome, peso, altura);
 pessoas.add(pessoa);
 System.out.println(pessoa.getNome()+": "+IMC.getClassificacao(pessoa));
 }
 }while(!nome.equals("END"));

 imcMedio = IMC.getIMCMedio(pessoas);
 System.out.println("IMC medio do grupo= "+IMC.getIMCMedio(pessoas));

 for(Pessoa p : pessoas){
 System.out.println(p.getNome()+" "+IMC.getComparacao(p,imcMedio));
 }
 }
 }