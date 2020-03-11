package com.company;

import java.util.Scanner;

public class GerenciarAlunos {

    Aluno[] alunos = new Aluno[5];
    public int indice = 0;

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int opc=0;
	    GerenciarAlunos ga = new GerenciarAlunos();
	    do{
	        //Menu
            System.out.println("Menu");
            System.out.println("1.. Cadastrar");
            System.out.println("2.. Listar");
            System.out.println("3.. Finalizar");
            System.out.println("Digite sua opcao: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:
                    ga.execCadastrar();
                    break;
                case 2:
                    ga.execListar();
                    break;
                case 3:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }while(opc!=3);
    }

    public void execCadastrar(){
        if(indice>=5){
            System.out.println("Não tem mais espaço no vetor");
            return;
        }
        alunos[indice] = new Aluno();
        Scanner sc  =new Scanner(System.in);
        System.out.println("Digite o RA: ");
        alunos[indice].ra = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o nome: ");
        alunos[indice].nome = sc.nextLine();
        indice++; //importante
        System.out.println("Aluno cadastrado com sucesso");
    }
    public void execListar(){
        for (Aluno aluno: alunos) {
            if(aluno!=null) {
                aluno.imprimir();
            }
        }
    }
}
