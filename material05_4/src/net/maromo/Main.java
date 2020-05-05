package net.maromo;

public class Main {

    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.id = 10;
        c.nome = "João";
        c.sexo = Sexo.masculino;
        c.imprimir();

    }
}
