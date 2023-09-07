package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    private List<Item> itensList;

    public CarrinhoDeCompras() {
        this.itensList = new ArrayList<>();
    }

//     adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
    public void adicionarItem(String nome, double preco, int quantidade){
        itensList.add(new Item(nome, preco, quantidade));
    }

    // removerItem(String nome): Remove um item do carrinho com base no seu nome.
    public void removerItem(String nome){
        this.itensList.removeIf(item -> item.getNome().equals(nome));
    }

    // calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
    public double calcularValorTotal()
    {
        double valorTotal = 0;
        for (Item item : itensList) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    // exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
    public void exibirItens(){
        for (Item item : itensList) {
            System.out.print(item);
        }
        System.out.println("\nValor total: " + calcularValorTotal());
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras [itensList=" + itensList + "]"
                + "\nValor total: " + calcularValorTotal();

    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        
        carrinhoDeCompras.adicionarItem("Item 1", 10.0, 1);
        carrinhoDeCompras.adicionarItem("Item 2", 20.0, 2);
        carrinhoDeCompras.adicionarItem("Item 3", 30.0, 3);
        carrinhoDeCompras.adicionarItem("Item 3", 30.0, 3);
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Item 3");
        carrinhoDeCompras.exibirItens();
    }
        
}
