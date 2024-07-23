import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        itens.add(item);
        System.out.println("Item adicionado ao carrinho: " + nome);
    }

    public void removerItem(String nome) {
        Iterator<Item> iterator = itens.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getNome().equals(nome)) {
                iterator.remove();
                System.out.println("Item removido do carrinho: " + nome);
                return;
            }
        }
        System.out.println("Item não encontrado no carrinho: " + nome);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        System.out.println("Itens no carrinho:");
        for (Item item : itens) {
            System.out.println("Nome: " + item.getNome() + " | Preço unitário: R$" + item.getPreco() + " | Quantidade: " + item.getQuantidade());
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionar itens ao carrinho
        carrinho.adicionarItem("Camiseta", 29.99, 2);
        carrinho.adicionarItem("Calça Jeans", 79.90, 1);
        carrinho.adicionarItem("Tênis Esportivo", 149.99, 1);

        // Exibir itens no carrinho
        carrinho.exibirItens();

        // Calcular e exibir o valor total do carrinho
        System.out.println("Valor total do carrinho: R$" + carrinho.calcularValorTotal());

        // Remover um item do carrinho
        carrinho.removerItem("Calça Jeans");

        // Exibir itens atualizados no carrinho
        carrinho.exibirItens();

        // Calcular e exibir o valor total do carrinho novamente
        System.out.println("Valor total do carrinho: R$" + carrinho.calcularValorTotal());
    }
}
