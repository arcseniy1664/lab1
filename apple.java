package bsu.rfe.java.group6.lab1.Serba.var6B;

public class apple extends food{

	private String size;
	public apple(String size) {
		super("яблоко");
		this.size = size;
	}
	public void consume(){
		System.out.println(this + " съедено"); 
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " размера '" + size.toUpperCase() + "'";
	}
	public int calculateCalories() {
		int calories = 0;
		if(size.equals("small")) {
			calories += 52;
		}
		else 
			if(size.equals("midlle")){
				calories += 72;
			}
			else 
				if(size.equals("big")) {
					calories += 92;
				}
		return calories;
	}
}
