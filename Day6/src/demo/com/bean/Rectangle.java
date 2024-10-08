package demo.com.bean;

public class Rectangle extends Shape{
	private int length,breadth;

	public Rectangle(String color,int length, int breadth) {
		super(color);
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public float calcArea() {
		return length*breadth;
	}
	public float calcPerimeter() {
		return 2*(length+breadth);
	}

	@Override
	public String toString() {
		return super.toString()+ "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
	
	

}
 