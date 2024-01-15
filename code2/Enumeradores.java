import java.time.LocalDateTime;

enum Numeros{
    UNO,
    DOS,
    TRES
}




public class Enumeradores {
    public static void main(String[] args) {
        Numeros miNumero = Numeros.DOS;
        switch (miNumero){
            case UNO:
                System.out.println("caso 1");
                break;
            case DOS:
                System.out.println("caso 2");
                break;
            case TRES:
                System.out.println("caso 3");
                break;
            default:
                System.out.println("ninguno");
                break;
        }
        for (Numeros miNumero1 : Numeros.values()){
            System.out.println(miNumero1);

        }
        LocalDateTime myTime = LocalDateTime.now();
        System.out.println(myTime);
    }
}
