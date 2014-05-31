package Ejercicios_Iniciales2;

public class Ejercicico_peso {

	public static void main(String[] args) {
		/*
		 *Crea la clase peso, la cual tendrá las siguientes características:
          Deberá tener un atributo donde se almacene el peso de un objeto en kilogramos.
          En el constructor se le pasará el peso y la medida en la qué se ha tomado ‘Lb’ para libras, ‘Li’ para lingotes, 
          ‘Oz’ para onzas, ‘P’ para peniques, ‘K’ para kilos, ‘G’ para gramos y ‘Q’ para quintales).
          Deberá tener los siguientes métodos:
            getLibras. Devuelve el peso en libras.
            getLingotes. Devuelve el peso en lingotes.
            getPeso. Devuelve el peso en la medida que se pase como parámetro 
                (‘Lb' para libras, ‘Li’ para lingotes, ‘Oz’ para onzas, ‘P’ para peniques, ‘K' para kilos, ‘G’ para gramos y ‘Q’ para quintales).
          Para la realización del ejercicio toma como referencia los siguientes 
          datos: 1 Libra = 16 onzas = 453 gramos. 1 Lingote = 32,17 libras = 14,59 kg. 1 Onza = 0,0625 libras = 28,35 gramos.
           1 Penique = 0,05 onzas = 1,55 gramos. 1 Quintal = 100 libras = 43,3 kg.
		 */
		
	}
	public double libras;
	public double lingotes;
	public double peso;
	
	
	public double getLibras() {
		//1 Libra = 16 onzas = 453 gramos
		double libOnz = 0;
		double lib= 0;
		double grm = 453;
		double onzGram = 0;
		double onz = 16;
		libOnz = lib * onz;
		onzGram = onz * grm;
		return libras;
	}

	public double getLingotes() {
		return lingotes;
	}

	public double getPeso() {
		return peso;
	}

}
