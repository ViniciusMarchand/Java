import java.awt.Color;
import java.awt.Graphics2D;

public class Tiro {
    private int x;
    private int y;
    private int velocidade;

    public Tiro(int inicioX, int inicioY) {
        this.x = inicioX;
        this.y = inicioY;
        velocidade = 15;
    }

    public void pintar(Graphics2D g) {
        g.setColor(Color.red);
        g.fillRect(x, y, 4, 15);
    }

    public void atualiza() {
        y -= velocidade;
    }

    public boolean destroy() {
        return y < 0;
    }
}
