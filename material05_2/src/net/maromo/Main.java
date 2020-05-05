package net.maromo;

import net.maromo.view.AlunoView;

public class Main {

    public static void main(String[] args) {
        //Chamar a tela para cadastro
        AlunoView visao = new AlunoView();
        boolean retorno = visao.gravarAluno();
        if(retorno){
            System.out.println("Joia Gravou");
        }
    }
}
