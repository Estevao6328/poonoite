package com.company;

import java.util.Scanner;

public class ContaTeste {

    public Conta cc = new Conta();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc=0;
        ContaTeste ct = new ContaTeste();
        do{
            //Menu
            System.out.println("1.. Cadastrar");
            System.out.println("2.. Depositar");
            System.out.println("3.. Sacar");
            System.out.println("4.. Consultar");
            System.out.println("9.. Sair");
            System.out.println("Digite sua opcao: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:
                    ct.execCadastrar();
                    break;
                case 2:
                    ct.execDepositar();
                    break;
                case 3:
                    ct.execSacar();
                    break;
                case 4:
                    ct.execConsultar();
                    break;
                case 9:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opcao Invalida");
            }
        }while(opc!=9);

    }

    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        cc.nomeCliente = sc.nextLine();
        System.out.println("Digite o numero da conta: ");
        cc.conta = sc.nextLine();
        System.out.println("Digite a agencia:  ");
        cc.agencia = sc.nextLine();
        System.out.println("Cadastro efetuado com sucesso");
    }
    public void execConsultar(){
        System.out.println("Dados da Conta");
        cc.imprimir();
    }
    public void execSacar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double saque = Double.parseDouble(sc.nextLine());
        int ret = cc.sacar(saque);
        if(ret==1){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Conta sem saldo suficiente");
        }
    }
    public void execDepositar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        double deposito = Double.parseDouble(sc.nextLine());
        cc.depositar(deposito);
        System.out.println("Deposito efetuado com sucesso.");
    }
}
