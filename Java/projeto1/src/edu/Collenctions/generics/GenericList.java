package edu.Collenctions.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericList {
    public static void main(String[] args) {
        List listasemGenerics = new ArrayList<>();
        listasemGenerics.add("Elemento 1");
        listasemGenerics.add(10); 
        // A lista permite adicionar qualquer tipo de objeto 
        
        //Com generic
        List<String> listaGeneric = new ArrayList<>();
        listaGeneric.add("objeto1");
        listaGeneric.add("objeto2");

        //Iterando com a lista generics
        for (String elemento : listaGeneric){
            System.out.println(elemento);
        }

        //Iternado sem a generics
        for (Object elemento : listasemGenerics){
            String str = (String) elemento;
            System.out.println(str);
        }
    }
}
