import java.sql.SQLException;
//justification :
/* d'apr�s le principe d'inversion de controle les modules de haut niveau 
*ne doivent pas dependre des modules de bas niveau.*/
public interface IEtdRep{

	boolean Exists(int matricule) throws SQLException;

	boolean Exists(String email) throws SQLException;

	

}
