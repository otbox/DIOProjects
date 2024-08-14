package edu.Veiculos;

public abstract class Veiculo {
    private String placa;
    private int QuantidadeGasolina;

    public String getPlaca() {
        return placa;
    }
    public int getQuantidadeGasolina() {
        return QuantidadeGasolina;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setQuantidadeGasolina(int quantidadeGasolina) {
        QuantidadeGasolina = quantidadeGasolina;
    }

    public abstract void ligar();
}
