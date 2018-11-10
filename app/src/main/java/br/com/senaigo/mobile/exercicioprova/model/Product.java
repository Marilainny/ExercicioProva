package br.com.senaigo.mobile.exercicioprova.model;

import java.math.BigDecimal;


public class Product {

    private Integer codigo;

    private String nome;

    private BigDecimal valorUnitario;

    public Product( Integer codigo, String nome, BigDecimal valorUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorUnitario = valorUnitario;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "Product{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", valorUnitario=" + valorUnitario +
                '}';
    }
}
