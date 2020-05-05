package net.maromo.dao;

import net.maromo.model.Aluno;

public class AlunoDAO {
    public boolean gravarNoBanco(Aluno aluno){
        //colocar a logica para abrir o banco  e inserir os dados do aluno
        System.out.println("Gravado com sucesso");
        System.out.println("Ra gravado: " + aluno.ra);
        System.out.println("Nome gravado: " + aluno.nome);
        return true;
    }
}
