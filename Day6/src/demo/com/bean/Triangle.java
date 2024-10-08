package demo.com.bean;

public class Triangle extends Shape {
	private int base,height,s1,s2;

	public Triangle(String color,int base, int height, int s1, int s2) {
		super(color);
		this.base = base;
		this.height = height;
		this.s1 = s1;
		this.s2 = s2;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getS1() {
		return s1;
	}

	public void setS1(int s1) {
		this.s1 = s1;
	}

	public int getS2() {
		return s2;
	}

	public void setS2(int s2) {
		this.s2 = s2;
	}
	public float calcArea() {
		return 0.5f*base*height;
	}
	public float calcPerimeter() {
		return s1+s2+base;
	}

	@Override
	public String toString() {
		return super.toString()+"Triangle [base=" + base + ", height=" + height + ", s1=" + s1 + ", s2=" + s2 + "]";
	}
	
	

}
