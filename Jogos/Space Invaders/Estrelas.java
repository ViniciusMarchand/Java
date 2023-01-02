import java.awt.Color;
import java.awt.Graphics2D;
public class Estrelas {
    private int x;
    private int y;
    public Estrelas(int inicioX, int inicioY){
        this.x = inicioX;
        this.y = inicioY;
    }
    public void pintar(Graphics2D g) {
        g.setColor(Color.white);
        g.fillRect(x, y, 3, 5);
    }
}
