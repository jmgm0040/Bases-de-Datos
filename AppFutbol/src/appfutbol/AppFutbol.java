package appfutbol;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;



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

System.out.println(direccionEstadio);



System.out.println("Introduzca la ciudad del estadio");



ciudad=reader.nextLine(); //Ciudad por teclado



System.out.println(ciudad);





Estadio nuevoEstadio = new Estadio (idEstadio, direccionEstadio, ciudad, capacidad);
lEstadios.put(idEstadio, nuevoEstadio); //Arreglar
int posicion = 0;
Equipo nuevoequipo=new Equipo(idequipo,nuevoEstadio,posicion);
lEquipos.put(idequipo,nuevoequipo);
return nuevoequipo;


	}
	//Baja equipo
	boolean bajaEquipo() {
		int idequipo=0;
		boolean control=false;
		
		lEquipos.remove(idequipo);
		control=true;
		
		
		if (control==true) {
		return control;
		}
		else return false;
	}
	//Alta jugador
	
	
	Jugador altaJugador(Equipo e) {
		int id=0; 
		String nombre=null; 
		String email=null; 
		String tlf=null; 
		int salario=0; 
		String posicion=null; 
		boolean titular=false; 
		int num=0;
		//Añadir busqueda equipo por id
		Jugador nuevojugador=new Jugador(id,nombre,email,tlf,salario,posicion,titular,num);
		lJugadores.put(id,nuevojugador);
		
		
		//Se da de alta en un equipo y si no está en el sistema también
	
	return nuevojugador;
	}
	//Baja jugador
	
	boolean bajaJugador() {
		int id=0;
		boolean control=false;
		
		lEquipos.remove(id);
		control=true;
		
		if (control==true) {
			return control;
			}
			else return false;
		
		// de un equipo, no del sistema
	}
	//Alta arbitro
	
	
	Arbitro altaArbitro() {
		int id=0;
		String nombre=null; 
		String email=null;
		String tlf=null;
		String tipo=null;
		
		Arbitro nuevoarbitro=new Arbitro(id,nombre,email,tlf,tipo);
		lArbitros.put(id,nuevoarbitro);
		
		
		return nuevoarbitro;
		
	}
	//Baja arbitro
	
  boolean bajaArbitro() {
	  int id=0;
	  boolean control=false;
	  lArbitros.remove(id);
	  control=true;
	  
	  if (control==true) {
			return control;
			}
			else return false;
	  
  }
  //Alta Estadio
  
	Estadio altaEstadio() {
		int Idestadio=0;
		String Direccion=null;
		String Ciudad=null;
		int Capacidad=0;
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
		//String datos=null;
		Estadio e=lEstadios.get(idE);
		String Fecha=null;
		Equipo eq1=lEquipos.get(id1); 
		Equipo eq2=lEquipos.get(id2); 
		boolean ida=false;
		int golesA=0;
		int golesB=0;
		Partido nuevopartido=new Partido(Idpartido,e,Fecha,eq1,eq2,ida,golesA,golesB);
		//REVISAR
		//datos=nuevopartido.toString();
		lPartidos.add(nuevopartido);
		
		return nuevopartido;
		
	}
	
	//Baja partido
	
	
	boolean bajaPartido() {
		int id=0;
		boolean control=false;
		lPartidos.remove(id);
		
		control=true;
		  
		  if (control==true) {
				return control;
				}
				else return false;
		
	}
	
	//Listar estadios
	
	
	void listarEstadios() {
		System.out.println(lEstadios.values());//Comprobar la salida
		
		
		
	}
	//listar equipos
	
	
	void listarEquipos() {
		System.out.println(lEquipos.values());//Comprobar la salida
		
	}
	
	//Listar arbitros
	
	void listarArbitros() {
		System.out.println(lArbitros.values());//Comprobar la salida
		
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
		tamanio=lPartidos.size();
		for(i=1;i<(tamanio+1);i++) {
			uno=lPartidos.get(i);
			dos=uno.getFecha();
			if (afecha==dos) {
				System.out.println(uno);//REVISAR 
			}
		}
	
	}
	
	//Listar partidos
	
	
	void listarPartidos(Equipo e) {
		//Cambiar equipo por int
		Equipo a=e;
		int i=1;
		Partido uno;
		Equipo dos;
		Equipo tres;
		int tamanio=0;
		tamanio=lPartidos.size();
		for(i=1;i<(tamanio+1);i++) {
			uno=lPartidos.get(i);
			dos=uno.getEquipo1();
			tres=uno.getEquipo2();
			if (a==dos||a==tres) {
				System.out.println(uno);//REVISAR 
			}
		}
		//devuelve partidos y fechas
	}
	
	// Listar jugadores segun posicion
	
	void listarJugadores(String posicion) {
		String pos=posicion;
		int i=1;
		Jugador uno;
		String dos=null;
		int tamanio=0;
		tamanio=lJugadores.size();
		for(i=1;i<(tamanio+1);i++) {
			uno=lJugadores.get(i);
			dos=uno.getPosicion();
			if (pos==dos) {
				System.out.println(uno);//REVISAR 
			}
		}
		
	}
	//Listar jugadores segun equipo
	
	void listarJugadoresEquipo(Equipo e) {
		
		Equipo a=e;
		int i=1;
		Equipo uno;
		LinkedList<Jugador> dos;
		int tamanio=0;
		tamanio=lEquipos.size();
		for(i=1;i<(tamanio+1);i++) {
			uno=lEquipos.get(i);
			dos=uno.getJugadores();
			if (a==uno) {
				System.out.println(dos);//REVISAR 
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
	}
	// void CalcularCampeonTemporada() **OPCIONAL**
	// void CalcularPosicionesEquipos(lequipos) **OPCIONAL**
}
