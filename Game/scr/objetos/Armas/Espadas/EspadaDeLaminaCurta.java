package scr.objetos.Armas.Espadas;

import scr.objetos.Itens;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class EspadaDeLaminaCurta extends Itens {
    private int dano;
    public BufferedImage foto;

    public EspadaDeLaminaCurta(int nivel, BufferedImage foto) {
        super("Espada de Lamina curta", 100, nivel);
        this.dano = 10 * nivel;
        this.foto = foto;
    }

    @Override
    public String getTipo() {
        return "Espada";
    }

    @Override
    public String getDescricao() {
        return "Uma de Lamina curta que causa " + dano + " de dano.";
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
     public void getFoto(BufferedImage foto){
        try{
        foto = ImageIO.read(getClass().getResourceAsStream("//res/Shields/Escudos/shield_wood.png"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}