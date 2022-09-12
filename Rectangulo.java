package ej3;

public class Rectangulo {
	private PuntoGeometrico vertice1;
	private PuntoGeometrico vertice2;
	private PuntoGeometrico vertice3;
	private PuntoGeometrico vertice4;
	
	//CONSTRUCTORES
	public Rectangulo() {    //constructor por default
		this(new PuntoGeometrico(1,1), new PuntoGeometrico(4,1), new PuntoGeometrico(1,4), new PuntoGeometrico(4,4));
	}
	public Rectangulo(PuntoGeometrico vertice1, PuntoGeometrico vertice2, PuntoGeometrico vertice3, PuntoGeometrico vertice4) {
		this.setVertice1(vertice1);
		this.setVertice2(vertice2);
		this.setVertice3(vertice3);
		this.setVertice4(vertice4);
	}
	
	//SETTERS
	public void setVertice1(PuntoGeometrico vertice1) {
		this.vertice1 = vertice1;
	}
	public void setVertice2(PuntoGeometrico vertice2) {
		this.vertice2 = vertice2;
	}
	public void setVertice3(PuntoGeometrico vertice3) {
		this.vertice3 = vertice3;
	}
	public void setVertice4(PuntoGeometrico vertice4) {
		this.vertice4 = vertice4;
	}
	
	//MÉTODOS
	public void desplazarRectangulo(PuntoGeometrico vertice1, PuntoGeometrico vertice2, PuntoGeometrico vertice3, PuntoGeometrico vertice4) {
		this.setVertice1(vertice1);
		this.setVertice2(vertice2);
		this.setVertice3(vertice3);
		this.setVertice4(vertice4);
	}
	
	public int getBase() {
		return this.vertice2.getX() - this.vertice1.getX();
	}
	
	public int getAltura() {
		return this.vertice3.getY() - this.vertice1.getY();
	}
	
	public int calcularArea() {
		return this.getBase() * this.getAltura();
	}
	
	public int compararRectangulos(Rectangulo r2) {
		int area1 = this.calcularArea();
		int area2 = r2.calcularArea();
		
		//if (area1 > area2) {
		//	return 1;
		//} else if (area1 == area2) {
		//	return 0;
		//} else {
		//	return -1;
		//}               //el return de abajo es una versión resumida del if!
		
		return (area1 > area2) ? 1 : (area1 == area2) ? 0 : -1;
	}
	
	public boolean esCuadrado() {
		return this.getBase() == this.getAltura();
	}
	
	public String getLadoSuperior() {
		if (this.getBase() > this.getAltura()) {
			return "El lado superior es la base y mide "+this.getBase()+".";
		} else if (this.getBase() == this.getAltura()) {
			return "Todos los lados son iguales y miden "+this.getBase()+".";
		} else {
			return "El lado superior es la altura y mide "+this.getAltura()+".";
		}
	}
	
	public String estaAcostadoOParado() {
		if (this.getBase() > this.getAltura()) {
			return "El rectángulo está acostado";
		} else if (this.getBase() == this.getAltura()) {
			return "El rectángulo es en verdad un cuadrado";
		} else {
			return "El rectángulo está parado";
		}
	}
}
