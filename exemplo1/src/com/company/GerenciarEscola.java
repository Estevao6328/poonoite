package com.company;

public class GerenciarEscola {

    public static void main(String[] args) {
	    //Intenção: Criar dois cursos
        //Em seguida apresentar os dados dos mesmo


        Curso curso1 = new Curso();
        curso1.setCursoId(1);
        curso1.setDescricao("ADS");
        curso1.setTurno("Noite");
        curso1.setLocal("Fatec");
        curso1.setSala("A5");

        Curso curso2 = new Curso();
        curso2.setCursoId(2);
        curso2.setDescricao("Projetos");
        curso2.setTurno("noite");
        curso2.setLocal("Fatec");
        curso2.setSala("A1");


        curso1.listarDados();
        curso2.listarDados();

    }
}
