package appfutbol;
import java.io.*;

import java.util.*;

public class Equipo {
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

}
