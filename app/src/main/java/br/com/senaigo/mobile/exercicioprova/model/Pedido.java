package br.com.senaigo.mobile.exercicioprova.model;

import java.math.BigDecimal;

public class Pedido {

    private Integer numeroPedido;

    private BigDecimal quantidade;

    private BigDecimal desconto;

    private BigDecimal totalDesconto;

    public Integer getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(Integer numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public BigDecimal getTotalDesconto() {
        return totalDesconto;
    }

    public void setTotalDesconto(BigDecimal totalDesconto) {
        this.totalDesconto = totalDesconto;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numeroPedido=" + numeroPedido +
                ", quantidade=" + quantidade +
                ", desconto=" + desconto +
                ", totalDesconto=" + totalDesconto +
                '}';
    }
}
