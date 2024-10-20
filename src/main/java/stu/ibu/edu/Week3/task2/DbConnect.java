package stu.ibu.edu.Week3.task2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/lab3";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "06062001Adi";

    private Connection connection = null;

    public DbConnect(){
        try{
            connection= DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
            System.out.println("Successfully connected to database");
        }
        catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException("Failed to connect to database");
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection(){
        if(connection!=null){
            try{
                connection.close();
                System.out.println("Database connection closed.");
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
