package edu.dispositivos;

public class Multifuncional implements Digitalizadora, Copiadora, Impressora{
    @Override
    public void copiar() {
        // TODO Auto-generated method stub
        System.out.println("Copiando");
    }
    @Override
    public void digitalizar() {
        // TODO Auto-generated method stub
        System.out.println("Digitalizando");
        
    }
    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        System.out.println("Imprimindo");
    }

}
