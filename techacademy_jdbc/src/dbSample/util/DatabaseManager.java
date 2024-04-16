package dbSample.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DatabaseManager {
        
    private static Connection con;
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost/world?useSSL=false&allowPublicKeyRetrieval=true",
                "root",
                "Hb.tsuno89851"
                );
        
        return con;
    }
    
    public static void close() {
        
        if(con != null) {
            try {
                con.close();
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
