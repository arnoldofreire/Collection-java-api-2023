package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class CadastroProdutos {

    private static String[] args;
    private final Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome() {
        return new TreeSet<>(produtoSet);
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos.args = args;
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 5", 15.0, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 20.0, 10);
        cadastroProdutos.adicionarProduto(3L, "Produto 3", 10.0, 2);
        cadastroProdutos.adicionarProduto(9L, "Produto 9", 15.0, 2);

       // System.out.println(cadastroProdutos.exibirProdutoPorNome());
        System.out.println(cadastroProdutos.exibirProdutoPorPreco());


    }
}
