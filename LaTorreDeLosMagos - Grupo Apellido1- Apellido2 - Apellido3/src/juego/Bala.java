package juego;
import java.awt.Image;

import entorno.Entorno;

public class Bala {
	private double x;
	private double y;
	private double velocidad;
	private double angulo;
	private int tama�o;	
	private Image BalaDeHielo;
	
	Bala(double x, double y,double angulo)
	{
		this.x = x;
		this.y = y;
		this.velocidad = 7;
		this.angulo = angulo;
		this.tama�o = 10;
		this.BalaDeHielo = entorno.Herramientas.cargarImagen("BalaDeHielo.png");
	}

	
	void dibujarBala(Entorno entorno) 
	{
//		 entorno.dibujarCirculo(this.x, this.y, this.tama�o, Color.RED);
		entorno.dibujarImagen(this.BalaDeHielo,this.x, this.y, this.angulo, 0.2);
	}
	
	void desplazarBala()
	{
		this.x+=   Math.cos(this.angulo)* this.velocidad;
		this.y+=  Math.sin(this.angulo)* this.velocidad;
	}
	
	double perfilIzquierdo() {
		
		return this.x - (this.tama�o/2);
	}
	
	double perfilDerecho() {
		
		return this.x + (this.tama�o/2);
	}
	
	double perfilInferior() {
		
		return this.y + (this.tama�o/2);
	}
	
	double perfilSuperior() {
		
		return this.y - (this.tama�o/2);
	}
	
	public int getTama�o() {
		return tama�o;
	}

	double getX()
	{
		return this.x;
	}
	
	double getY()
	{
		return this.y;
	}
	
}
