class Square extends Shape{
	double side;
	double width;
	Square(){
	 side=1.0;
	}
	Square(double side){
		this.side=side;
	}
	Square(double side,String color,boolean filled){
		super(color,filled);
		this.side=side;
	}
	double getSide(){
		return side;
	}
	void setSide(double side){
		this.side=side;
	}
	void setWidth(double side){
		this.width=width;
	}
	void setLength(double side){
		this.side=side;
	}
	@Override
	public String toString(){
		return "Square";
	}
	double getArea(){
		return side*side;
	}
	double getPerimeter(){
		return 4*side;
	}
}