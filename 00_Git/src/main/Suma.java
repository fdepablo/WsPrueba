package main;

public class Suma {
	
	public static int sumar(int n1, int n2) {
		return n1 + n2;
	}
	
	//La firma de un objeto
	//1- Nombre metodo
	//2- Tipo de argumetos de entrada
	//3- El numero de argumentos de entrada
	/**
	 * Suma de un numero indeterminado de parametros
	 * @param numeros
	 * @return la suma de los parametros de entrada
	 */
	public static int sumar(int... numeros) {
		var valorAcumulado = 0;
		for(int numero : numeros) {
			valorAcumulado += numero;
		}
		return valorAcumulado;
	}
	
	public static double sumar(double d1, double d2) {
		return d1 + d2;
	}


}
