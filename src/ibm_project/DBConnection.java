package ibm_project;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection ConnectDB(String dbUrl, String dbUser, String dbPass){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            System.out.println("Connected");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    
}
