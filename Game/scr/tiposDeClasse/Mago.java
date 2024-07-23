package scr.tiposDeClasse;

import scr.objetos.Objetos;
import scr.principais.Personagens;
import scr.main.PainelDeJogo;
import scr.main.KeyHandler;
import javax.imageio.ImageIO;
import java.io.IOException;

@SuppressWarnings("unused") // import de objetos.Objetos;
public class Mago extends Personagens {

    public Mago(PainelDeJogo gp, KeyHandler keyH) {
        super(gp, keyH);
        loadSprites();
        velocidade = 6;
        bounds.y = -30;
        bounds.x = -45;
        bounds.width = 50;
        bounds.height = 70;

    }

    private void loadSprites() {
        try {
            sprite1 = ImageIO.read(getClass().getResourceAsStream("/player/Pyroth/idle/idle_1.png"));
            sprite2 = ImageIO.read(getClass().getResourceAsStream("/player/Pyroth/idle/idle_2.png"));
            sprite3 = ImageIO.read(getClass().getResourceAsStream("/player/Pyroth/idle/idle_3.png"));
            sprite4 = ImageIO.read(getClass().getResourceAsStream("/player/Pyroth/idle/idle_4.png"));
            sprite5 = ImageIO.read(getClass().getResourceAsStream("/player/Pyroth/idle/idle_5.png"));
            sprite6 = ImageIO.read(getClass().getResourceAsStream("/player/Pyroth/idle/idle_6.png"));
            sprite7 = ImageIO.read(getClass().getResourceAsStream("/player/Pyroth/idle/idle_7.png"));
            sprite8 = ImageIO.read(getClass().getResourceAsStream("/player/Pyroth/idle/idle_8.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}    