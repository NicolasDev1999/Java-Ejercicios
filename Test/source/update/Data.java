package Test.source.update;

public class Data {
    // variables
    private String Nombre;
    private String Apellido;
    private int Edad;

    // get
    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    // Set
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    // constructor
    public Data(String nombre, String apellido, int edad) {
        Nombre = nombre;
        Apellido = apellido;
        Edad = edad;
    }

}
