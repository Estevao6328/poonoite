package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// somar dois valores
        //Uso da classe Scanner para leitura
        Scanner entrada = new Scanner(System.in);

        int a, b, soma;
        //Entrada do usuario
        System.out.println("Digite o valor de a: ");
        a = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite o valor de b: ");
        b = Integer.parseInt(entrada.nextLine());
        soma = a + b;
        System.out.println("Resultado: " + soma);
        //Para variável do tipo String
        String nome;
        System.out.println("Digite seu nome completo");
        nome = entrada.nextLine();
        System.out.println("Nome: " + nome);

    }
}
