
public class Circleclass {
private double radius = 1;

	public Circleclass() {
		this.radius =0;
	}
	public Circleclass(double radius) {
	this.radius=radius;
}	
public double getradius() {
	return radius;
}
public void setradius(double radius) {
	this.radius=radius;
}
public double area(){
	return radius * radius * Math.PI;
}
}
