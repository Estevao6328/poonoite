package net.maromo;

public class Cliente {
    public int id;
    public String nome;
    public Sexo sexo;

    public void imprimir(){
        System.out.println("id = " + id);
        System.out.println("nome = " + nome);
        System.out.println("sexo = " + sexo);
    }
}
