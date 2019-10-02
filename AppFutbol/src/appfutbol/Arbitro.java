package appfutbol;

public class Arbitro extends Personas{

	private String tipo;
	Arbitro(int aid, String anombre, String aemail, String atlf,String atipo){
		super(aid, anombre,aemail,atlf);
		tipo=atipo;
	}
}
