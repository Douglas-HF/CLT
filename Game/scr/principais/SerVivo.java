package scr.principais;

import java.awt.image.BufferedImage;
import scr.main.PainelDeJogo;
import java.awt.*;

public abstract class SerVivo {
    PainelDeJogo gp;
    public BufferedImage sprite1,sprite2,sprite3,sprite4,sprite5,sprite6,sprite7,sprite8;
    public boolean EstaVivo;
    private int vida;
    public int vidaMaxima;
    protected String nome;
    public String direcao;
    public int spriteNum = 1;
    public String movimentacao;
    protected Rectangle bounds;
    public int posicaoX, posicaoY, velocidade;
    SerVivo(PainelDeJogo gp){

        this.gp = gp;
    }
    public int getVida() { 
        return vida; 
        
    }
    public String getNome() { 
            return nome; 
    }
    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }
    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

}
