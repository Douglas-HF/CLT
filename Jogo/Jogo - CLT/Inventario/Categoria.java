package Inventario;

import Itens.Item;
import java.util.List;

public interface Categoria {
    void adicionarItem(Item item);
    void removerItem(Item item);
    List<Item> listarItens();
}
