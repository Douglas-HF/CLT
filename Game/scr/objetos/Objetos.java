package scr.objetos;

//import MeuJogoJava.src.principais.Personagens;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

//import scr.principais.Personagens;

public abstract class Objetos {
    public BufferedImage image;
    public String nome;
    public List<Objetos> listaItens;

    public Objetos() {
        listaItens = new ArrayList<>();
    }

    public void addItem(Objetos item) {
        listaItens.add(item);
    }

  //  public abstract void usouItem(Personagens personagem);
}
