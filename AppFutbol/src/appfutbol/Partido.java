package appfutbol;
import java.util.*;
import java.io.*;


public class Partido {
private int idpartido;
private Estadio e;
private String fecha;
private Equipo eq1;
private Equipo eq2;
private boolean ida;
private LinkedList<Arbitro> larbitros;
private LinkedList<Jugador> leq1;
private LinkedList<Jugador> leq2;
private int golesA;
private int golesB;

Partido(int aIdpartido,Estadio ae,String aFecha,Equipo aeq1, Equipo aeq2, boolean aida,int agolesA, int agolesB){

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
public Equipo getEquipo1() {
	Equipo a=eq1;
	return a;

	
}
public Equipo getEquipo2() {
	Equipo b=eq2;
	return b;

	
}

@Override
public String toString() {
    return idpartido + " " + e + " " + fecha + " " + eq1 + " " + eq2 + " " + ida + " " + golesA + " " + golesB;
  }


}
