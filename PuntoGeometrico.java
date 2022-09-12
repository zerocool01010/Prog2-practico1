package ej3;

public class PuntoGeometrico {
	//attributes
	private int X;
	private int Y;
	//constructors
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
	//methods
	public void setDisplaceCoordenates(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	public double getEuclideanDistance(int x2, int y2) {
		double provCalcX = (this.X - x2)*(this.X - x2);
		double provCalcY = (this.Y - y2)*(this.Y - y2);
		double provCalc = provCalcX + provCalcY;
		double distance = Math.sqrt(provCalc);
		return distance;
	}
}
