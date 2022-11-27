package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;

import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {
	
	private static Reina reina;
	
	public static void main(String[] args) {
		int seleccion;
		boolean acabar = true;

		do {
			Consola.mostrarMenu();
			seleccion = Consola.elegirOpcionMenu();

			try {
				ejecutarOpcion(seleccion);
			} catch (OperationNotSupportedException  | NullPointerException e) {
				System.out.println(e.getMessage()); 
			}

			if (reina != null) {
				try {
					System.out.println("*---------------------------------------------*");
					System.out.println("La posicion de la reina es:");
					mostrarReina();
					System.out.println("*---------------------------------------------*");
					System.out.println("");
				} catch (NullPointerException e) {
					System.out.println(e.getMessage());
					
				}
			}
			
			if (seleccion == 4) {
				acabar = false;
			}
		} while (acabar == true);
	}
	
	private static void crearReinaDefecto() {
		reina = new Reina();
	}
	
	private static void crearReinaColor() {
		reina = new Reina(Consola.elegirOpcion());
	}
	
	private static void mover() throws OperationNotSupportedException {
		
		
		if (reina == null) {
			throw new NullPointerException("ERROR: No existe reina para mover. Antes tienes que crear una reina.");
		} else {
			Direccion direccion = null;
			int pasos = Consola.elegirPasos();
			Consola.mostrarMenuDirecciones();
			direccion = Consola.elegirDireccion();
			reina.mover(direccion, pasos);
		}
	}
	
	private static void mostrarReina() {
		if (reina == null) {
			throw new NullPointerException("ERROR: La reina no está creada");
		} else {
			System.out.println(reina.toString());
		}
	}
	
	private static void ejecutarOpcion(int opcionEjecutar) throws OperationNotSupportedException {
		switch (opcionEjecutar) {
		case 1:
			crearReinaDefecto();
			break;
		
		case 2:
			crearReinaColor();
			break;
		
		case 3:
			mover();
			break;
		case 4:
			Consola.despedirse();
			break;
		}
	}
}
