package bank.management.system12;

 import java.sql.*;

public class Con {
    Connection connection;

    Statement statement;

    public Con(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Santhosh@5m0");
            statement=connection.createStatement();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
