package model;

public class Produto extends Categoria{
    private int id_produto;
    private String nome;
    private int quantidade;
    private double preco;

    public Produto() {
        this(0, "", 0, 0, 0, "");
    }

    public Produto(int id_produto, String nome, int quantidade, double preco, int id_categoria, String nome_categoria) {
        super(id_categoria, nome_categoria);
        this.id_produto = id_produto;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id_produto=" + id_produto +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}