
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
public class Inimigo {
    private BufferedImage desenho;
    private int x;
    private int y;
    private int velocidade;
    private int direcao;

    public Inimigo(int inicioX, int InicioY, int direcao){
        try{
             desenho = ImageIO.read(new File("imagens/inimigo.png"));
        } catch(IOException e){
            System.out.println("Não foi possível carregar a imagem do inimigo.");
            e.printStackTrace();
        }
        this.x = inicioX;
        this.y = InicioY -100;
        this.velocidade = 2;
        this.direcao = direcao;
        
       
    } 

    public void atualizar(){
        x += velocidade * direcao;
    }
    public void trocaDirecao(){
        direcao = direcao *-1;
        y+=100;
    }
    
    public void pintar(Graphics2D g){
        g.drawImage(desenho, x,y,x + 100,y + 100,0,0,desenho.getWidth(), desenho.getHeight(), null);
    }
    public int getX(){
        return x;
    }
}
