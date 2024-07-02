package MeuJogoJava.src.Inventario;

import MeuJogoJava.src.objetos.Item;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventario {
    private Map<String, Categoria> categorias;

    public Inventario() {
        this.categorias = new HashMap<>();
        this.categorias.put("Armas", new ArmasInventario());
        this.categorias.put("Acessorios", new AcessoriosInventario());
        this.categorias.put("Shields", new ShieldsInventario());
        this.categorias.put("Consumiveis", new ConsumiveisInventario());
    }

    public void adicionarItem(String categoria, Item item) {
        Categoria cat = categorias.get(categoria);
        if (cat != null) {
            cat.adicionarItem(item);
        } else {
            System.out.println("Categoria não encontrada.");
        }
    }

    public void removerItem(String categoria, Item item) {
        Categoria cat = categorias.get(categoria);
        if (cat != null) {
            cat.removerItem(item);
        } else {
            System.out.println("Categoria não encontrada.");
        }
    }

    public List<Item> listarItens(String categoria) {
        Categoria cat = categorias.get(categoria);
        if (cat != null) {
            return cat.listarItens();
        } else {
            System.out.println("Categoria não encontrada.");
            return null;
        }
    }

    public void realocarItem(String categoriaOrigem, String categoriaDestino, Item item) {
        Categoria origem = categorias.get(categoriaOrigem);
        Categoria destino = categorias.get(categoriaDestino);
        if (origem != null && destino != null) {
            origem.removerItem(item);
            destino.adicionarItem(item);
        } else {
            System.out.println("Categoria não encontrada.");
        }
    }
}