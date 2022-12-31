import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Graphics2D;
import java.io.IOException;

public class Nave {

    BufferedImage desenho;
    private int x;
    private boolean podeAtirar;
    private int tempo;
    private int velocidade;

    public Nave() {
        try {
            desenho = ImageIO.read(new File("imagens/nave.png"));
        } catch (IOException e) {
            System.out.println("Não foi possível carregar a imagem.");
            e.printStackTrace();
        }

        x = 683;
        velocidade = 10;
        podeAtirar = true;
        tempo = 0;

    }

    public void pintar(Graphics2D g) {
        g.drawImage(desenho, x, 550, x + 100, 550 + 100, 0, 0, desenho.getWidth(), desenho.getHeight(), null);
    }

    public Tiro atirar() {
        podeAtirar = false;
        Tiro novoTiro = new Tiro(x + 48, 550);
        return novoTiro;
    }

    public void movimentar(int valor) {
        if (valor == 1) {
            x += velocidade;
        } else if (valor == -1) {
            x -= velocidade;
        }

        if (tempo >= 10) {
            podeAtirar = true;
            tempo = 0;
        }
        tempo++;
    }

    public boolean podeAtirar() {
        return podeAtirar;
    }
}
