import javax.swing.JPanel;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Color;



public class SpaceInvaders extends JPanel implements Runnable, KeyListener {
    Font minhaFont = new Font("serif", Font.BOLD, 20);
    private Nave nave;
    private int direcao;
    private ArrayList<Tiro> tiros;
    private ArrayList<Inimigo> inimigos;
    private PlanoDeFundo planoDeFundo;

    public SpaceInvaders() {
        nave = new Nave();
        planoDeFundo = new PlanoDeFundo();
        tiros = new ArrayList<Tiro>();
        inimigos = new ArrayList<Inimigo>();
        for (int i = 0; i < 60; i++) {
            inimigos.add(new Inimigo(60 + i % 20 * 50, 100 + 60 + i / 20 * 50, 1));
        }
        Thread lacoDoJogo = new Thread(this);
        lacoDoJogo.start();
    }

    @Override
    public void run() {
        while (true) {
            update();
            repaint();
            dorme();
        }

    }

    private void update() {
        nave.movimentar(direcao);
        for (int i = 0; i < inimigos.size(); i++) {
            inimigos.get(i).atualizar();
        }
        for (int i = 0; i < tiros.size(); i++) {
            tiros.get(i).atualiza();
            if (tiros.get(i).destroy()) {
                tiros.remove(i);
                i--;
            } else {
                for (int j = 0; j < inimigos.size(); j++) {
                    if (tiros.get(i).colideCom(inimigos.get(j))) {
                        inimigos.remove(j);
                        j--;
                        tiros.remove(i);
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < inimigos.size(); i++) {
            if (inimigos.get(i).getX() <= 0 || inimigos.get(i).getX() >= 1330 - 100) {
                for (int j = 0; j < inimigos.size(); j++) {
                    inimigos.get(j).trocaDirecao();
                }
                break;
            }
        }
    }

    int x = 0;

    public void paintComponent(Graphics g2) {
        super.paintComponent(g2);
    
        Graphics2D g = (Graphics2D) g2.create();
        g.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(
                RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        planoDeFundo.pintar(g);
        Estrelas estrelas = new Estrelas(new Random().nextInt(1600),new  Random().nextInt(700));
        estrelas.pintar(g);
        estrelas.pintar(g);
        for (int i = 0; i < inimigos.size(); i++) {
            inimigos.get(i).pintar(g);
        }
        nave.pintar(g);
        for (int i = 0; i < tiros.size(); i++) {
            tiros.get(i).pintar(g);
        }
        if(inimigos.size() == 0){
            g.setColor(Color.white);
            g.setFont(minhaFont);
            g.drawString("VOCÊ GANHOU!!!", 1366/2-54, 700/2); 
        }

    }
    
    private void dorme() {
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_D) {
            direcao = 1;
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            direcao = -1;
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE && nave.podeAtirar()) {
            tiros.add(nave.atirar());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_D) {
            direcao = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            direcao = 0;
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
