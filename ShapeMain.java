
public class ShapeMain {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Octagon(5);
		shapes[1] = new Octagon(10);
		shapes[2] = new Octagon(20);
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("area =" + shapes[i].getArea() +
					", perimeter =" + 
					shapes[i].getPerimeter());
		}
	}

}
