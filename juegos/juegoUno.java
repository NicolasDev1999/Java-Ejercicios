package juegos;

import java.util.Scanner;

/**
 * juegoUno
 */
public class juegoUno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" " + "*");
            }
            System.out.println("");
            scanner.close();
        }
    }
}