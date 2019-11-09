package appfutbol;
import java.util.*;
import java.io.*;


public class Estadio implements Serializable{

private int Idestadio;
private String Direccion;
private String Ciudad;
private int Capacidad;

Estadio(int aIdestadio,String aDireccion,String aCiudad,int aCapacidad){
	Idestadio=aIdestadio;
	Direccion=aDireccion;
	Ciudad=aCiudad;
	Capacidad=aCapacidad;
}
int getId() {
	int id=Idestadio;
	return id;
}
@Override
public String toString() {
	String to=Idestadio+" "+Direccion+" "+Ciudad+" "+Capacidad;
	return to;
}
}
