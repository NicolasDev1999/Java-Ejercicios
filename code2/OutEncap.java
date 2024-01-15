package code2;

import java.util.Arrays;

public class OutEncap {
    public static void main(String[] args) {
        Encapsulamiento.persons enca = new Encapsulamiento.persons();
        enca.setName(new String[]{"Nicolas"});
        System.out.println(Arrays.toString(enca.getName()));
    }
}
