package university.management.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // ✅ Explicitly target the correct database
            c = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/universitymanagementsystem?useSSL=false&allowPublicKeyRetrieval=true",
                "root",
                "tiger" // 🔐 Replace with your actual password
            );

            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
