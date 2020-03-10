package com.company;

public class Computador {
    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;

    public void imprimir(){
        System.out.println("marca = " + marca);
        System.out.println("cor = " + cor);
        System.out.println("modelo = " + modelo);
        System.out.println("numeroSerie = " + numeroSerie);
        System.out.println("preco = " + preco);
    }
    public void calcularValor(){
        if (marca.equalsIgnoreCase("HP")){
            preco*= 1.30;
            return;
        }
        if (marca.equalsIgnoreCase("iBm")){
            preco*= 1.50;
            return;
        }
    }
    public int alterarValor(double valor){
        if(valor>0){
            preco = valor;
            return 1;
        }
        return 0;
    }
}
