package scr.tiposDeInimigos;

import scr.main.PainelDeJogo;
import scr.principais.Inimigos;

public class SoldadoDasSombras extends Inimigos {
    //private String nomeInimigo = "Soldado das Sombras";
    public SoldadoDasSombras(PainelDeJogo gp, int dificuldadeInimigo, String nome){
        super(gp, dificuldadeInimigo);
        obterNomeInimigo("General das Sombras");
    }
}
