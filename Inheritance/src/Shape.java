class Shape{
	private String color="red";
	private boolean filled=true;
	Shape(){
		color="red";
		filled=true;
	}
	Shape(String color,boolean filled){
		this.color=color;
		this.filled=filled;
	}
	String getColor(){
		return color;
	}
	void setColor(String color){
		this.color=color;
	}
	boolean isFilled(){
		return filled;
	}
	void setFilled(boolean filled){
		this.filled=filled;
	}
	@Override
	public String toString(){
		return "Shape";
	}
	public static void main(String args[]){
		Circle c = new Circle(5,"blue",true);
		c.toString();
		System.out.println("Area of circle is :"+c.getArea());
		System.out.println("Perimeter of circle is :" +c.getPerimeter());
		Rectangle r = new Rectangle(5.1,6,"red",true);
		r.toString();
		System.out.println("Area of Rectangle is :"+r.getArea());
		System.out.println("Perimeter of Rectangle is :" +r.getPerimeter());
		Square s = new Square(56,"white",false);
		s.toString();
		System.out.println("Area of Square is :"+s.getArea());
		System.out.println("Perimeter of Square is :" +s.getPerimeter());

	}
}