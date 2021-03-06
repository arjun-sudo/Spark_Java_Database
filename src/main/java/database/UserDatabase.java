/**
 * @author : Arjun Gautam
 * e-mail : arjungautam5431@gmail.com
 * Date :2021-02-17
 * Time :14:29
 */
package database;

import java.sql.*;

public class UserDatabase {
    Connection connection = null;
    Statement statement = null;

    private void getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sparkdb", "root", ""
            );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String executeUpdate(String query) {

        try {
            getConnection();
            statement=connection.createStatement();
            int count=statement.executeUpdate(query);
            if (count > 0) {
                return "New user has been added";
            }
           

        } catch (Exception e) {
            e.printStackTrace();
        }
       return "Error adding user";
    }
    
    public ResultSet executeQuery(String query){
        ResultSet resultSet=null;
        try{
            getConnection();
            statement=connection.createStatement();
            resultSet=statement.executeQuery(query);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return resultSet;
    }

}
