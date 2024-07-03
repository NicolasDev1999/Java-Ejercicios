package Test.source.conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionDB {

    public static class DatabaseConfig {

        private static final String URL = "jdbc:mysql://localhost:3306/testdb";
        private static final String USERNAME = "root";
        private static final String PASSWORD = "1013";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
    }

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Unimplemented method 'getConnection'");
    }

  

  
}
