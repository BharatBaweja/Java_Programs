class Circle implements GeometricObject{
	protected double radius = 1.0;
	final double PI= 3.14;
	Circle(double radius){
		this.radius=radius;
	}
	@Override
	public double getPerimeter(){
		return 2*PI*radius;
	}
	@Override
	public double getArea(){
		return PI*radius*radius;
	}
}