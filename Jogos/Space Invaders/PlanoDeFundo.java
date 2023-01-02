import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.Graphics2D;
import java.io.IOException;
public class PlanoDeFundo {
    private BufferedImage imagem;
    private int y;
    public PlanoDeFundo(){
        try {
            imagem = ImageIO.read(new File("imagens/espaco.jpg"));
        } catch (IOException e) {
            System.out.println("Não foi possível carregar a imagem.");
            e.printStackTrace();
        }
        
    }
    public void pintar(Graphics2D g) {
        g.drawImage(imagem, 0, y-768*2,imagem.getWidth(), imagem.getHeight(), null);
        g.drawImage(imagem, 0, y,imagem.getWidth(), -imagem.getHeight(), null);
        g.drawImage(imagem, 0, y,imagem.getWidth(), imagem.getHeight(), null);


        y+=5;

        if(y>=770*2){
            y=0;
        }


    }
    
}
