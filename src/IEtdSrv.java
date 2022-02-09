import java.sql.SQLException;
//justification :
/* d'aprés le principe d'inversion de controle les modules de haut niveau 
*ne doivent pas dependre des modules de bas niveau.*/
public interface IEtdSrv {
	boolean inscription (int matricule, String nom, String prénom, String email,String pwd, int id_universite) throws SQLException;

}
