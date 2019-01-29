class Box{
	float width;
	float height;
	float depth;
	Box(){
		width=0f;
		height=0f;
		depth=0f;
	}
	Box(float width,float height,float depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	void setWidth(){
		this.width=width;
	}
	float getWidth(){
		return width;
	}
	void setDepth(){
		this.depth=depth;
	}
	float getDepth(){
		return depth;
	}
	void setHeight(){
		this.height=height;
	}
	float getHeight(){
		return height;
	}
	void DisplayVolume(){
		System.out.println("Volume is :" +(depth*height*width));
	}
}