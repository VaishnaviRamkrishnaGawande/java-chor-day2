package demo.com.bean;

public class Circle extends Shape{
      float radius;
      final float pi=3.14f;
      
	public Circle(String color,float radius) {
		super(color);
		this.radius = radius;
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float getPi() {
		return pi;
	}
	public float calcArea() {
		return pi*radius*radius;
	}
	public float calcPerimeter() {
		return 2*pi*radius;
	}
	@Override
	public String toString() {
		return super.toString()+"Circle [radius=" + radius + ", pi=" + pi + "]";
	}
	
}
