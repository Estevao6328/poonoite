package com.company;

public class Main {

    public static void main(String[] args) {
        int vetor[] = {3,5,7,9,11};
        float y = 23.9817f;
        System.out.printf("Valor R$ %.2f \n", y);
        for (int i = 0; i < vetor.length; i++) { //horrivel
            System.out.println(vetor[i]);
        }
        //Elegante
        for (int x: vetor) {
            System.out.println(x);
        }

    }
}
