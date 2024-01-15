import java.util.ArrayList;

import java.util.Collections;

interface listaMarcas{
       public void marcas();
    }
     class SalidaMarcas implements listaMarcas {
         @Override
         public void marcas() {
             ArrayList<String> cars = new ArrayList<String>();
             cars.add("BMW");
             cars.add("Subaru");
             cars.add("Porche");
             cars.add("GMC");
             System.out.println(cars.set(0,"Chevrolet"));
             System.out.println(cars.set(1,"Ferrari"));
             System.out.println(cars.set(2,"Ford"));
             System.out.println(cars.set(3,"Mazda"));
             System.out.println(cars);
             System.out.println(cars.size());
             for (int i = 0 ; i <cars.size();i++){
                 System.out.println("Con ciclo for " + i + " :"+ cars.get(i));
             }
             Collections.sort(cars);
             for (String i : cars){
                 System.out.println("Con ciclo for each: " + i);
             }
         }

     }
public class Arrays {
    public static void main(String[] args) {
        SalidaMarcas carros = new SalidaMarcas();
        carros.marcas();

    }
}
