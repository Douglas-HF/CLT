package MeuJogoJava.src.main;

import MeuJogoJava.src.interfaceUsuario.UI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import javax.swing.Timer;

import MeuJogoJava.src.principais.Personagens;
import MeuJogoJava.src.principais.SerVivo;

public class PainelDeJogo extends JPanel implements Runnable  { //implements KeyListener, ActionListener, Runnable
    public final int tituloTamanhoOriginal = 16;
    public final int escala = 5;
    public final int tamanhoTitulo = tituloTamanhoOriginal * escala;
    public final int tamanhoMaximoHorizontal = 16;
    public final int tamanhoMaximoVertical = 12;
    public final int tamanhoComprimento = tamanhoTitulo * tamanhoMaximoHorizontal;
    public final int tamanhoAltura = tamanhoTitulo * tamanhoMaximoVertical;
    final int fps = 60;
    private UI ui;
    KeyHandler keyH = new KeyHandler(this);
    Thread threadDoJogo;
    private Personagens personagens;
    

    //posição inicial do jogador / movimentação básica:
    // corrigir, usando as variáveis gerais presentes em "SerVivo".
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;

    public PainelDeJogo() {
        this.setPreferredSize(new Dimension(tamanhoComprimento, tamanhoAltura));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
        personagens = new Personagens(this,keyH);
        this.ui = new UI(this, 80);
        this.prologo = new Prologo(this, keyH);
    }   
    public Personagens getPlayer() {
        return personagens;
    }

    public UI getUi() {
        return ui;
    }


     public void startGameThread() {
         threadDoJogo = new Thread(this);
         threadDoJogo.start();
     }
     public void run(){
        double IntervaloDesenho = 1000000000/fps; //fazer os 60 fps rodarem.
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while(threadDoJogo != null){

            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / IntervaloDesenho;
            lastTime = currentTime;

            if(delta >= 1) {
            update();
            repaint();
            delta--;
            }
        }
    }
        public enum EstadoDoJogo {
            Menu,
            Pausado,
            Jogando
        }
        public enum EstadoPersonagem {
            Dialogo,
            Inventario,
            Combate,
            Ocioso
        }
        
        private EstadoPersonagem estadoPersonagem = EstadoPersonagem.Ocioso;

        public void setEstadoPersonagem(EstadoPersonagem novoEstado) {
            this.estadoPersonagem = novoEstado;
            repaint();
        }
        public EstadoPersonagem getEstadoPersonagem() {
            return estadoPersonagem;
        }
        public EstadoDoJogo estadoDoJogo = EstadoDoJogo.Menu;

    public void setEstadoDoJogo(EstadoDoJogo novoEstado) {
        this.estadoDoJogo = novoEstado;
        repaint();
    }

    public EstadoDoJogo getEstadoDoJogo() {
        return estadoDoJogo;
    }

     public void update(){
            if (keyH.paraCima == true){
                playerY -= playerSpeed;
            }
            else if (keyH.paraBaixo == true){
                playerY += playerSpeed;
            }
            else if (keyH.paraDireita == true) {
                playerX += playerSpeed;
            }
            else if (keyH.paraEsquerda == true) {
                playerX -= playerSpeed;
            }
     }


     public void paintComponent(Graphics g) {
         super.paintComponent(g);
         Graphics2D g2 = (Graphics2D)g;
         //colocar nesta linha o player.
         g2.fillRect(playerX, playerSpeed, tamanhoComprimento, tamanhoAltura);
         
         if (estadoDoJogo == EstadoDoJogo.Jogando) {
            ui.drawHealthBar(g2);
            if (estadoPersonagem == EstadoPersonagem.Inventario) {
                ui.draw(g2);
            } else if (estadoPersonagem == EstadoPersonagem.Dialogo) {
                ui.draw(g2);
            }
        }

        g2.dispose();
    }



        }


