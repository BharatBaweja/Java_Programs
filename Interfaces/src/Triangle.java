class Triangle extends Shape{
	float base;
	float height;
	Triangle(){
		base=1.0f;
		height=1.0f;
	}
	Triangle(float base,float height){
		this.base=base;
		this.height=height;
	}
	void display_area(){
		System.out.println("Area of Triangle :"+(base*height/2));
	}
}