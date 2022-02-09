import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*commentaire*/

/* to implement the singleton pattern: j'ai changer l'accée du constructeur de publique (public) a privé (private)
 * En plus j'ai ajouté une instance 'instance' et j'ai ajouté la methode 'getInstance()' qui retourne 'instance'*/

public class DBConnection {
	   
		String BDD = "bibliothèque numérique";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private static Connection conn;
	    private static DBConnection instance;
	   
	    public DBConnection() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);
		}
	    
	    public Connection getConn() {
			return conn;
		}
	    
	    public static DBConnection getInstance() throws SQLException {
	    	if (instance == null)
	    	{ 
	    		instance = new DBConnection ();
	    		conn = instance.getConn();
	    	}
			return instance;
		}

}

