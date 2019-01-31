class ResizeableCircle extends Circle implements Resizable{
	ResizeableCircle(double radius){
		super(radius);
	}
	@Override
	public void resize(int percent){
		System.out.println((percent/100)*radius+radius);
	}
}