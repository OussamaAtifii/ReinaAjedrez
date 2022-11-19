package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {
	private int fila;
	private char columna;
	
	// Setter y Getter para fila
	public int getFila() {
		return fila;
	}
	
	public void setFila(int fila) {
		if (fila < 1 || fila > 8) {
			throw new IllegalArgumentException("ERROR: Fila no valida.");
		}
		
		this.fila = fila;
	}
	
	//Setter y getter para columna
	public char getColumna() {
		return columna;
	}
	
	public void setColumna(char columna) {
		if (columna == 'a') {
			throw new IllegalArgumentException("ERROR: Columna no valida.");
		}
		this.columna = columna;
	}
	
	// Constructor
	public Posicion (int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}
	
	
	
	
	
	
	
	
	
	
	
	//Constructor copia
	
	public Posicion (Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("ERROR: No se puede copiar una posición nula.");
		}
		
		setFila(posicion.getFila());
		setColumna(posicion.getColumna());
		
	}
}
	
	
	
	

