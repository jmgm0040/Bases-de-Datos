package appfutbol;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
import java.util.Map.Entry;



public class AppFutbol implements Serializable{
	private Map<Integer, Equipo> lEquipos = new HashMap<Integer, Equipo>(); //id de equipo
	private Map<Integer, Jugador> lJugadores = new HashMap<Integer, Jugador>(); // id jugador
	private Map<Integer, Arbitro> lArbitros = new HashMap<Integer, Arbitro>();
	private Map<Integer, Estadio> lEstadios = new HashMap<Integer, Estadio>();
	public LinkedList<Partido> lPartidos=new LinkedList<Partido>();
	// AppFutbol () //Aquí se pueden cargar los datos o en un nuevo método

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

System.out.println("Introduzca id de estadio");

reader.nextLine();

idEstadio=reader.nextInt(); //Id estadio por teclado

System.out.println("Introduzca direccion del estadio");
reader.nextLine();

direccionEstadio=reader.nextLine(); //Direccion estadio por teclado

System.out.println("Introduzca la ciudad del estadio");

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
		lEquipos.remove(id2);
		return true;
		/*int idequipo=0;
		boolean control=false;
		if (lEquipos.isEmpty()) {
		
		control=false;
		}
		else { 
			lEquipos.remove(idequipo);
			control=true;
		}
		if (control==true) {
		return control;
		}
		else return false;*/
	}
	//Alta jugador
	
	
	Jugador altaJugador(int id) {
		int id2=0; 
		String nombre=null; 
		String email=null; 
		String tlf=null; 
		int salario=0; 
		String posicion=null; 
		boolean titular=false; 
		int num=0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca nombre de jugador");

		nombre=reader.nextLine();//por teclado

		System.out.println("Introduzca email");

		

		email=reader.nextLine(); //Id estadio por teclado

		System.out.println("Introduzca telefono");
		

		tlf=reader.nextLine(); //Direccion estadio por teclado

		System.out.println("Introduzca salario");

		salario=reader.nextInt(); //Ciudad por teclado
		System.out.println("Introduzca posicion del jugador");
		reader.nextLine();
		posicion=reader.nextLine(); //Direccion estadio por teclado
		System.out.print(posicion);

		System.out.println("Introduzca si es titular");
		

		titular=reader.nextBoolean(); //Direccion estadio por teclado

		System.out.println("Introduzca numero jugador");
		

		num=reader.nextInt(); //Direccion estadio por teclado
		reader.nextLine();
		

		//Añadir busqueda equipo por id
		Jugador nuevojugador=new Jugador(id2,nombre,email,tlf,salario,posicion,titular,num);
		lJugadores.put(id,nuevojugador);
		
		
		//Se da de alta en un equipo y si no está en el sistema también
	
	return nuevojugador;
	}
	//Baja jugador
	
	boolean bajaJugador(int id) {
		int id2 = id;
		lEquipos.remove(id2);
		return true;
		
		// de un equipo, no del sistema
	}
	//Alta arbitro
	
	
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
	  
	  lArbitros.remove(id3);
	  
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
		System.out.println("Introduce direccion estadio: ");
		Direccion=reader.nextLine();
		
		System.out.println("Introduce ciudad de estadio: ");
		Ciudad=reader.nextLine();
		
		
		System.out.println("Introduce capacidad estadio: ");
		Capacidad=reader.nextInt();
		
		
		
		
		Estadio nuevoestadio=new Estadio(Idestadio,Direccion,Ciudad,Capacidad);
		lEstadios.put(Idestadio,nuevoestadio);
		return nuevoestadio;
		
		//del sistema
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
		System.out.println("Introduce id de estadio: ");
		idE=reader.nextInt();
		reader.hasNextLine();//Traga lineas
		System.out.println("Introduce id de equipo 1: ");
		id1=reader.nextInt();
		reader.hasNextLine();//Traga lineas
		System.out.println("Introduce id de equipo 2: ");
		id2=reader.nextInt();
		reader.hasNextLine();//Traga lineas
		
		Iterator it = lEquipos.entrySet().iterator();
		while (it.hasNext()) {
		    Entry<Integer,Equipo> e = (Entry<Integer, Equipo>) it.next();
		    int idEq1=e.getKey();
		    if (id1==idEq1) {
		    System.out.println(e.getKey() + " " + e.getValue());
		    Equipo eq1=e.getValue();
		    
		}
		}
		Iterator it2 = lEquipos.entrySet().iterator();
		while (it2.hasNext()) {
		    Entry<Integer,Equipo> e = (Entry<Integer, Equipo>) it2.next();
		    int idEq2=e.getKey();
		    if (id2==idEq2) {
		    System.out.println(e.getKey() + " " + e.getValue());
		    int eq2=e.getKey();
		    
		}
		}
		Iterator it21 = lEstadios.entrySet().iterator();
		while (it21.hasNext()) {
		    Entry<Integer,Estadio> e = (Entry<Integer, Estadio>) it21.next();
		    int idEE=e.getKey();
		    if (idE==idEE) {
		    System.out.println(e.getKey() + " " + e.getValue());
		    Estadio E=e.getValue();
		 
		    
		}
		    //else altaEstadio();
		}
		//String datos=null;
		reader.nextLine();
		String Fecha=null;
		System.out.println("Introduce fecha de partido: ");
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
		//REVISAR
		//datos=nuevopartido.toString();
		lPartidos.add(nuevopartido);
		
		return nuevopartido;
		
	}
	
	//Baja partido
	
	
	boolean bajaPartido(int id) {
		int id5=id;
		
		lPartidos.remove(id5);
		
		return true;
		
	}
	
	//Listar estadios
	
	
	void listarEstadios() {
		Iterator it = lEstadios.entrySet().iterator();
		while (it.hasNext()) {
		    Map.Entry e = (Map.Entry)it.next();
		    System.out.println(e.getKey() + " " + e.getValue());
		    e.toString();
		}
		
		//System.out.println(lEstadios.values());//Comprobar la salida
		
		
		
	}
	//listar equipos
	
	
	void listarEquipos() {
		//System.out.println(lEquipos.values());//Comprobar la salida
		Iterator it = lEquipos.entrySet().iterator();
		while (it.hasNext()) {
		    Entry<Integer,Equipo> e = (Entry<Integer, Equipo>) it.next();
		    System.out.println(e.getKey() + " " + e.getValue());
		    e.toString();
		}
	}
	
	//Listar arbitros
	
	void listarArbitros() {
		//System.out.println(lArbitros.values());//Comprobar la salida
		Iterator it = lArbitros.entrySet().iterator();
		while (it.hasNext()) {
		    Map.Entry e = (Map.Entry)it.next();
		    System.out.println(e.getKey() + " " + e.getValue());
		    e.toString();
		}
	}
	//Contar partidos
	
	int ContarPartidos() {
		int partidos=0;
		partidos=lPartidos.size();
		
		return partidos;
	}
	
	//Listar partidos ARREGLAR
	
	
	void listarPartidos(String fecha) {
		String afecha=fecha;
		int i=1;
		Partido uno;
		String dos=null;
		int tamanio=0;
		tamanio=lPartidos.size();//NO FUNCIONAAA
		for(i=1;i<(tamanio+1);i++) {
			uno=lPartidos.get(i);//Arreglar
			dos=uno.getFecha();
			if (afecha==dos) {
				System.out.println(uno);//REVISAR 
			}
		}
	
	}
	
	//Listar partidos
	
	
	void listarPartidosE(int idP) {
		//Cambiar equipo por int
		int a=idP;
		int i=1;
		Partido uno;
		Equipo dos;
		int iddos;
		int idtres;
		Equipo tres;
		int tamanio=0;
		tamanio=lPartidos.size();//NO FUNCIONAAA
		for(i=1;i<(tamanio+1);i++) {
			uno=lPartidos.get(i);
			iddos=uno.getEquipo1();
			Iterator it22 = lEquipos.entrySet().iterator();
			while (it22.hasNext()) {
			    Entry<Integer,Equipo> e = (Entry<Integer, Equipo>) it22.next();
			    int idPP=e.getKey();
			    if (iddos==idPP) {
			    System.out.println(e.getKey() + " " + e.getValue());
			    }
			}
			
			
			
			idtres=uno.getEquipo2();
			Iterator it23 = lEquipos.entrySet().iterator();
			while (it23.hasNext()) {
			    Entry<Integer,Equipo> e = (Entry<Integer, Equipo>) it23.next();
			    int idPP2=e.getKey();
			    if (idtres==idPP2) {
			    System.out.println(e.getKey() + " " + e.getValue());
			    }
			}
			
			
			
			if (a==iddos||a==idtres) {
				System.out.println(uno);//REVISAR 
			}
		
		//devuelve partidos y fechas
	
		
	}
	}
	// Listar jugadores segun posicion
	
	void listarJugadores(String posicion) {
		String pos=posicion;
		
		
		Iterator it = lJugadores.entrySet().iterator();
		while (it.hasNext()) {
		    Entry<Integer,Jugador> e = (Entry<Integer, Jugador>) it.next();
		    Jugador tres=e.getValue();
		    String pos2;
		    int idbusqueda=e.getKey();
		    pos2=tres.getPosicion();
		    if (pos2==pos) {
		    	System.out.println(pos);
		    	System.out.println(e.getKey() + " " + e.getValue());
		    	System.out.println(tres.getNombre());
		    	tres.toString();
		    }
		    
		}
		}
	//Listar jugadores segun equipo
	
	void listarJugadoresEquipo(int idE) {
		
		int a=idE;

		Iterator it = lEquipos.entrySet().iterator();
		while (it.hasNext()) {
		    Entry<Integer,Equipo> e1 = (Entry<Integer, Equipo>) it.next();
		    Equipo uno=e1.getValue();
		    int b;
		    b=e1.getKey();
		    
		    if (a==b){
		    	System.out.println(a);
		    	System.out.println(e1.getKey() + " " + e1.getValue());
		    	System.out.println(uno.getJugadores());
		    	e1.toString();
		    }
		    
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

		oss.close();
	}
	
	//Cargar datos
	public void CargarDatos() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("salvar.txt"));
		lEquipos= (Map<Integer, Equipo>) ois.readObject();
		
		lJugadores = (Map<Integer, Jugador>) ois.readObject();

		lEstadios = (Map<Integer, Estadio>) ois.readObject();

		lArbitros =(Map<Integer, Arbitro>) ois.readObject();

		lPartidos = (LinkedList<Partido>) ois.readObject();
	ois.close();
	}
	// void CalcularCampeonTemporada() **OPCIONAL**
	// void CalcularPosicionesEquipos(lequipos) **OPCIONAL**
}
