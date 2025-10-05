package redAlumbrado;

import java.util.List;
import java.util.ArrayList;

public class Farola {

	private boolean encendida;
	private ArrayList<Farola> vecinas;
	/**
	 * Crear una farola. Debe inicializarla como apagada
	 */
	public Farola() {
		encendida = false;
		vecinas =  new ArrayList<Farola>();
	}

	/**
	 * Crea la relación de vecinos entre las farolas. La relación de vecinos entre
	 * las farolas es recíproca, es decir el receptor del mensaje será vecino de
	 * otraFarola, al igual que otraFarola también se convertirá en vecina del
	 * receptor del mensaje
	 */
	public void pairWithNeighbor(Farola otraFarola) {
		this.vecinas.add(otraFarola);
		otraFarola.vecinas.add(this);
	}

	/**
	 * Retorna sus farolas vecinas
	 */
	public List<Farola> getNeighbors() {
		
		return vecinas;
	}

	/**
	 * Si la farola no está encendida, la enciende y propaga la acción.
	 */
	public void turnOn() {
		if(this.isOff()) {
			this.encendida=true;
			this.vecinas.forEach(farola -> farola.turnOn());
		}

	}

	/**
	 * Si la farola no está apagada, la apaga y propaga la acción.
	 */
	public void turnOff() {
		if(this.isOn()) {
			this.encendida=false;
			this.vecinas.forEach(farola -> farola.turnOff());
		}

	}


	/**
	 * Retorna true si la farola está encendida.
	 */
	public boolean isOn() {
		return encendida;
	}

	/**
	 * Retorna true si la farola está apagada.
	 */
	public boolean isOff() {
		return !encendida;
	}
}
