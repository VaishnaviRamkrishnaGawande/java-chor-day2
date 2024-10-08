package demo.com.bean;

public abstract class Shape {
    private String color;

	protected Shape(String color) {
		super();
		this.color = color;
	}
	protected Shape() {
		super();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	abstract public float calcPerimeter();

	abstract public float calcArea();
}