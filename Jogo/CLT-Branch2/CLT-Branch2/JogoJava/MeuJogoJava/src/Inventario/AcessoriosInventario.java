package MeuJogoJava.src.Inventario;

import MeuJogoJava.src.objetos.Item;
import java.util.ArrayList;
import java.util.List;

public class AcessoriosInventario implements Categoria {
    private List<Item> acessorios;

    public AcessoriosInventario() {
        this.acessorios = new ArrayList<>();
    }

    @Override
    public void adicionarItem(Item item) {
        acessorios.add(item);
    }

    @Override
    public void removerItem(Item item) {
        acessorios.remove(item);
    }

    @Override
    public List<Item> listarItens() {
        return acessorios;
    }
}
