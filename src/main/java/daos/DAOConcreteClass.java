package daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DAOConcreteClass implements WhiskeyDAO {

    Whiskey whiskey;
    Connection connection = ConnectionFactory.getConnection();

    public Whiskey findById(int id) {
        Whiskey whiskey;
        Connection connection = ConnectionFactory.getConnection();

        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM whiskey WHERE WhiskeyId=" + id);

            if(resultSet.next()){
                return
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List findAll() {

        return null;
    }

    public Whiskey update(Whiskey dto) {
        return null;
    }

    public Whiskey create(Whiskey dto) {
        return null;
    }

    public void delete(int id) {

    }
}
