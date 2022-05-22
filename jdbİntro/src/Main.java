import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {

        //delete();
        selectDemo();
    }

    private static void delete() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        try {
            connection = dbHelper.getConnection();
            String sql = "Delete from city where id=?";

            statement = connection.prepareStatement(sql);
            statement.setInt(1, 4099);
            statement.executeUpdate();
            System.out.println("Kayıt Silindi");
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    private static void update() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        try {
            connection = dbHelper.getConnection();
            String sql = "Update city  set population=6000, district='Düzce' where id=?";

            statement = connection.prepareStatement(sql);
            statement.setInt(1, 4099);
            statement.executeUpdate();
            System.out.println("Kayıt Güncellendi");
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    private static void insert() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql = "insert into city (Name,CountryCode,District,Population) values(?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, "Düzce 2");
            statement.setString(2, "TUR");
            statement.setString(3, "Turkey");
            statement.setInt(4, 700000);
            int result = statement.executeUpdate();
            System.out.println("Kayıt Eklendi");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    private static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select code,name,continent,region from country");

            ArrayList<Country> countries = new ArrayList<Country>();


            while (resultSet.next()) {
                countries.add(new Country(resultSet.getString("code"), resultSet.getString("name"), resultSet.getString("continent"), resultSet.getString("region")));

                System.out.println(resultSet.getString("Name"));
            }
            System.out.println(countries.size());
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }
    }
}