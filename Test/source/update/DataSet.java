package Test.source.update;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataSet {

    public static void DataInput(Data data) {

        Scanner inData = new Scanner(System.in);

        try {
            System.out.print("Ingrese el nombre: ");
            String nombre = inData.nextLine();
            data.setNombre(nombre);

            System.out.print("Ingrese su apellido: ");
            String apellido = inData.nextLine();
            data.setApellido(apellido);

            System.out.print("Ingrese su edad: ");
            while (true) {
                try {
                    int edad = inData.nextInt();
                    data.setEdad(edad);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor ingrese un número entero válido para la edad.");
                    inData.next();
                }
            }
        } finally {
            inData.close();
        }
        UserDao userDao = new UserDao();
        boolean insertado = userDao.insertUser(data.getNombre(), data.getApellido(), data.getEdad());
        if (insertado) {
            System.out.println("Usuario insertado correctamente en la base de datos.");
        } else {
            System.out.println("Error al insertar usuario en la base de datos.");
        }
    }
}
