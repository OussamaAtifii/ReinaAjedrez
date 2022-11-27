package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	private Consola() {
		
	}
	
	public static void mostrarMenu() {
		System.out.println("1. - Crear reina por defecto.");
		System.out.println("2. - Crear reina eligiendo el color.");
		System.out.println("3. - Mover.");
		System.out.println("4. - Salir.");
	}
	
	public static int elegirOpcionMenu() {
		int opcionElegida;
		
		do {
		System.out.println("*-------------------------------------*");
		System.out.println("Elige la operación que desea realizar:");
		System.out.println("");
		opcionElegida = Entrada.entero();
		System.out.println("*-------------------------------------*");
		System.out.println("");
		} while (opcionElegida < 1 ||opcionElegida > 4);
		
		return opcionElegida;
	}
	
	public static Color elegirOpcion() {
		int colorElegir = 0;
		Color colorElegido = null;
		
		do {
		System.out.println("*-------------------------------------*");
		System.out.println("Elige el color de reina:");
		System.out.println("*-------------------------------------*");
		System.out.println("1. - Blanco.");
		System.out.println("2. - Negro.");
		System.out.println("");
		colorElegir = Entrada.entero();
		System.out.println("*-------------------------------------*");
		System.out.println("");
		} while (colorElegir != 1 && colorElegir != 2);
		
		switch (colorElegir) {
			case 1: {
				colorElegido = Color.BLANCO;
				break;
			}
			case 2: {
				colorElegido = Color.NEGRO;
				break;
			}
			
		}
			
		return colorElegido;
	}
		
	public static void mostrarMenuDirecciones() {
		System.out.println("*-------------------------------------*");
		System.out.println("1. - Norte.");
		System.out.println("2. - Noreste.");
		System.out.println("3. - Este.");
		System.out.println("4. - Sureste.");
		System.out.println("5. - Sur.");
		System.out.println("6. - Suroeste.");
		System.out.println("7. - Oeste.");
		System.out.println("8. - Noroeste.");
		System.out.println("*-------------------------------------*");
		System.out.println("");
	}
	
	public static Direccion elegirDireccion() {
		int direccionElegida = 0;
		Direccion direccion = null;
		
		do {
		System.out.println("*-------------------------------------*");
		System.out.println("Elige una dirección:");
		direccionElegida = Entrada.entero();
		System.out.println("");
		System.out.println("*-------------------------------------*");
		System.out.println("");
		} while (direccionElegida < 1 ||direccionElegida > 8);
			
		switch (direccionElegida) {
			case 1: {
				direccion = Direccion.NORTE;
				break;
			}
			case 2: {
				direccion = Direccion.NORESTE;
				break;
			}
			case 3: {
				direccion = Direccion.ESTE;
				break;
			}
			case 4: {
				direccion = Direccion.SURESTE;
				break;
			}
			case 5: {
				direccion = Direccion.SUR;
				break;
			}
			case 6: {
				direccion = Direccion.SUROESTE;
				break;
			}
			case 7: {
				direccion = Direccion.OESTE;
				break;
			}
			case 8: {
				direccion = Direccion.NOROESTE;
				break;
			}	
		}
		return direccion;
	}
	
	public static int elegirPasos() {
		int numPasos = 0;
		
		do {
			System.out.println("*-------------------------------------*");
			System.out.println("Elegi el numero de pasos a mover:");
			numPasos = Entrada.entero();
			System.out.println("");
			System.out.println("*-------------------------------------*");
			System.out.println("");
		}while (numPasos < 1 || numPasos > 7); 
		
	return numPasos;
	}
	
	public static void despedirse() {
		System.out.println("*-------------------------------------*");
		System.out.println("Que tenga un buen día.");
		System.out.println("*-------------------------------------*");
	}
}
