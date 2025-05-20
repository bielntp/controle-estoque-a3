package main;

import model.Categoria;
import model.Produto;

public class Main {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.setId_produto(1);
        p.setNome("Notebook");
        p.setQuantidade(10);
        p.setPreco(1000.00);

        Categoria c = new Categoria();
        c.setId_categoria(1);
        c.setNome_categoria("Informática");

        System.out.println(c);
        System.out.println(p);
    }
}
