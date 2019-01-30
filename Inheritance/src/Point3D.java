class Point3D extends Point2D{
	private float z = 0.f;
	Point3D(){
		x=0f;
		y=0f;
		z=0f;
	}
	Point3D(float x,float y,float z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public float getZ(){
		return z;
	}
	public void setZ(float z){
		this.z=z;
	}
	public void setXYZ(float x,float y,float z){
		this.x=x;
		this.y=y;
		ths.z=z;
	}	
	public float getXYZ(){
		float arr[] = new float[3];
		return arr[];
	}
	public String toString(){
		return (x+","+y+","+z);
	}
}