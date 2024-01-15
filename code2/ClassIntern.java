class OuterClass {
    int x = 10;
    class InnerClass {
        public int miMetodo() {
            return x;
        }
    }
}
class ClassIntern {
    public static void main(String[] args) {
        OuterClass externa = new OuterClass();
        OuterClass.InnerClass interna = externa.new InnerClass();
        System.out.println(interna.miMetodo());
    }
}
