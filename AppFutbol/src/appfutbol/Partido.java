package appfutbol;
import java.util.*;

public class Partido {
private int idpartido;
private Estadio e;
private String fecha;
private Equipo eq1;
private Equipo eq2;
private boolean ida;
private Collection <Arbitro> larbitros;
private Collection <Jugador> leq1;
private Collection <Jugador> leq2;
private int golesA;
private int golesB;

Partido(int aIdpartido,Estadio ae,String aFecha,Equipo aeq1, Equipo aeq2, boolean aida,Collection <Arbitro> alarbitros,Collection <Jugador> aleq1,Collection <Jugador> aleq2,int agolesA, int agolesB){

	idpartido=aIdpartido;
	e=ae;
	fecha=aFecha;
	eq1=aeq1;
	eq2=aeq2;
	ida=aida;
	larbitros=alarbitros;
	leq1=aleq1;
	leq2=aleq2;
	golesA=agolesA;
	golesB=agolesB;
	
}

}
