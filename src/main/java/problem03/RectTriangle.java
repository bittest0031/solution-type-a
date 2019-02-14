package problem03;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;		
	}

	public RectTriangle(int width, int height) {
		this( (double) width, (double) height );		
	}
	
	@Override
	public double getArea() {
		System.out.println("");
		return width * height * 1/2;
	}

	@Override
	public double getPerimeter() {
		return width + height + Math.sqrt(width*width + height*height);
	}
}
