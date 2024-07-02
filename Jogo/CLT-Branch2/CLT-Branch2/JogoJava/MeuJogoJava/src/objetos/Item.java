package MeuJogoJava.src.objetos;

public abstract class Item extends Objetos {
    private String nome;
    private int custo;
    private int nivel;

    public Item(String nome, int custo, int nivel) {
        this.nome = nome;
        this.custo = custo;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public int getCusto() {
        return custo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public abstract String getTipo();
    public abstract String getDescricao();
}
