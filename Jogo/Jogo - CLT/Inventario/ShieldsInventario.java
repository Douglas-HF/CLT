package Inventario;

import Itens.Item;
import java.util.ArrayList;
import java.util.List;

public class ShieldsInventario implements Categoria {
    private List<Item> shields;

    public ShieldsInventario() {
        this.shields = new ArrayList<>();
    }

    @Override
    public void adicionarItem(Item item) {
        shields.add(item);
    }

    @Override
    public void removerItem(Item item) {
        shields.remove(item);
    }

    @Override
    public List<Item> listarItens() {
        return shields;
    }
}
