package com.company;

public class Conta {
    //1. Atributos
    public int id;
    public String nomeCliente;
    public double saldo;
    public static double cpmf =0.0038;

    public boolean sacar(double valor){
        if(valor <= saldo){
            double imposto = valor * cpmf;
            saldo -= (valor + imposto);
            return true;
        }
        return false;
    }

    public boolean depositar(double valor){
        if(valor < 0){
            return false;
        }
        saldo+= valor;
        return true;
    }

    public void imprimirExtrato(){
        System.out.println("id = " + id);
        System.out.println("nomeCliente = " + nomeCliente);
        System.out.println("saldo = " + saldo);

    }

}
