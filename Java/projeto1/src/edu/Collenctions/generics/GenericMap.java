package edu.Collenctions.generics;

import java.util.HashMap;
import java.util.Map;

public class GenericMap {
    public static void main(String[] args) {
        // é necessario uma chave e um valor, alem disso podemos utilizar o 
        //diamond operator para tipar a chave e o valor  
        Map mapSemGenerics = new HashMap();
        mapSemGenerics.put("Chave1", 10); 

        Map<String, Integer> mapComGenerics =  new HashMap<>();
        mapComGenerics.put("Chave1", 10);

        //Iterando com Generics 
        for (Map.Entry<String, Integer> entry : mapComGenerics.entrySet()){
            String chave = entry.getKey();
            int valor = entry.getValue();
            System.out.println("Chave " + chave + " Valor " + valor);
        }

        //Iternado sem Generics 
        for (Object obj : mapSemGenerics.entrySet()){
            Map.Entry entry = (Map.Entry) obj;
            String chave = (String) entry.getKey();
            String valor = (String) entry.getValue();
            System.out.println("Chave " + chave + " Valor " + valor);
        }
    }
}
