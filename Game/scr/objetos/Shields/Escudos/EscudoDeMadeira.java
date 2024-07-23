package scr.objetos.Shields.Escudos;

import scr.objetos.Itens;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class EscudoDeMadeira extends Itens {
    private int defesa;
    public BufferedImage foto;

    public EscudoDeMadeira(int nivel, BufferedImage foto) {
        super("Escudo de Madeira", 500, nivel);
        this.defesa = 30 * nivel;
        this.foto = foto;
    }

    @Override
    public String getTipo() {
        return "Escudo";
    }

    @Override
    public String getDescricao() {
        return "Um escudo de madeira que oferece " + defesa + " de defesa.";
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void getFoto(BufferedImage foto){
        try{
        foto = ImageIO.read(getClass().getResourceAsStream("//res/Shields/Escudos/shield_wood.png"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}