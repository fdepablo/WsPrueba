package main;

import java.util.Scanner;

public class MainGit {

	public static void main(String[] args) {
		System.out.println("Hola Mundo Java con Git :) :)");
		Scanner sc = new Scanner(System.in);
		int numero1 = sc.nextInt();
		System.out.println("El numero introducido ha sido " + numero1);
		
		int numero2 = sc.nextInt();
		System.out.println("El numero introducido ha sido " + numero2);
		
		int resultado = Suma.sumar(numero1, numero2);
		System.out.println("El resultado es: " + resultado);
	}

}
