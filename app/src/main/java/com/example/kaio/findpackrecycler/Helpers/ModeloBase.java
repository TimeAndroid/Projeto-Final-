package com.example.kaio.findpackrecycler.Helpers;

public class ModeloBase {


    private String nome;
    private String texto;



    public ModeloBase(String nome, String texto) {
        this.nome = nome;
        this.texto = texto;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }


}
