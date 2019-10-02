package appfutbol;

import java.util.*;

public class Equipo {
private int idequipo;
private Estadio esta;
private int posicion;//Posicion en la liga
public Collection <Jugador> ljuga;

Equipo(int aIdequipo, Estadio aEsta, int aPosicion, Collection <Jugador> aLjuga){
	idequipo=aIdequipo;
	esta=aEsta;
	posicion=aPosicion;
	ljuga=aLjuga;
	
}

public void AltaJugador(Jugador j) {
	
}
public void BajaJugador(String id) {
	
}

}
