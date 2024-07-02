package Itens;

public class Consumivel extends Item {
    private int quantidade;

    public Consumivel(String nome, int preco, int nivel, int quantidade) {
        super(nome, preco, nivel);
        this.quantidade = quantidade;
    }

    @Override
    public String getTipo() {
        return "Consumível";
    }

    @Override
    public String getDescricao() {
        return getNome() + " - Quantidade: " + quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
