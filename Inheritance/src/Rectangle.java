class Rectangle extends Shape{
	private double width=1.0;
	private double length=1.0;
	Rectangle(){
		width=1.0;
		length=1.0;
	}
	Rectangle(double width,double length,String color,boolean filled){
		super(color,filled);
		this.width=width;
		this.length=length;
	}
	double getWidth(){
		return width;
	}
	void setWidth(double width){
		this.width=width;
	}
	double getLength(){
		return length;
	}
	void setLength(double length){
		this.length=length;
	}
	double getArea(){
		return length*width;
	}
	double getPerimeter(){
		return (length+width)*2;
	}
	@Override
	public String toString(){
		return "Rectangle";
	}
}