package edu.Veiculos;

public class Pista {
    public static void main(String[] args) {
        Moto pop100 = new Moto();
        Carro Gol = new Carro();
        Veiculo Generico = Gol;
        Generico.setPlaca("DYE7777");
        System.out.println(Generico.getPlaca());
    }
}
