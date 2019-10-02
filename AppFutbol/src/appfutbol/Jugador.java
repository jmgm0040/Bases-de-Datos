package appfutbol;

public class Jugador extends Personas {

private int salario;
private String posicion;
private Boolean titular;
private int num;

public Jugador(int aid, String anombre, String aemail, String atlf, int asalario, String aposicion, boolean atitular, int anum) {
super(aid,anombre,aemail, atlf);
salario=asalario;
posicion=aposicion;
titular=atitular;
num=anum;
	
}
}
