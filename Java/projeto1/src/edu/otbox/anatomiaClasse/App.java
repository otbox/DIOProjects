package edu.otbox.anatomiaClasse;

/** @author otbox
 * @version 1.0
 * 
 * Esse é uma classe aonde estou testando para o bootcamp da DIO
 */
public class App {
    public static void main(String[] args) throws Exception {

        String nome = args[0];
        String idade = args[1];
        if (nome.equals("Otavio"))
            System.out.println("Meu criador");
        else 
            System.out.println("Ola");
        System.out.println("Hello, World!");
        Pessoa otavio = new Pessoa();
        otavio.trabalhar();
        otavio.trabalhar();
        System.out.println(otavio.dinheiro);
        System.out.println(nome + " " + idade);

        for (String coisas : args){
            System.out.println("Argumento: " + coisas);
        }
        try {
            String cepformatado = formatarCEP("111111111");
            System.out.println(cepformatado);
        } catch (excessao e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

    static String formatarCEP(String Cep) throws excessao {
        if(Cep.length() != 8)
            throw new excessao();
        return "99999999";
    }
}
