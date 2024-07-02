package MeuJogoJava.src.Inventario;

import MeuJogoJava.src.objetos.Item;
import java.util.ArrayList;
import java.util.List;

public class ArmasInventario implements Categoria {
    private List<Item> armas;

    public ArmasInventario() {
        this.armas = new ArrayList<>();
    }

    @Override
    public void adicionarItem(Item item) {
        armas.add(item);
    }

    @Override
    public void removerItem(Item item) {
        armas.remove(item);
    }

    @Override
    public List<Item> listarItens() {
        return armas;
    }
}
