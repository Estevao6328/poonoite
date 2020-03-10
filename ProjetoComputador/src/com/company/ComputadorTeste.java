package com.company;

import java.util.Scanner;

public class ComputadorTeste {

    public static void main(String[] args) {
        Computador c1 = new Computador();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a marca: ");
        c1.marca = sc.nextLine();
        System.out.println("Digite numero Serie: ");
        c1.numeroSerie = Long.parseLong(sc.nextLine());
        System.out.println("Digite o preco: ");
        c1.preco = Double.parseDouble(sc.nextLine());
        System.out.println("Digite o modelo: ");
        c1.modelo = sc.nextLine();
        System.out.println("Digite a cor: ");
        c1.cor = sc.nextLine();
        c1.imprimir();
        c1.calcularValor();
        c1.imprimir();
        //Repete o processo para um c2 (novo objeto)
        //Vou usar o c1 para fazer mais alterações
        int ret = c1.alterarValor(9000.0);
        if(ret==1){
            System.out.println("Preço alterado.");
        }else{
            System.out.println("Valor invalido");
        }
        c1.imprimir();

    }
}
