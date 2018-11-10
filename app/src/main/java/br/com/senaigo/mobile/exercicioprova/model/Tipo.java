package br.com.senaigo.mobile.exercicioprova.model;

import java.util.ArrayList;
import java.util.List;

public class Tipo {

    private String description;

    private List<Product> products;

    public Tipo(String name, String description) {
        this.description = description;
        this.products = new ArrayList<Product>();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Tipo{" +
                ", description='" + description + '\'' +
                ", products=" + products +
                '}';
    }
}
