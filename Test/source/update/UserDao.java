package Test.source.update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Test.source.conection.DatabaseManager;;

public class UserDao {
    DatabaseManager databaseManager = new DatabaseManager();
    Connection connection = databaseManager.getConnection();
    
    public boolean insertUser(String nombre, String apellido, int edad) {
    
        String sql = "INSERT INTO Users (nombre, apellido, edad) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nombre);
            statement.setString(2, apellido);
            statement.setInt(3, edad);
            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void showAllUsers() {
        String sql = "SELECT * FROM Users";
        try (PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                int edad = resultSet.getInt("edad");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean deleteUserById(int userId) {
        String sql = "DELETE FROM Users WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, userId);
            int rowsDeleted = statement.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
