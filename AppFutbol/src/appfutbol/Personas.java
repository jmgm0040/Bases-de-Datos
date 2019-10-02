package appfutbol;
import java.util.*;
import java.io.*;


public class Personas {
public int id;
public String nombre;
private String email;
private String tlf;

Personas(int aid, String anombre, String aemail, String atlf){
id=aid;
nombre=anombre;
email=aemail;
tlf=atlf;

}//Constructor general


public void setEmail(String email) {
	this.email=email;
}
public void setTlf(String tlf) {
	this.tlf=tlf;
}
public String getEmail() {
	return email;
}
public String getTlf() {
	return tlf;
}


}
