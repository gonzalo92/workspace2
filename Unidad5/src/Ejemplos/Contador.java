package Ejemplos;

public class Contador {
 private  long acumulador=1;
 private int i, j;
 
 public long getContador(){
	 
	 return  acumulador;
 }
 public void setContador(int contador){
	 acumulador=contador;
 }
 public void incrementar(){
	 this.acumulador++;
 }
 
 
  
}
