class Circle extends Shape{
	final double PI =3.14;
	private double radius=1.0;
	Circle(){
		radius=1.0;
	}
	Circle(double radius,String color,boolean filled){
		super(color,filled);
		this.radius=radius;
	}
	double getRadius(){
		return radius;
	}
	void setRadius(double radius){
		this.radius=radius;
	}
	double getArea(){
		return PI*radius*radius;
	}
	double getPerimeter(){
		return 2*PI*radius;
	}
	@Override
	public String toString(){
		return "circle";
	}
}