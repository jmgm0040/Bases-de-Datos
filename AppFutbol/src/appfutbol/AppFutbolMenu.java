package appfutbol;
import java.util.*;

import java.io.*;
public class AppFutbolMenu {

	

	private static AppFutbol a;

	public static void main(String[] args) {
// TODO Auto-generated method stub
		AppFutbol uno=new AppFutbol();
		uno.inicializacion();

		Scanner reader = new Scanner(System.in);	
		int selector=0;	
		int control=0;
		
		while(control==0) {
			try {
		System.out.print("Menu: \nIntroduzca Opcion:\n\n" + 
				"1: Alta Equipo\n" + 
				"2: Baja Equipo\n" + 
				"3: Alta Jugador\n" + 
				"4: Baja Jugador\n" + 
				"5: Alta Arbitro\n" + 
				"6: Baja Arbitro\n" + 
				"7: Alta Estadio\n" + 
				"8: Alta Partido\n" + 
				"9: Baja Partido\n" + 
				"10: Listar Equipos\n" + 
				"11: Listar Estadios\n" + 
				"12: Listar Árbitros\n"+
				"13: Devolver Total de Partidos\n"+
				"14: Listar Información de Partidos dada una fecha\n"+
				"15: Listar los partidos hechos por un equipo\n"+
				"16: Listar los jugadores que hay de una posicion\n"+
				"17: Listar los jugadores de un equipo y sus posiciones\n"+
				"18: Cargar Sistema\n"+
				"19: Salvar los datos\n"+
				"20: Calcular el campeón\n"+
				"21: Calcular goles de equipo\n"+
				"22: Salir del programa\n"
				
				
				
);
			selector=reader.nextInt();
		
}catch (InputMismatchException e) {
				
				System.out.println("Error de sintaxis");//Control de errores
				reader.nextLine();
				
			}
		switch(selector) {
case 0: break;
case 1:  
	try{
		uno.altaEquipo();
	
		} catch (InputMismatchException e) {
			
			System.out.println("Error de sintaxis");//Control de errores
		}
break;
case 2: 
	try {
	System.out.println("Introduce el id del equipo a borrar");
	int id=0;
	id=reader.nextInt();
	uno.bajaEquipo(id);
	}catch (InputMismatchException e) {
		
		System.out.println("Error de sintaxis");//Control de errores
	}
	break;
case 3: 
	try {
	System.out.println("Introduce el id del equipo del jugador a añadir");
	int id2=0;
	id2=reader.nextInt();
	
	
	uno.altaJugador(id2);
	}
	catch (InputMismatchException e) {
		
		System.out.println("Error de sintaxis");//Control de errores
	}
	break;
case 4: 
	try {
	System.out.println("Introduce el id del equipo del jugador a borrar");
	int idJ=0;
	int idEq=0;
	idEq=reader.nextInt();
	System.out.println("Introduce el numero del jugador a borrar");
	idJ=reader.nextInt();
	uno.bajaJugador(idEq,idJ);
	}catch (InputMismatchException e) {
		
		System.out.println("Error de sintaxis");//Control de errores
	}
	break;
case 5: 
	try {
	uno.altaArbitro();
	}catch (InputMismatchException e) {
		
		System.out.println("Error de sintaxis");//Control de errores
	}
	break;
case 6: 
	try {
	System.out.println("Introduce el id del arbitro a borrar");
	int idA=0;
	idA=reader.nextInt();
	uno.bajaArbitro(idA);
	}catch (InputMismatchException e) {
		
		System.out.println("Error de sintaxis");//Control de errores
	}
	break;
case 7: 
	try {
	uno.altaEstadio();
	}
	catch (InputMismatchException e) {
		
		System.out.println("Error de sintaxis");//Control de errores
	}
	break;
case 8: 
	try {
	uno.altaPartido();
	}
	catch (InputMismatchException e) {
		
		System.out.println("Error de sintaxis");//Control de errores
	}
	break;
case 9: 
	try {
	System.out.println("Introduce el id del partido a borrar");
	int idP=0;
	idP=reader.nextInt();
	uno.bajaPartido(idP);
	}
	catch (InputMismatchException e) {
		
		System.out.println("Error de sintaxis");//Control de errores
	}
	break;
case 10: 
	try {
		
	
	uno.listarEquipos();
	}catch (InputMismatchException e) {
		
		System.out.println("Error de sintaxis");//Control de errores
	}
	break;
case 11: 
	try {
	uno.listarEstadios();
	}
	catch (InputMismatchException e) {
		
		System.out.println("Error de sintaxis");//Control de errores
	}
	
	break;
case 12: 
	
	uno.listarArbitros();

	
	break;
case 13: 
	
	int nP=0;
	nP=uno.ContarPartidos();
	System.out.println("Total de partidos: "+nP);
	
	break;
case 14: 
	try {
	System.out.println("Introduce la fecha del partido a buscar (Dia/Mes/Año):");
	reader.nextLine();
	String idL;
	
	idL=reader.nextLine();
	
	uno.listarPartidos(idL);
	}
	catch (InputMismatchException e) {
		
		System.out.println("Error de sintaxis");//Control de errores
	}
	break;
case 15: 
	try {
	System.out.println("Introduce el id del equipo del partido a buscar");
	int idE;
	
	idE=reader.nextInt();
	uno.listarPartidosE(idE);
	}
	catch (InputMismatchException e) {
		
		System.out.println("Error de sintaxis");//Control de errores
	}
	break;
case 16: 
	try {
	System.out.println("Introduce la posicion deseada (Delantero,Centro,Defensa,Portero): ");
	String pos="null";
	reader.nextLine();
	pos=reader.nextLine();
	
	
	uno.listarJugadores(pos);
	}
	catch (InputMismatchException e) {
		
		System.out.println("Error de sintaxis");//Control de errores
	}


	break;
case 17: 
	try {
	System.out.println("Introduce el id de equipo a buscar");
	int idJP;
	
	idJP=reader.nextInt();
	uno.listarJugadoresEquipo(idJP);
	}catch (InputMismatchException e) {
		
		System.out.println("Error de sintaxis");//Control de errores
	}
	break;
case 18: 
			try {
				uno.CargarDatos();
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	break;
case 19: 
			try {
				uno.Salvar();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	break;
case 20: 
	uno.CalcularCampeonTemporada();
	break;
case 21: 
	try {
	int equipo=0;
	System.out.println("Introduce el id de equipo a calcular");
	equipo=reader.nextInt();
	
	uno.CalcularPosicionesEquipos(equipo);
	}
	catch (InputMismatchException e) {
		
		System.out.println("Error de sintaxis");//Control de errores
	}
	break;
case 22:
control=1;
	break;
default: break;
}
			
			}
		
	}
}
