
public class Octagon implements Shape{
	private double side;
	
	public Octagon(double side) {
		this.side = side;
	}
	
	public double getArea() {
		 return (float)(2 * (1 + Math.sqrt(2))  
                 * side * side);
	}
	
	public double getPerimeter() {
		return 8 * side;
	}
}
