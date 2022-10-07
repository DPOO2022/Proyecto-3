package modelo;

public class Delantero extends Jugador{

	public double calcularPuntaje() {
		this.puntos = 0;

		// Debemos poner si el jugador es cápitan del equipo de fantasia o no
		// Debemos tener en cuenta si el equipo del jugador gano el partido o no
		
		this.puntos = this.puntos + 4 * this.golesAnotados;
		this.puntos = this.puntos + 3 * this.asistencias;
		this.puntos = this.puntos + -2 * this.penaltisErrados;
		this.puntos = this.puntos + -1 * this.amarillas;
		this.puntos = this.puntos + -3 * this.rojas;
		this.puntos = this.puntos + -2 * this.autogoles;
		if(this.minutosJugados > 1 && this.minutosJugados <= 60) {
			this.puntos = this.puntos + 1;
		}
		if(this.minutosJugados > 60) {
			this.puntos = this.puntos + 2;
		}
		
		return this.puntos;
	}
	
}