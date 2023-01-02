import java.awt.Color;
import java.awt.Graphics2D;

public class Tiro {
    private int x;
    private int y;
    private int tamX = 3;
    private int tamY = 15;
    private int velocidade;

    public Tiro(int inicioX, int inicioY) {
        this.x = inicioX;
        this.y = inicioY;
        velocidade = 15;
    }

    public void pintar(Graphics2D g) {
        g.setColor(Color.red);
        g.fillRect(x, y, tamX, tamY);
    }
    public void atualiza() {
        y -= velocidade;
    }

    public boolean destroy() {
        return y < 0;
    }

    public boolean colideCom(Inimigo inimigos){
        if(x>=inimigos.getX() && x+tamX<inimigos.getX()+inimigos.getTam()){
            if(y<= inimigos.getY()+ inimigos.getTam()){
                return true;
            }
        }
        return false;
    }
}
