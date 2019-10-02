package appfutbol;

import java.io.*;
import java.util.Scanner;

public class AppFutbolMenu {

	

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);	
		int selector=0;	
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
case 1:  System.out.print("Correcto");
case 2: break;
case 3: break;
case 4: break;
case 5: break;
case 6: break;
case 7: break;
case 8: break;
case 9: break;
case 10: break;
case 11: break;
case 12: break;
case 13: break;
case 14: break;
case 15: break;
case 16: break;
case 17: break;
case 18: break;
case 19: break;
case 20: break;
case 21: break;
case 22: break;
default: break;
}
	}

}
