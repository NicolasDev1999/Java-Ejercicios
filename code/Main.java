package code;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] marcas = new  String[5];
        Scanner marca = new Scanner(System.in);

        for (int i = 0; i < marcas.length; i++){
            System.out.println("Ingrese una marca de carros: " + (i +1));
            marcas[i] = marca.nextLine();
        }
        System.out.println("Marcas en el registro");
        for (String s : marcas) {
            System.out.println(s);
        }
    }
}