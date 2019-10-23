package appfutbol;
import java.util.*;

import java.io.*;
public class AppFutbolMenu {

	

	private static AppFutbol a;

	public static void main(String[] args) {
// TODO Auto-generated method stub
		AppFutbol uno=new AppFutbol();
		Scanner reader = new Scanner(System.in);	
		int selector=0;	
		int control=0;
		while(control==0) {
		
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
				"21: Calcular posiciones\n"+
				"22: Salir del programa\n"
				
				
				
);
			selector=reader.nextInt();

	
		switch(selector) {
case 0: break;
case 1:  
	uno.altaEquipo();
break;
case 2: 
	
	System.out.println("Introduce el id del equipo a borrar");
	int id=0;
	id=reader.nextInt();
	uno.bajaEquipo(id);
	
	break;
case 3: 
	
	System.out.println("Introduce el id del equipo del jugador a añadir");
	int id2=0;
	id2=reader.nextInt();
	
	uno.altaJugador(id2);
	
	break;
case 4: 
	System.out.println("Introduce el id del jugador a borrar");
	int idJ=0;
	idJ=reader.nextInt();
	uno.bajaArbitro(idJ);
	
	break;
case 5: 
	uno.altaArbitro();
	break;
case 6: 
	System.out.println("Introduce el id del arbitro a borrar");
	int idA=0;
	idA=reader.nextInt();
	uno.bajaArbitro(idA);
	break;
case 7: 
	
	uno.altaEstadio();
	
	break;
case 8: 
	uno.altaPartido();
	
	break;
case 9: 
	System.out.println("Introduce el id del partido a borrar");
	int idP=0;
	idP=reader.nextInt();
	uno.bajaPartido(idP);
	
	break;
case 10: 
	uno.listarEquipos();
	reader.nextLine();
			String entrada;
			do{
		    entrada  = reader.nextLine();
		    System.out.println(entrada);
		 }
		 while(!entrada.equals("")); 
		 System.out.println("SE PRESIONÓ LA TECLA ENTER");
	break;
case 11: 
	uno.listarEstadios();
	reader.nextLine();
	String entrada3;
	do{
    entrada3  = reader.nextLine();
    System.out.println(entrada3);
 }
 while(!entrada3.equals("")); 
 System.out.println("SE PRESIONÓ LA TECLA ENTER");
	
	break;
case 12: 
	uno.listarArbitros();
	reader.nextLine();
	String entrada4;
	do{
    entrada4  = reader.nextLine();
    System.out.println(entrada4);
 }
 while(!entrada4.equals("")); 
 System.out.println("SE PRESIONÓ LA TECLA ENTER");
	
	
	break;
case 13: 
	
	int nP=0;
	nP=uno.ContarPartidos();
	System.out.println(nP);
	
	break;
case 14: 
	
	System.out.println("Introduce la fecha del partido a buscar");
	String idL;
	idL=reader.nextLine();
	
	uno.listarPartidos(idL);
	
	break;
case 15: 
	System.out.println("Introduce el equipo del partido a buscar");
	int idE;
	
	idE=reader.nextInt();
	uno.listarPartidosE(idE);
	
	break;
case 16: 
	System.out.println("Introduce la posicion deseada: ");
	String pos="";
	pos=reader.nextLine();
	
	uno.listarJugadores(pos);
	reader.nextLine();
	String entrada2;
	do{
    entrada2  = reader.nextLine();
    System.out.println(entrada2);
 }
 while(!entrada2.equals("")); 
 System.out.println("SE PRESIONÓ LA TECLA ENTER");
	break;
case 17: 
	System.out.println("Introduce el id de equipo a buscar");
	int idJP;
	
	idJP=reader.nextInt();
	uno.listarJugadoresEquipo(idJP);
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
	
	break;
case 21: 
	
	break;
case 22:
control=1;
	break;
default: break;
}
	}
	}
}
