package com.company;

public class Curso {
    //1. Atributos
    private int cursoId;
    private String descricao;
    private String turno;
    private String local;
    private String sala;

    //2. Métodos
    public void listarDados(){
        System.out.println("Id do Curso: " + getCursoId());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Turno: " + getTurno());
        System.out.println("Local: " + getLocal());
        System.out.println("Sala: " + getSala());
        System.out.println("-----------------------");
    }

    //Método para definir acesso
    public void setSala(String sala){
        this.sala = sala;
    }

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getSala() {
        return sala;
    }
}
