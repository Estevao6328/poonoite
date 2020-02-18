package com.company;

public class GerenciarUsuarios {

    public static void main(String[] args) {
	    Usuario usu = new Usuario("Maromo",
                "prof@gmail.com",
                "maromo",
                "123");
	    //Usuario usu = new Usuario();

	    usu.provarExistencia();


    }
}
