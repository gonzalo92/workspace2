package Mas_Ejercicios;


	 //Ejemplo de uso ArrayList aprenderaprogramar.com

	import java.util.ArrayList; //Los import deben ir siempre al principio antes de declarar la clase

	 

	//Esta clase representa una lista de nombres manejada con la clase ArrayList de Java

	public class ListaNombres {

	    private String nombreDeLaLista; //Establecemos un atributo nombre de la lista

	    private ArrayList<String> listadenombres; //Declaramos un ArrayList que contiene objetos String

	 

	    public ListaNombres (String nombre) {    //Constructor: crea una lista de nombres vac�a

	        nombreDeLaLista = nombre;

	        listadenombres = new ArrayList<String>(); //Creamos el objeto de tipo ArrayList

	    } //Cierre del constructor

	 

	    public void addNombre (String valor_nombre) { listadenombres.add (valor_nombre); } //Cierre del m�todo

	 

	    public String getNombre (int posicion) { //M�todo

	        if (posicion >= 0 && posicion < listadenombres.size() ) {

	            return listadenombres.get(posicion); }

	        else { return "No existe nombre para la posici�n solicitada";}

	    } //Cierre del m�todo  

	 

	    public int getTama�o () { return listadenombres.size(); } //Cierre del m�todo

	 

	    public void removeNombre (int posicion) {  //M�todo

	        if (posicion >= 0 && posicion < listadenombres.size() ) {

	            listadenombres.remove(posicion); }

	        else { } //else vac�o. No existe nombre para la posici�n solicitada, no se ejecuta ninguna instrucci�n

	    } //Cierre del m�todo removeNombre

	} //Cierre de la clase