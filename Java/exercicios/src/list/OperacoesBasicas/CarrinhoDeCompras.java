package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> ListItem;

    public CarrinhoDeCompras() {
        this.ListItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        ListItem.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome){
        List<Item> itensRemover = new ArrayList<>();
        for (Item I : ListItem){
            if(I.getNome().equalsIgnoreCase(nome)){
                itensRemover.add(I);
            }
        }
        ListItem.removeAll(itensRemover);
    }
    public double calcularValorTotal() {
        double total = 0;
        for (Item I : ListItem){
            total += I.getPreco() * I.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        System.out.println(ListItem);
    }
}
