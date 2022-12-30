import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
public class Inimigo {
    private BufferedImage desenho;
    private int x;
    private int y;
   

    public Inimigo(int inicioX, int InicioY){
        try{
             desenho = ImageIO.read(new File("imagens/inimigo.png"));
        } catch(IOException e){
            System.out.println("Não foi possível carregar a imagem do inimigo.");
            e.printStackTrace();
        }
        this.x = inicioX;
        this.y = InicioY;
       
    } 
    public void atualizar(){
        x++;
        if(x>1366){
            x=0;
        }
    }
    public void pintar(Graphics2D g){
        g.drawImage(desenho, x,y,x + 100,y + 100,0,0,desenho.getWidth(), desenho.getHeight(), null);
    }
}
