package scr.objetos.Armas.Cajados;

import scr.objetos.Itens;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class CajadoDePrata extends Itens {
    private int consumoMana;
    public BufferedImage foto;
    private int dano;

    public CajadoDePrata(int nivel, BufferedImage foto) {
        super("Cajado de Prata", 100, nivel);
        this.consumoMana = 15 * nivel;
        this.foto = foto;
        this.dano = 15 * nivel;
    }

    @Override
    public String getTipo() {
        return "Cajado";
    }

    @Override
    public String getDescricao() {
        return "Um cajado de prata que consome " + consumoMana + " de mana.";
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
        foto = ImageIO.read(getClass().getResourceAsStream("//res/Armas/Cajado1.png"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}