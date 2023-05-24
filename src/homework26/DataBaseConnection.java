package homework26;

import org.postgresql.util.PSQLException;

import java.sql.*;

public class DataBaseConnection {
    //метод getConnection() - повертає нове з'єднання з БД
    //метод close(Connection) - закриває передане з'єднання
    public Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection( "jdbc:postgresql://127.0.0.1:5432/hw24", "postgres", "onl1918s");
        if (conn != null) {
            System.out.println("Connected to the database!");
        } else {
            System.out.println("Failed to make connection!");
        }
        return conn;
    }

    public void close(Connection conn) throws SQLException {
        conn.close();
        System.out.println("Connection is closed");
    }

    //Method for executing queries
    public void execute(String query) throws SQLException {
        if (Main.conn != null) {
            PreparedStatement ps = Main.conn.prepareStatement(query);
            try {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    System.out.println(rs.getString("id") + " - " + rs.getString("name"));
                }
            } catch (PSQLException e) {
                //System.out.println(e.getMessage());
            }
        } else {
            System.out.println("No connection in Main class");
        }
    }
    //Method for executing ID
    public int executeId(String query) throws SQLException {
        if (Main.conn != null) {
            PreparedStatement ps = Main.conn.prepareStatement(query);
            try {
                ResultSet rs = ps.executeQuery();
                rs.next();
                return rs.getInt(1);
            } catch (PSQLException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("No connection in Main class");
        }
        return 0;
    }
}
