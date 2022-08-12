package com.leticia.cadastro;

public class Formulario {
    private String nome;
    private String telefone;
    private String email;
    private String cidade;
    private String uf;
    private char genero;
    private boolean listaEmail;

    public Formulario(String nome, String telefone, String email, String cidade, String uf, char genero, boolean listaEmail) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cidade = cidade;
        this.uf = uf;
        this.genero = genero;
        this.listaEmail = listaEmail;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public boolean isListaEmail() {
        return listaEmail;
    }

    public void setListaEmail(boolean listaEmail) {
        this.listaEmail = listaEmail;
    }

    @Override
    public String toString() {
        return "Formulario{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                ", genero=" + genero +
                ", listaEmail=" + listaEmail +
                '}';
    }
}
