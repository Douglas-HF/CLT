package scr.objetos.Shields.Escudos;

import scr.objetos.Itens;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class EscudoMagico extends Itens {
    private int defesa;
    public BufferedImage foto;

    public EscudoMagico(int nivel, BufferedImage foto) {
        super("Escudo Magico", 600, nivel);
        this.defesa = 45 * nivel;
        this.foto = foto;
    }

    @Override
    public String getTipo() {
        return "Escudo";
    }

    @Override
    public String getDescricao() {
        return "Um escudo mágico que oferece " + defesa + " de defesa.";
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void getFoto(BufferedImage foto){
        try{
        foto = ImageIO.read(getClass().getResourceAsStream("//res/Shields/Escudos/shield_blue.png"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}