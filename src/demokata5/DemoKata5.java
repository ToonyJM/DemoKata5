package demokata5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoKata5 {
    public static void main(String[] args) {
        connect();
    }
    
    private static void connect() {
        Connection conn = null;
        try {
// parámetros de la BD
            String url = "jdbc:sqlite:prueba.db";
// creamos una conexión a la BD
            conn = DriverManager.getConnection(url);
            System.out.println("Connexión a SQLite establecida");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }   
}
