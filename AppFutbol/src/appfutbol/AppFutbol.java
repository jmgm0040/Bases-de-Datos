package appfutbol;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
import java.util.Map.Entry;



public class AppFutbol implements Serializable{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private Map<Integer, Equipo> lEquipos = new HashMap<Integer, Equipo>(); //id de equipo
	private Map<Integer, Jugador> lJugadores = new HashMap<Integer, Jugador>(); // id jugador
	private Map<Integer, Arbitro> lArbitros = new HashMap<Integer, Arbitro>();
	private Map<Integer, Estadio> lEstadios = new HashMap<Integer, Estadio>();
	public Map<Integer,Partido> lPartidos=new HashMap<Integer,Partido>();
	public SortedMap<Integer, Integer> lGoles=new TreeMap<Integer, Integer>(java.util.Collections.reverseOrder());
	public ArrayList<String> array = new ArrayList<>();
	
	int contador=0;
	void inicializacion() {
		int idequipo2=9999;
		int idEstadio2=9999;
		int posicion=0;
		String direccionEstadio="Direccion de prueba";
		String ciudad="Ciudad de Prueba";
		int capacidad=0;
		int id2=9999;
		String nombre="Nombre de Prueba";
		String email="emaildeprueba@gmail.com";
		String tlf="666666666";;
		int salario=0;
		boolean titular=false;
		int num=9999;
		String posicion2="Delantero";
		int id=0;
		String tipo="null";
		int Idpartido=9999;
		String Fecha="null";
		int idequipo3=10000;
		boolean ida=true;
		int golesA=0;
		int golesB=0;
		int idEstadio3=10000;
		Estadio nuevoEstadio = new Estadio (idEstadio2, direccionEstadio, ciudad, capacidad);
		lEstadios.put(idEstadio2, nuevoEstadio); 
		Estadio nuevoEstadio2 = new Estadio (idEstadio3, direccionEstadio, ciudad, capacidad);
		lEstadios.put(idEstadio3, nuevoEstadio2); 
		Equipo nuevoequipo2=new Equipo(idequipo2,nuevoEstadio,posicion);
		lEquipos.put(idequipo2,nuevoequipo2);
		Equipo nuevoequipo3=new Equipo(idequipo3,nuevoEstadio2,posicion);
		lEquipos.put(idequipo3,nuevoequipo3);
		Jugador nuevojugador2=new Jugador(id2,nombre,email,tlf,salario,posicion2,titular,num);
		lJugadores.put(id2,nuevojugador2);
		Arbitro nuevoarbitro=new Arbitro(id,nombre,email,tlf,tipo);
		lArbitros.put(id,nuevoarbitro);
		Partido nuevopartido=new Partido(Idpartido,idEstadio2,Fecha,idequipo2,idequipo3,ida,golesA,golesB);
		lPartidos.put(Idpartido,nuevopartido);
	
	
	
	}
	// Alta equipo
	Equipo altaEquipo(){
int idequipo = 0;
int idEstadio = 0;
String direccionEstadio = null;
String ciudad = null;
int capacidad = 0;
Scanner reader = new Scanner(System.in);

System.out.println("Introduzca id de equipo");

idequipo=reader.nextInt();//Id equipo por teclado

Iterator<?> it = lEquipos.entrySet().iterator();
while (it.hasNext()) {
    Entry<Integer,Equipo> e1 = (Entry<Integer, Equipo>) it.next();
    Equipo uno=e1.getValue();
    int b;
    b=e1.getKey();
    
    if (idequipo==b){
    
    	
    System.out.println("El equipo ya existe\n");
    
    	return null;
    }

}


System.out.println("Introduzca id de estadio:");

reader.nextLine();

idEstadio=reader.nextInt(); //Id estadio por teclado

Iterator<?> it2 = lEstadios.entrySet().iterator();
while (it2.hasNext()) {
    Entry<Integer,Estadio> e1 = (Entry<Integer, Estadio>) it2.next();
    Estadio uno=e1.getValue();
    int b;
    b=e1.getKey();
    
    if (idEstadio==b){
    
    	
    System.out.println("El estadio ya existe\n");
    
    	return null;
    }

}

System.out.println("Introduzca capacidad del estadio:");
reader.nextLine();

capacidad=reader.nextInt(); //Direccion estadio por teclado

System.out.println("Introduzca direccion del estadio:");
reader.nextLine();

direccionEstadio=reader.nextLine(); //Direccion estadio por teclado

System.out.println("Introduzca la ciudad del estadio:");

ciudad=reader.nextLine(); //Ciudad por teclado







Estadio nuevoEstadio = new Estadio (idEstadio, direccionEstadio, ciudad, capacidad);
lEstadios.put(idEstadio, nuevoEstadio); //Arreglar
int posicion = 0;
Equipo nuevoequipo=new Equipo(idequipo,nuevoEstadio,posicion);
lEquipos.put(idequipo,nuevoequipo);


return nuevoequipo;


	}
	//Baja equipo
	boolean bajaEquipo(int id) {
		
		int id2 = id;
		int corrector=0;
		Iterator<?> it = lEquipos.entrySet().iterator();
		while (it.hasNext()) {
		    Entry<Integer,Equipo> e1 = (Entry<Integer, Equipo>) it.next();
		    Equipo uno=e1.getValue();
		    int b;
		    b=e1.getKey();
		    
		    if (id2==b){
		    
		    	
		    System.out.println("El equipo  existe\n");
		    lEquipos.remove(id2);
		    System.out.println("Equipo  borrado\n");
		    	corrector=1;
		    
		    	return true;
		    }

		}
		if (corrector==0) {
			
		    System.out.println("El equipo no existe\n");
		    return false;
		}
		
		return true;
		
	}
	//Alta jugador
	
	
	Jugador altaJugador(int id) {
		int id2=id; 
		String nombre=null; 
		String email=null; 
		String tlf=null; 
		int salario=0; 
		String posicion=null; 
		boolean titular=false; 
		int num=0;
		int corrector=0;
		Iterator<?> it44 = lEquipos.entrySet().iterator();
		while (it44.hasNext()) {
		    Entry<Integer,Equipo> e = (Entry<Integer, Equipo>) it44.next();
		    Equipo uno=e.getValue();
		    int b;
		    b=e.getKey();
		    
		    if (id2==b){
		    
		    	
		    System.out.println("El equipo existe\n");
		    corrector=1;
		    	
		    }
		    
		  
		}
		if(corrector==0) {
		    System.out.println("El equipo no existe\n");
		    return null;
		}
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca nombre de jugador");

		nombre=reader.nextLine();//por teclado

		System.out.println("Introduzca email");

		

		email=reader.nextLine(); //Id estadio por teclado

		System.out.println("Introduzca telefono");
		

		tlf=reader.nextLine(); //Direccion estadio por teclado

		System.out.println("Introduzca salario");

		salario=reader.nextInt(); //Ciudad por teclado
		System.out.println("Introduzca posicion del jugador (Delantero,Centro,Defensa,Portero):");
		reader.nextLine();
		posicion=reader.nextLine(); //Direccion estadio por teclado
		

		System.out.println("Introduzca si es titular (true o false):");
		

		titular=reader.nextBoolean(); //Direccion estadio por teclado

		System.out.println("Introduzca numero jugador");
		

		num=reader.nextInt(); //Direccion estadio por teclado
		reader.nextLine();
		Iterator<?> it = lJugadores.entrySet().iterator();
		while (it.hasNext()) {
		    Entry<Integer,Jugador> e1 = (Entry<Integer, Jugador>) it.next();
		    Jugador uno=e1.getValue();
		    int b;
		    b=e1.getKey();
		    
		    if (id2==b){
		    
		    	int num2=uno.getNumero();
		    	if(num2==num) {
		    		System.out.println("El jugador ya existe\n");
		    		return null;
		    	}
		    	
		    	
		    	
		    	
		    
		    
		    	
		    }

		}
		

		//Añadir busqueda equipo por id
		Jugador nuevojugador=new Jugador(id2,nombre,email,tlf,salario,posicion,titular,num);
		
		contador++;
		lJugadores.put(contador,nuevojugador);//Lista con contador
		Iterator<?> it2 = lEquipos.entrySet().iterator();
		while (it2.hasNext()) {
		    Entry<Integer,Equipo> e1 = (Entry<Integer, Equipo>) it2.next();
		    Equipo uno=e1.getValue();
		    int b;
		    b=e1.getKey();
		    
		    if (id2==b){
		    	
		    	uno.AltaJugador(nuevojugador);
		    System.out.println("Jugador añadido\n");
		    
		    	
		    }
		   
		}
		

	
	return nuevojugador;
	}
	//Baja jugador
	
	boolean bajaJugador(int id, int idJ) {
		int id2 = id;
		int id3=idJ;
		int contador2=0;
		int corrector=0;
		int corrector1=0;
		Iterator<?> it2 = lEquipos.entrySet().iterator();
		while (it2.hasNext()) {
		    Entry<Integer,Equipo> e1 = (Entry<Integer, Equipo>) it2.next();
		    Equipo uno=e1.getValue();
		    int b;
		    b=e1.getKey();
		    
		    if (id2==b){
		    	corrector=1;
		    	Iterator<?> it = lJugadores.entrySet().iterator();
				while (it.hasNext()) {
				    Entry<Integer,Jugador> e2 = (Entry<Integer, Jugador>) it.next();
				    Jugador uno2=e2.getValue();
				    
				    
				    
				    
				    	int num2=uno2.getNumero();
				    	if(num2==id3) {
				    		corrector1=1;
				    		uno.BajaJugador(uno2);
				    		System.out.println("Jugador borrado\n");
				    		
				    		Iterator<?> it11 = lJugadores.entrySet().iterator();
				    		while (it11.hasNext()) {
				    		    Entry<Integer,Jugador> e3 = (Entry<Integer, Jugador>) it11.next();
				    		    Jugador uno3=e3.getValue();
				    		   int num3=uno3.getNumero();
				    		   if(num3==num2) {
				    			   contador2=e3.getKey();
				    		   }
				    		    
				    		   

				    		}
				    		
				    		lJugadores.remove(contador2,uno2);
				    		num2=0;
				    		return true;
				    	}
				    	
				    	
				    	
				    	
				    
				    
				    	
				    
		    	
		    	
		    	
		    	
		
		    
		    	
		    }
		   if(corrector1==0) {
		    	System.out.println("El jugador no existe\n");
		    	return false;
		   }
		}
		
		  
		    
	}
		if(corrector==0) {
	    	System.out.println("El equipo no existe\n");
	    	return false;
		}
	//Alta arbitro
	return true;
	}
	Arbitro altaArbitro() {
		int id=0;
		String nombre=null; 
		String email=null;
		String tlf=null;
		String tipo=null;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce id de arbitro: ");
		id=reader.nextInt();
		
		
		reader.nextLine();
		
		Iterator<?> it = lArbitros.entrySet().iterator();
		while (it.hasNext()) {
		    Entry<Integer,Arbitro> e1 = (Entry<Integer, Arbitro>) it.next();
		    Arbitro uno=e1.getValue();
		    int b;
		    b=e1.getKey();
		    
		    if (id==b){
		    
		    	
		    System.out.println("El arbitro ya existe\n");
		    
		    	return null;
		    }

		}
		
		
		System.out.println("Introduce nombre de arbitro: ");
		nombre=reader.nextLine();
		
		System.out.println("Introduce email de arbitro: ");
		email=reader.nextLine();
		
		System.out.println("Introduce tlfn de arbitro: ");
		tlf=reader.nextLine();
		
		
		System.out.println("Introduce tipo de arbitro: ");
		tipo=reader.nextLine();
		
		Arbitro nuevoarbitro=new Arbitro(id,nombre,email,tlf,tipo);
		
		
		lArbitros.put(id,nuevoarbitro);
		
		
		return nuevoarbitro;
		
	}
	//Baja arbitro
	
  boolean bajaArbitro(int id) {
	  int id3=id;
	  int corrector=0;
	  Iterator<?> it = lArbitros.entrySet().iterator();
		while (it.hasNext()) {
		    Entry<Integer,Arbitro> e1 = (Entry<Integer, Arbitro>) it.next();
		    Arbitro uno=e1.getValue();
		    int b;
		    b=e1.getKey();
		    
		    if (id3==b){
		    corrector=1;
		    	
		    System.out.println("Arbitro borrado\n");
		    lArbitros.remove(id3);
		    	return true;
		    }
		   
		}
    	
		if(corrector==0) {
		    System.out.println("El arbitro no existe\n");
		    return false;
		}
	
	  
		 return true;
	  
  }
  //Alta Estadio
  
	Estadio altaEstadio() {
		int Idestadio=0;
		String Direccion=null;
		String Ciudad=null;
		int Capacidad=0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce id estadio: ");
		Idestadio=reader.nextInt();
		reader.nextLine();
		
		Iterator<?> it = lEstadios.entrySet().iterator();
		while (it.hasNext()) {
		    Entry<Integer,Estadio> e1 = (Entry<Integer, Estadio>) it.next();
		    Estadio uno=e1.getValue();
		    int b;
		    b=e1.getKey();
		    
		    if (Idestadio==b){
		    
		    	
		    System.out.println("El estadio ya existe\n");
		    
		    	return null;
		    }

		}
		System.out.println("Introduce direccion estadio: ");
		Direccion=reader.nextLine();
		
		System.out.println("Introduce ciudad de estadio: ");
		Ciudad=reader.nextLine();
		
		
		System.out.println("Introduce capacidad estadio: ");
		Capacidad=reader.nextInt();
		
		
		
		
		Estadio nuevoestadio=new Estadio(Idestadio,Direccion,Ciudad,Capacidad);
		lEstadios.put(Idestadio,nuevoestadio);
		return nuevoestadio;
		
		
	}
	
	//Alta Partido
	
	Partido altaPartido() {
		int id1=0;
		int id2=0;
		int idE=0;
		int Idpartido=0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce id de partido: ");
		Idpartido=reader.nextInt();
		
		
		reader.nextLine();//Traga lineas
		
		Iterator<?> it = lPartidos.entrySet().iterator();
		while (it.hasNext()) {
		    Entry<Integer,Partido> e1 = (Entry<Integer, Partido>) it.next();
		    Partido uno=e1.getValue();
		    int b;
		    b=e1.getKey();
		    
		    if (Idpartido==b){
		    
		    	
		    System.out.println("El partido ya existe\n");
		    
		    	return null;
		    }

		}
		
		System.out.println("Introduce id de estadio: ");
		idE=reader.nextInt();
		reader.hasNextLine();//Traga lineas
		int corrector=0;
		int corrector1=0;
		int corrector2=0;
		Iterator<?> it2 = lEstadios.entrySet().iterator();
		while (it2.hasNext()) {
		    Entry<Integer,Estadio> e1 = (Entry<Integer, Estadio>) it2.next();
		    Estadio uno=e1.getValue();
		    int b;
		    b=e1.getKey();
		    
		    if (idE==b){
		    
		    	
		    System.out.println("El  estadio existe\n");
		    corrector=1;
		    	
		    }
		    
		}
		if (corrector==0) {
			System.out.println("El estadio no existe\n");
			return null;
		}
		
		System.out.println("Introduce id de equipo 1: ");
		id1=reader.nextInt();
		reader.hasNextLine();//Traga lineas
		
		
		Iterator<?> it22 = lEquipos.entrySet().iterator();
		while (it22.hasNext()) {
		    Entry<Integer,Equipo> e1 = (Entry<Integer, Equipo>) it22.next();
		    Equipo uno=e1.getValue();
		    int b;
		    b=e1.getKey();
		    
		    if (id1==b){
		    
		    	
		    System.out.println("El equipo existe\n");
		    corrector1=1;
		    	
		    }
		    
		}
		if (corrector1==0) {
			System.out.println("El equipo no existe\n");
			return null;
		}
		
		System.out.println("Introduce id de equipo 2: ");
		id2=reader.nextInt();
		reader.hasNextLine();//Traga lineas
		
		Iterator<?> it223 = lEquipos.entrySet().iterator();
		while (it223.hasNext()) {
		    Entry<Integer,Equipo> e1 = (Entry<Integer, Equipo>) it223.next();
		    Equipo uno=e1.getValue();
		    int b;
		    b=e1.getKey();
		    
		    if (id2==b){
		    
		    	
		    System.out.println("El equipo existe\n");
		    corrector2=1;
		    	
		    }
		    
		}
		if (corrector2==0) {
			System.out.println("El equipo no existe\n");
			return null;
		}
		
		
		
		reader.nextLine();
		String Fecha=null;
		System.out.println("Introduce fecha de partido (Dia/Mes/Año): ");
		Fecha=reader.nextLine();
		System.out.println("Introduce true si es la ida: ");
		boolean ida=false;

		ida=reader.hasNextBoolean();
		int golesA=0;
		int golesB=0;
		reader.nextLine();
		System.out.println("Goles del equipo 1: ");
		golesA=reader.nextInt();
		reader.nextLine();
		System.out.println("Goles del equipo 2: ");
		golesB=reader.nextInt();
		reader.nextLine();
		
		
		Partido nuevopartido=new Partido(Idpartido,idE,Fecha,id1,id2,ida,golesA,golesB);
		lPartidos.put(Idpartido,nuevopartido);
		
		CalcularPosicionesEquipos(id1);
		CalcularPosicionesEquipos(id2);
		
		return nuevopartido;
		
	}
	
	//Baja partido
	
	
	boolean bajaPartido(int id) {
		int id8=id;
		int corrector=0;
		Iterator<?> it = lPartidos.entrySet().iterator();
		while (it.hasNext()) {
		    Entry<Integer,Partido> e1 = (Entry<Integer, Partido>) it.next();
		    Partido uno=e1.getValue();
		    int b;
		    b=e1.getKey();
		    
		    if (id8==b){
		    
		    	
		    System.out.println("El partido existe\n");
		    lPartidos.remove(id8);
		    System.out.println("Partido borrado\n");

		    	corrector=1;
		    }

		}
		if(corrector==0) {
		    System.out.println("El partido no existe\n");
		    	return false;
		}
	
		
		
		
		return true;
		
	}
	
	//Listar estadios
	
	
	void listarEstadios() {
		Iterator<?> it = lEstadios.entrySet().iterator();
		while (it.hasNext()) {
		    Map.Entry e = (Map.Entry)it.next();
		    Estadio mostrar=(Estadio) e.getValue();
		    
		    System.out.println(mostrar.toString());
		   
		}
		
		
		
		
		
	}
	//listar equipos
	
	
	void listarEquipos() {
		
		Iterator<?> it = lEquipos.entrySet().iterator();
		while (it.hasNext()) {
		    Entry<Integer,Equipo> e1 = (Entry<Integer, Equipo>) it.next();
		    Equipo mostrar2=e1.getValue();
		   
		    System.out.println(mostrar2.toString());
		    
		}
	}
	
	//Listar arbitros
	
	void listarArbitros() {
	
		Iterator<?> it = lArbitros.entrySet().iterator();
		while (it.hasNext()) {
		    Map.Entry e = (Map.Entry)it.next();
		    Arbitro mostrar=(Arbitro) e.getValue();
		    System.out.println(mostrar.toString());
		 
		}
	}
	//Contar partidos
	
	int ContarPartidos() {
		int partidos=0;
		partidos=lPartidos.size();
		
		return partidos;
	}
	
	//Listar partidos
	
	
	void listarPartidos(String fecha) {
		String afecha=fecha;
		Partido uno;
		int corrector=0;
		Iterator<?> it22 = lPartidos.entrySet().iterator();
		while (it22.hasNext()) {
		    Entry<Integer,Partido> e = (Entry<Integer, Partido>) it22.next();
		    
		    uno=e.getValue();
		    String afecha2=uno.getFecha();
		   
		    if (afecha.equals(afecha2)) {
		    System.out.println(uno.toString());
		    corrector=1;
		    }
		}
	if(corrector==0) {
    	System.out.println("No existe ningun partido con esa fecha\n");

	}
	}
	
	//Listar partidos
	
	
	void listarPartidosE(int idP) {
		int corrector=0;
		int a=idP;
		Partido uno;
		int iddos;
		int idtres;
		Iterator<?> it33 = lPartidos.entrySet().iterator();
		while (it33.hasNext()) {
		    Entry<Integer,Partido> e = (Entry<Integer, Partido>) it33.next();
		   uno=e.getValue();
		   iddos=uno.getEquipo1();
		   
		    idtres=uno.getEquipo2();
		    
		    
			if (a==iddos||a==idtres) {
				System.out.println(uno);
				corrector=1;
			}
			
		}
		if(corrector==0) {
	    	System.out.println("No existe el equipo\n");

		}
		
	}
	// Listar jugadores segun posicion
	
	void listarJugadores(String posicion) {
		String pos=posicion;
		int corrector=0;
		
		Iterator<?> it = lJugadores.entrySet().iterator();
		while (it.hasNext()) {
		    Entry<Integer,Jugador> e = (Entry<Integer, Jugador>) it.next();
		    Jugador tres=e.getValue();
		    String pos2;
		    pos2=tres.getPosicion();
		   
		    if (pos.equals(pos2)){
		    	
		    	System.out.println(tres.getNombre());
		    	corrector=1;
		    	
		    }
		    
		}
		if(corrector==0) {
	    	System.out.println("No existe ningun jugador en esa posicion\n");

		}
		}
	//Listar jugadores segun equipo
	
	void listarJugadoresEquipo(int idE) {
		
		int a=idE;
		int corrector=0;
		Iterator<?> it = lEquipos.entrySet().iterator();
		while (it.hasNext()) {
		    Entry<Integer,Equipo> e1 = (Entry<Integer, Equipo>) it.next();
		    Equipo uno=e1.getValue();
		    int b;
		    b=e1.getKey();
		    
		    if (a==b){
		    	
		    LinkedList<Jugador> mostrar=uno.getJugadores();
		    Collections.reverse(mostrar);
		    Iterator<Jugador> iter=mostrar.descendingIterator();
		    while (iter.hasNext()) {
		    
		    
		    	/*System.out.println(iter.next().getNombre());
		    	System.out.println(iter.next().getPosicion());
		    	System.out.println(iter.next().getEmail());
		    	System.out.println(iter.next().getTlf());
		    	System.out.println(iter.next().getNumero());*/
		    	System.out.println(iter.next().toString());
		    	corrector=1;

		    }
		    }
		    
		}
		if(corrector==0) {
	    	System.out.println("El equipo no existe\n");

		}
	}
	//Guardar datos
	
	public void Salvar() throws FileNotFoundException, IOException{
		
		
		ObjectOutputStream oss= new ObjectOutputStream(new FileOutputStream("salvar.txt"));
		oss.writeObject(lEquipos);
		
		oss.writeObject(lJugadores);

		oss.writeObject(lEstadios);

		oss.writeObject(lArbitros);

		oss.writeObject(lPartidos);
		
		oss.writeObject(lGoles);
		



		oss.close();
	
	}
	
	//Cargar datos
	@SuppressWarnings("unchecked")
	public void CargarDatos() throws FileNotFoundException, IOException, ClassNotFoundException{
		
		
		
		
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("cargar.txt"));
		lEquipos= (Map<Integer, Equipo>) ois.readObject();
		
		lJugadores = (Map<Integer, Jugador>) ois.readObject();

		lEstadios = (Map<Integer, Estadio>) ois.readObject();

		lArbitros =(Map<Integer, Arbitro>) ois.readObject();

		lPartidos = (Map<Integer,Partido>) ois.readObject();
		
		lGoles = (SortedMap<Integer, Integer>) ois.readObject();

	ois.close();
	
	}
	void CalcularCampeonTemporada(){
		
	SortedMap<Integer, Integer> lGoles2 = new TreeMap<Integer, Integer>(java.util.Collections.reverseOrder());
	SortedMap<Integer, Integer> lGoles3 = new TreeMap<Integer, Integer>(java.util.Collections.reverseOrder());
		lGoles2=lGoles;
		int key2=0;
		int key3=0;
		Iterator<?> it22 = lGoles2.entrySet().iterator();
		while (it22.hasNext()) {
		    Entry<Integer,Integer> e = (Entry<Integer, Integer>) it22.next();
		    key2=e.getKey();
		    key3=e.getValue();
		    lGoles3.put(key3,key2);
		}
		
		Iterator<Integer> iterator = lGoles3.keySet().iterator();
		while (iterator.hasNext()) {
		Object key = iterator.next();
		System.out.println("Goles : " + key + " Id Equipo :" + lGoles3.get(key));
		
		}
		
		
		
		
		
		
}
	void CalcularPosicionesEquipos(int idequipo) {
		int id=idequipo;
		Partido uno;
		int corrector=0;
		int id1;
		int id2;
		int goles1=0;
		int goles2=0;
		int golestotal=0;
		Iterator<?> it22 = lPartidos.entrySet().iterator();
		while (it22.hasNext()) {
		    Entry<Integer,Partido> e = (Entry<Integer, Partido>) it22.next();
		    
		    uno=e.getValue();
		    id1=uno.getEquipo1();
		    id2=uno.getEquipo2();
		    goles1=uno.getGoles1();
		    goles2=uno.getGoles2();
		    
		    if (id==id1) {
		    golestotal=golestotal+goles1;
		    corrector=1;
		    }
		    if(id==id2) {
			    golestotal=golestotal+goles2;
			    corrector=1;

		    }
		}
	if(corrector==0) {
		System.out.println("No se ha encontrado el equipo en la lista de partidos\n");
		
	}
	
	System.out.println("Goles totales:\n");
	System.out.println(golestotal);
	System.out.println("Id de equipo:\n");
	System.out.println(id);
	lGoles.put(id,golestotal);
	Iterator<?> it23 = lEquipos.entrySet().iterator();
	while (it23.hasNext()) {
	    Entry<Integer,Equipo> e = (Entry<Integer, Equipo>) it23.next();
	    if(id==e.getKey()) {
	    	Equipo uno2;
	    	uno2=e.getValue();
	    	uno2.setGoles(golestotal);
	    	
	    }
	    
	}

	
	}
}
