package appfutbol;
import java.util.*;
import java.io.*;


public class Partido implements Serializable {
private int idpartido;
private int e;
private String fecha;
private int eq1;
private int eq2;
private boolean ida;
private LinkedList<Arbitro> larbitros;
private LinkedList<Jugador> leq1;
private LinkedList<Jugador> leq2;
private int golesA;
private int golesB;

Partido(int aIdpartido,int ae,String aFecha,int aeq1, int aeq2, boolean aida,int agolesA, int agolesB){

	idpartido=aIdpartido;
	e=ae;
	fecha=aFecha;
	eq1=aeq1;
	eq2=aeq2;
	ida=aida;
	larbitros=new LinkedList<Arbitro>();
	leq1=new LinkedList<Jugador>();
	leq2=new LinkedList<Jugador>();
	golesA=agolesA;
	golesB=agolesB;
	
}
public String getFecha() {
	String fechap=fecha;
	return fechap;
}
public int getEquipo1() {
	int a=eq1;
	return a;

	
}
public int getGoles1() {
	int a=golesA;
	return a;

	
}
public int getGoles2() {
	int a=golesB;
	return a;

	
}
public int getEquipo2() {
	int b=eq2;
	return b;

	
}
public int getId() {
	int idP=idpartido;
			return idP;
}
@Override
public String toString() {
    return "| Id de partido: "+idpartido + "| Id de estadio:  " + e + "| Fecha:  " + fecha + "| Id de Equipo 1:  " + eq1 + "| Id de equipo 2:  " + eq2 + "| Ida (True o False):  " + ida + "| Goles Equipo 1:  " + golesA + "| Goles Equipo 2:  " + golesB;
  }


}
