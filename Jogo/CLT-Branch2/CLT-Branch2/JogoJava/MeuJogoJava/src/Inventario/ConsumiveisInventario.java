package MeuJogoJava.src.Inventario;

import MeuJogoJava.src.objetos.Item;
import java.util.ArrayList;
import java.util.List;

public class ConsumiveisInventario implements Categoria {
    private List<Item> consumiveis;

    public ConsumiveisInventario() {
        this.consumiveis = new ArrayList<>();
    }

    @Override
    public void adicionarItem(Item item) {
        consumiveis.add(item);
    }

    @Override
    public void removerItem(Item item) {
        consumiveis.remove(item);
    }

    @Override
    public List<Item> listarItens() {
        return consumiveis;
    }
}
