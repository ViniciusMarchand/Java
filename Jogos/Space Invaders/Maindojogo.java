import javax.swing.JFrame;

public class Maindojogo {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Space Invaders");
        //janela.setSize(1366, 768);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janela.setUndecorated(true);
        janela.setLayout(null);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SpaceInvaders invasaoAlienigina = new SpaceInvaders();
        invasaoAlienigina.setBounds(0, 0, 1366, 768);
        janela.add(invasaoAlienigina);
        janela.addKeyListener(invasaoAlienigina);
        janela.setVisible(true);

    }

}