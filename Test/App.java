package Test;

import java.util.InputMismatchException;
import java.util.Scanner;
import Test.source.update.Data;
import Test.source.update.DataSet;
import Test.source.update.UserDao;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserDao userDao = new UserDao();
        try {
            while (true) {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Agregar usuario");
                System.out.println("2. Mostrar usuarios");
                System.out.println("3. Eliminar usuario por ID");
                System.out.println("0. Salir");
                System.out.print("Opción: ");

                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        Data data = new Data(null, null, 0);
                        DataSet.DataInput(data);
                        break;
                    case 2:
                        System.out.println("Lista de usuarios:");
                        userDao.showAllUsers();
                        break;
                    case 3:
                        System.out.print("Ingrese el ID del usuario a eliminar: ");
                        int userId = scanner.nextInt();
                        boolean eliminado = userDao.deleteUserById(userId);
                        if (eliminado) {
                            System.out.println("Usuario eliminado correctamente.");
                        } else {
                            System.out.println("No se pudo eliminar el usuario.");
                        }
                        break;
                    case 0:
                        System.out.println("Saliendo del programa.");
                        return;
                    default:
                        System.out.println("Opción inválida. Por favor ingrese una opción válida.");
                        scanner.next();
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número entero válido.");
        } finally {
            scanner.close();
        }
    }
}