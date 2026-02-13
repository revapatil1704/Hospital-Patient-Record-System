package HospitalPatientRecorde;
import java.sql.*;

public class DB {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hospital",
                "root",
                ""   // change password
            );
        } catch (Exception e) {
        	e.printStackTrace();
            System.out.println("Connection Error");
        }
        return null;
    }
}

