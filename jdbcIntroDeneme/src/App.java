import java.sql.*;

public class App {
    static String userName = "root";
    static String password = "12345";
    static String dbUrl = "jdbc:mysql://localhost/world";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(dbUrl, userName, password);
            System.out.println("Bağlantı Oluştu");
            connection.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        } finally {
            connection.close();
        }

        String sql = "SELECT";
        System.out.println(sql);
    }
}
