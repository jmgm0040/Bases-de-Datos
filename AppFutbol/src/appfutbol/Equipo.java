package appfutbol;
import java.io.*;

import java.util.*;

public class Equipo implements Serializable{
private int idequipo;
private Estadio esta;
private int posicion; //Posicion en la liga
public LinkedList<Jugador> ljuga;

Equipo(int aIdequipo, Estadio aEsta, int aPosicion){
	
	idequipo=aIdequipo;
	esta=aEsta;
	posicion=aPosicion;
	ljuga=new LinkedList<Jugador>();
	
}
public int getId() {
	int id=idequipo;
	return id;
}

public void AltaJugador(Jugador j) {
	
	ljuga.add(j);
}
public void BajaJugador(Jugador j) {
	
	ljuga.remove(j);
}

public LinkedList<Jugador> getJugadores(){
	LinkedList<Jugador> lista=ljuga;
	return lista;
	
}

public void setGoles(int pos) {
	this.posicion=pos;
}

public int getGoles() {
	int pos=posicion;
	return pos;
}
public String toString() {
	return "| Id de Equipo: "+idequipo+" "+esta+"| Goles Totales: "+posicion+"| Lista de jugadores: "+ljuga;
}
}
