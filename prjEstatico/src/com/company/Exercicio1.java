package com.company;

public class Exercicio1 {

    public static void main(String[] args) {
	    Conta conta1 = new Conta();
	    Conta conta2 = new Conta();
	    //Conta.cpmf = 0.0010; //Alterou o cpmf
	    conta2.id = 2;
	    conta2.nomeCliente = "Antonio";
	    conta2.depositar(1000.0);
	    conta2.sacar(200.0);
	    conta2.imprimirExtrato();
	    conta1.id = 1;
	    conta1.nomeCliente = "Zeca";
	    conta1.depositar(5000.0);
	    conta1.sacar(500.0);
	    conta1.imprimirExtrato();

    }
}
