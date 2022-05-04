import java.sql.*;

public class BankingJDBC {
    private static Connection connection;
    public static void main(String[] args) throws ClassNotFoundException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            final String url = "jdbc:mysql://localhost:3306/student";
            final String uName = "root";
            final String password = "Password";
            connection = DriverManager.getConnection(url,uName,password);

            String query = "insert into bank(name,account_num, ifsc_code, amount) values" +
                    "(amit, 123, sbi123, 50000)";
            Statement statement = connection.createStatement();
            statement.executeQuery(query);
            String query1 = "select name from bank where name = amit";

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
