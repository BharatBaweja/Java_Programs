class Point3D extends Point2D{
	private float z = 0.f;
	Point3D(){
		z=0f;
	}
	Point3D(float x,float y,float z){
		super(x,y);
		this.z=z;
	}
	public float getZ(){
		return z;
	}
	public void setZ(float z){
		this.z=z;
	}
	public void setXYZ(float x,float y,float z){
		setX(x);
		setY(y);
		this.z=z;
	}	
	public float[] getXYZ(){
		float arr[] = new float[3];
		arr[0]=getX();
		arr[1]=getY();
		arr[2]=this.z;
		return arr;
	}
	public String toString(){
		return (getX()+","+getY()+","+z);
	}
}