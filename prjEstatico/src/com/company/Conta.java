package com.company;

/**
 * Classe Conta
 * @author maromo
 * @since mar 2020
 * @version Beta 1
 */
public class Conta {
    //1. Atributos
    public int id;
    public String nomeCliente;
    public double saldo;
    public static double cpmf =0.0038;

    /**
     *
     * @param valor Valor do saque deve ser informado em reais.
     * @return true caso saque seja efetuado, ou false caso
     * não seja efetuado
     */
    public boolean sacar(double valor){
        if(valor <= saldo){
            double imposto = valor * cpmf;
            saldo -= (valor + imposto);
            return true;
        }
        return false;
    }

    /**
     *
     * @param valor Valor do deposito a ser informado em reais.
     * @return true caso o valor seja positivo, e false caso negativo
     */
    public boolean depositar(double valor){
        if(valor < 0){
            return false;
        }
        saldo+= valor;
        return true;
    }

    /**
     * Método para impressão do extrato da conta
     */
    public void imprimirExtrato(){
        System.out.println("id = " + id);
        System.out.println("nomeCliente = " + nomeCliente);
        System.out.println("saldo = " + saldo);

    }

}
