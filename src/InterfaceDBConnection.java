import java.sql.Connection;
import java.sql.SQLException;
//justification :
/* d'apr�s le principe d'inversion de controle les modules de haut niveau 
*ne doivent pas dependre des modules de bas niveau.*/
public interface InterfaceDBConnection {
	public Connection getConn() throws SQLException;
}