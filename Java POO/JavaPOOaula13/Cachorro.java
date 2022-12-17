package JavaPOOaula13;

public class Cachorro extends Mamifero{
    public void reagir(String f){
        if(f.equals("toma comida") || f.equals("Ola")){
            System.out.println("Abanar e Latir");
        }else{
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min){
        if(hora<12){
           System.out.println("Abanar");
        }else if (hora>=18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Latir e Abanar");
        }
    }

    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar o rabo");
        }else{
            System.out.println("Rosnar e Latir");
        }
    }
}
