package scr.atos;

import scr.interfaceUsuario.UI;
import scr.mapas.Maps;
import scr.principais.Narrador;
import scr.tile.Tile;
import scr.main.PainelDeJogo;
import scr.main.KeyHandler;
import java.awt.*;
import scr.tiposDeClasse.Guerreiro;

public class Prologo {
    private PainelDeJogo painelDeJogo;
    private Guerreiro guerreiro;
    private UI ui;
    private Maps mapaPrologo; // Move a declaração aqui
    private Narrador narrador;
    

    public Prologo(PainelDeJogo painelDeJogo, KeyHandler keyHandler) {
        this.guerreiro = new Guerreiro(painelDeJogo, keyHandler);
        this.painelDeJogo = painelDeJogo;
        this.ui = painelDeJogo.getUi();
        this.mapaPrologo = new Maps(painelDeJogo, "res/maps/mapaPrologo.txt");
    }

    public Maps getMap() {
        return mapaPrologo;
    }


    public void up() {
        ui.update();
        mapaPrologo.update();
        guerreiro.update();

    }

    public void draw(Graphics2D g2){
        ui.draw(g2);
        if(ui.isPrologoDesaparecido()) {
            mapaPrologo.draw(g2);

            // Encontrar as coordenadas do tile com o ID 3
            Point tileCoordinates = mapaPrologo.findTileCoordinates(3);
            if (tileCoordinates != null) {
                int x = tileCoordinates.x * Tile.tileWidth;
                int y = tileCoordinates.y * Tile.tileHeight;
                this.narrador = new Narrador(painelDeJogo, x, y);
                narrador.draw(g2);
            } else {
                this.narrador = new Narrador(painelDeJogo, 100, painelDeJogo.tamanhoTitulo*20);
            }
            guerreiro.draw(g2);
        }
    }
}