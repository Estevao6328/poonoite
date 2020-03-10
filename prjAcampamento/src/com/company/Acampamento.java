package com.company;

public class Acampamento {

    public String nome;
    public char equipe;
    public int idade;

    public void imprimir(){
        System.out.println("Dados do campista: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Equipe: " + equipe);
    }
    public void separarGrupo(){
        //logica para separar o grupo
        if(idade<6){
            equipe = '-';
            return;
        }
        if(idade<11){
            equipe = 'A';
            return;
        }
        if(idade<21){
            equipe= 'B';
            return;
        }
        equipe = 'C';
    }
}
