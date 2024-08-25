package controlefluxo;

import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) throws Exception {
        int n, n1; 
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        n1 = in.nextInt();
        imprimir(n, n1);
    }
    static void imprimir(int n, int n1) throws ParametrosInvalidosException{
        if (n < n1){
            for (int x = 1; n < n1; n++){
                System.out.println("Imprimindo o número " + x);
                x++;
            }
        }else{
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
}
