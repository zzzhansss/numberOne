package bba.main.Client;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException{
        try{
            String host = "jdbc:mysql://localhost:3306/Client?verifyServerCertificate=false&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String username = "root";
            String password= "1234";

            Connection conn = DriverManager.getConnection(host, username, password);
            System.out.println("Connected successfully!");
        }
        catch(SQLException err){
            System.out.println(err.getMessage());

        }
    }
}
