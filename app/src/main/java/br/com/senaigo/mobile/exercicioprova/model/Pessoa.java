package br.com.senaigo.mobile.exercicioprova.model;

public class Pessoa {

    protected String nome;

    public Pessoa(final String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                '}';
    }


}
