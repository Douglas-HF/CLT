package scr.tiposDeInimigos;

import scr.principais.Inimigos;
import scr.main.PainelDeJogo;

public class Javali extends Inimigos {
    //private String nomeInimigo = "Javali";
    public Javali(PainelDeJogo gp, int dificuldadeInimigo, String nome){
        super(gp, dificuldadeInimigo);
        obterNomeInimigo("General das Sombras");
    }
    //private void loadSprites() {
        //try {
            //idle = ImageIO.read(getClass().getResourceAsStream("res/inimigos/Javali.png"));
       // } catch (IOException e) {
           // e.printStackTrace();
        //}
    //}
}