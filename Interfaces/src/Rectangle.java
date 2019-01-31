class Rectangle extends Shape{
	float length;
	float width;
	Rectangle(){
		length=1.0f;
		width=1.0f;
	}
	Rectangle(float length,float width){
		this.length=length;
		this.width=width;
	}
	void display_area(){
		System.out.println("Area of Rectangle :"+(length*width));
	}
}