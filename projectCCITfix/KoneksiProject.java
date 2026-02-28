
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class KoneksiProject {
    Connection koneksi;
    public static Connection Koneksi (){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/todolist2", "root", "");
            return koneksi;
        }   catch(Exception e){
                 JOptionPane.showMessageDialog(null, e);
                 return null;         
        }
    }
}
