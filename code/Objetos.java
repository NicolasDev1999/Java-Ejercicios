package code;

import java.util.Scanner;

public class Objetos {

    public void combustible (){
        System.out.println("tanque lleno");

    }

    int Km;
    public Objetos(){
        Km = 0;
    }
    public void velocidad(){
        System.out.println("Su velocidad fue");
        Scanner vel = new Scanner(System.in);
        Km = vel.nextInt();
        System.out.println(Km + "Km/h");
    }

    int x;
    String tex;
     private Objetos (int y, String cadena){
         x = y;
         tex = cadena;
     }


    public static void main(String[] args) {
        Objetos comb = new Objetos();
        comb.combustible();
        comb.velocidad();
        Objetos obj2 = new Objetos(5, "numero");
        System.out.println(obj2.x + obj2.tex);

    }

}
