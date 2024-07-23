package scr.objetos.Armas.Cajados;

import scr.objetos.Itens;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class CajadoDeJade extends Itens {
    private int consumoMana;
    private int dano;
    public BufferedImage foto;

    public CajadoDeJade(int nivel, BufferedImage foto) {
        super("Cajado de Prata", 200, nivel);
        this.consumoMana = 20 * nivel;
        this.dano = 30 * nivel;
        this.foto = foto;
    }

    @Override
    public String getTipo() {
        return "Cajado";
    }

    @Override
    public String getDescricao() {
        return "Um cajado de Jade que consome " + consumoMana + " de mana.";
    }

    public int getConsumoMana() {
        return consumoMana;
    }

    public void setConsumoMana(int consumoMana) {
        this.consumoMana = consumoMana;
    }
    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
    public void getFoto(BufferedImage foto){
        try{
        foto = ImageIO.read(getClass().getResourceAsStream("//res/Armas/Cajado2.png"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}