package Ejemplos;
import java.util.*;
public class Cuenta {

private double saldo=1000;
private long num_transacciones=0;
private String num_cuenta;
public Cuenta(){
	
}
public Cuenta(String num_cuenta){

}

public void ingresar(double cantidad) {
saldo+=cantidad;
num_transacciones++;
}

public void sacar(double cantidad) {
saldo-=cantidad;
if (saldo<0)
System.out.println("¡La cuenta esta en números rojos!");
num_transacciones++;
}

public double getSaldo() {
return saldo;
}

public long getTransacciones() {
return num_transacciones;
   }

public String getNum_cuenta() {
	return num_cuenta;
}


 }
