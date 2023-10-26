package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        float media;
        List<Integer> numeros = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++) {
            numeros.add(i);
        }
        media = promedio(numeros);
        System.out.println("La Media de los datos es: "+ media);
        for (int i = 101; i <=150 ; i++) {
            numeros.add(i);
        }
        System.out.println(Arrays.toString(numeros.toArray()));
    }

    public static float promedio(List<Integer> listaNumeros){
        int sum = 0;
        float average=0;
        for (int i = 0; i < listaNumeros.size(); i++) {
            sum += listaNumeros.get(i);
        }
        average = sum/listaNumeros.size();
        return average;
    }
}