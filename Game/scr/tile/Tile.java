package scr.tile;

import java.awt.*;
import java.awt.image.BufferedImage;
import scr.main.PainelDeJogo;

public class Tile {
     // MATERIAIS ESTATICOS
     private static PainelDeJogo gp;
 
     // CLASSE
     public BufferedImage image;
     public boolean colission = false;
     public static final int tileWidth = gp.tamanhoTitulo, tileHeight = gp.tamanhoTitulo;
 
     public void update() {
 
     }
 
     public void draw(Graphics2D g2, int x, int y){
         g2.drawImage(image,x,y,tileWidth,tileHeight,null);
 
     }
 
     public boolean isSolid() {
         return false;
     }
}