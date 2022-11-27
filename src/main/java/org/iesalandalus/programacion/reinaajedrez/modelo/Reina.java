package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {
	private Color color;
	private Posicion posicion;

	//Get y Set de Color
	public Color getColor() {
		return color;
	}
	private void setColor(Color color) {
		if (color == null) {
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
		}
		this.color = color;
	}

	//Get y Set de Posicion
	public Posicion getPosicion() {
		return posicion;
	}
	private void setPosicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
		}
		this.posicion = posicion;
	}

	//Constructor por defecto
	public Reina() {
		setColor(Color.BLANCO);
		setPosicion(new Posicion(1, 'd'));
	}

	//Constructor Con Color	
	public Reina(Color color) {
		setColor(color);
		if (color == Color.BLANCO) {
			setPosicion(new Posicion(1,'d'));
		} else {
			setPosicion(new Posicion(8,'d'));
		}
	}

	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {

		if (direccion == null) {
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		} else if (pasos < 1 || pasos > 7) {
			throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
		}

		if (direccion.equals(Direccion.NORTE)) {
			try {
				setPosicion(new Posicion(posicion.getFila() + pasos , posicion.getColumna()));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}
		} else if (direccion.equals(Direccion.SUR)){
			try {
				setPosicion(new Posicion(posicion.getFila() - pasos , posicion.getColumna()));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}
		} else if (direccion.equals(Direccion.ESTE)){
			try {
				setPosicion(new Posicion(posicion.getFila() , (char)(posicion.getColumna() +pasos)));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}

		} else if (direccion.equals(Direccion.OESTE)){
			try {
				setPosicion(new Posicion(posicion.getFila() , (char)(posicion.getColumna() -pasos)));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}
		} else if (direccion.equals(Direccion.NORESTE)){
			try {
				setPosicion(new Posicion(posicion.getFila() + pasos, (char)(posicion.getColumna()  + pasos)));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}
		} else if (direccion.equals(Direccion.NOROESTE)){
			try {
				setPosicion(new Posicion(posicion.getFila() + pasos, (char)(posicion.getColumna()  - pasos)));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}
		} else if (direccion.equals(Direccion.SURESTE)){
			try {
				setPosicion(new Posicion(posicion.getFila() - pasos, (char)(posicion.getColumna()  + pasos)));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}
		} else if (direccion.equals(Direccion.SUROESTE)){
			try {
				setPosicion(new Posicion(posicion.getFila() - pasos, (char)(posicion.getColumna()  - pasos)));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}
		}
	}

	//Metodo to string
	@Override
	public String toString() {
		return "color=" + getColor() + ", posicion=(fila=" + posicion.getFila() + ", " + "columna=" + posicion.getColumna() +")";
	}
}



	