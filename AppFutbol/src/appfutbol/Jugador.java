package appfutbol;
import java.util.*;
import java.io.*;


public class Jugador extends Personas {

private int salario;
private String posicion;
private Boolean titular;
private int num;
public String nombre;

public Jugador(int aid, String anombre, String aemail, String atlf, int asalario, String aposicion, boolean atitular, int anum) {
super(aid,anombre,aemail, atlf);
salario=asalario;
posicion=aposicion;
titular=atitular;
num=anum;
nombre=anombre;
	
}

public String getPosicion() {
	String pos=posicion;
	
	
	return pos;
}

public String getNombre() {
	
	String nom=nombre;
	return nom;
}
}
