package code2;

class Herencia {
        protected String marca = "Ford";
        public void claxon() {
            System.out.println("Bip, Biip");
        }
    }

    class Car extends Herencia{
        private final String model = "BMW";
        public static void main(String[] args) {
            Car myCars =  new Car();
            System.out.println(myCars.model +"  //  "+ myCars.marca);
            myCars.claxon();
        }
    }







