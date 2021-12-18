package daos;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static final String URL = "jdbc:mysql://localhost:3306/Whiskey";
    public static final String USER = "rick";
    public static final String PASS = "rick123";


    public static Connection getConnection(){
        try{
            DriverManager.registerDriver(new Driver());
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        throw new RuntimeException();
    }

    public static void main(String[] args) {

        Connection connection = ConnectionFactory.getConnection();
    }

}
