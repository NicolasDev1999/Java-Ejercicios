package code;

public class Funciones {
    int age;
    public Funciones(){
        age = 61;
    }
    static void PrimerMetodo(int age) {
        for (int i = 0; i < 2; ++i) {
            if (age < 60) {
                System.out.println("Joven");
            } else {
                System.out.println("Viejo");
            }

        }
    }

    static int SeconMetod(int x, int y) {
        return x + y;
    }

    static float TrMetod(float x, float y) {
        return x + y;
    }

    int numero1 = 5;


    static void text() {
        System.out.println("Estatico");
    }

    public void text2() {
        System.out.println("Publico");
    }

    public static void main(String[] args) {
        Funciones nueOb = new Funciones();
        PrimerMetodo(nueOb.age);
        int num1 = SeconMetod(33, 55);
        float num2 = TrMetod(22, 55);
        System.out.println(num1 + "//" + num2);
        Funciones oJNum = new Funciones();
        System.out.println(oJNum.numero1);
        text();
        Funciones texto = new Funciones();
        texto.text2();

    }
}
