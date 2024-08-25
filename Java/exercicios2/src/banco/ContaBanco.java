package banco;

import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        int Numero;
        String Agencia, Nome;
        double Saldo;
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agencia !");
        Numero = in.nextInt();
        System.out.println("Por favor, digite sua Agencia !");
        Agencia = in.next();
        System.out.println("Por favor, digite o seu Nome !");
        Nome = in.next();
        System.out.println("Por favor, digite o valor a ser Depositado !");
        Saldo = in.nextDouble();

        System.out.println("Olá "+Nome+" , obrigado por criar uma conta em nosso banco, sua agência é "+Agencia +" , conta " + Numero +" e seu saldo "+ Saldo +" já está disponível para saque");
    }
}
