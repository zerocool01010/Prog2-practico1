package ej3;

public class PuntoGeometrico {
	private int X;
	private int Y;
	
	public PuntoGeometrico() {
		this(0);
	}
	public PuntoGeometrico(int x) {
		this(x, 0);
	}
	public PuntoGeometrico(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	//getters setters
	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}
}
