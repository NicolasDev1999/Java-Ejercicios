package Test.source.conection;

import java.sql.Connection;
import java.sql.SQLException;
import Test.source.conection.ConectionDB.DatabaseConfig;;

public class DatabaseManager {

    private Connection connection;

    public DatabaseManager() {
        try {
            this.connection = DatabaseConfig.getConnection();
            //System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
            //System.out.println("Error al conectar a la base de datos.");
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
