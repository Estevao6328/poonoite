package net.maromo.view;


import net.maromo.dao.AlunoDAO;
import net.maromo.model.Aluno;

import java.util.Scanner;

public class AlunoView {

    public AlunoView(){

    }
    public boolean gravarAluno(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Ra do aluno \n");
        int ra = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o Nome do aluno \n");
        String nome = sc.nextLine();
        //Jogar os dados para o seu modelo (objeto)
        Aluno aluno1 = new Aluno();
        aluno1.ra = ra;
        aluno1.nome = nome;
        AlunoDAO dao = new AlunoDAO();
        return dao.gravarNoBanco(aluno1);

    }

}
