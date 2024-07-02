package MeuJogoJava.src.Inventario;

import MeuJogoJava.src.objetos.Item;
import java.util.List;

public interface Categoria {
    void adicionarItem(Item item);
    void removerItem(Item item);
    List<Item> listarItens();
}
