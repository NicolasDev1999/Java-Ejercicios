interface Animal3{
    public void sonidoAnimal();

}
interface Animal4{
    public  void dormir();
}
class Cerdo implements Animal3,Animal4{
    @Override
    public void sonidoAnimal() {
        System.out.println("The pig says: wee wee");
    }
    @Override
    public void dormir() {
        System.out.println("Zzz");
    }
}

public class Interf {
    public static void main(String[] args) {
        Cerdo pig = new Cerdo();
        pig.sonidoAnimal();
        pig.dormir();
    }
}
