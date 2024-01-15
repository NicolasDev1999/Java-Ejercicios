abstract class Animal2 {
    public abstract void animalsone();

    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pig2 extends Animal2 {
    public void animalsone() {
        System.out.println("The pig says: wee wee");
    }
    ;
}


public class ClassAbstrac {
    public static void main(String[] args) {
        Pig2 cerdo = new Pig2();
        cerdo.animalsone();
        cerdo.sleep();
    }
}
