package net.maromo;

public class Produto {
    //atributos
    private int id;
    private String nome;
    private double valor;

    public Produto(){
            //Passei aqui
            System.out.println("Objeto construído");
    }
    //overload - sobrecarga de método construtor
    public Produto(double valor){
        this.valor = valor;
    }
    public Produto(int id, String nome, double valor){
        this(valor);
        this.id = id;
        this.nome = nome;
    }


    //metodos modificadores de acesso gets e sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
