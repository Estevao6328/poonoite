package com.company;

public class Usuario {
    //1. Atributos com visibilidade privada
    private String nome;
    private String email;
    private String login;
    private String senha;

    //Método construtor da classe

    public Usuario(){

    }
    public Usuario(String nome, String email, String login,
                   String senha){
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
        System.out.println("Objeto Construído");

    }

    //2. métodos
    public void provarExistencia(){
        if (nome == null) {
            System.out.println("Objeto não existe");
            return;
        }
        System.out.println("Usuário: " + nome + " existe");
    }

}
