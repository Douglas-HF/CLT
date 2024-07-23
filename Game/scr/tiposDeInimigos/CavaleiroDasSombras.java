package scr.tiposDeInimigos;

import scr.main.PainelDeJogo;
import scr.principais.Inimigos;

public class CavaleiroDasSombras extends Inimigos {
    String nomeInimigo ="Cavaleiro das Sombras";
    public CavaleiroDasSombras(PainelDeJogo gp, int dificuldadeInimigo, String nome){
        super(gp, dificuldadeInimigo);
        obterNomeInimigo("General das Sombras");
    }
}
