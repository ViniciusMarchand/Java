

package JavaPOOaula07;

public class aula07 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty boy", "França", 31, 1.75f, 98.9f, 11, 3 , 1);

        l[1] = new Lutador("Putscript" , "Brasil" , 29, 1.68f, 57.8f, 14, 2 , 3);

        l[2] = new Lutador("SnapShadow" , "EUA" , 35, 1.65f, 80.9f, 12, 2 , 1);

        l[3] = new Lutador("Dead Code" , "Australia" , 28, 1.93f, 81.6f, 13, 0 , 2);

        l[4] = new Lutador("UFOCobol" , "Brasil" , 37, 1.70f, 119.3f, 5, 4 , 3);

        l[5] = new Lutador("Nerdaart" , "EUA" , 30, 1.81f, 105.7f, 12, 2 , 4);

        Luta luta1 = new Luta();
        luta1.marcarLuta(l[4], l[5]);
        System.out.println();
        luta1.lutar();
        System.out.println("-----------------------------");
        Luta luta2 = new Luta();
        luta2.marcarLuta(l[2], l[3]);
        luta2.lutar();

    }
}
