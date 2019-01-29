class Boxweight extends Box{
	float weight;
	Box b=new Box();
	Boxweight(){
		weight=0f;
	}
	Boxweight(float weight,float width,float height,float depth){
		super(width,height,depth);
		this.weight=weight;
	}
	void setWeight(){
		this.weight=weight;
	}
	float getWeight(){
		return weight;
	}
	void DisplayWeight(){
		System.out.println("Weight is :" +weight);
	}
}