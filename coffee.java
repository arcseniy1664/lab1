package bsu.rfe.java.group6.lab1.Serba.var6B;

public class coffee extends food implements nutritious{
	private String aroma;
	public coffee(String aroma) {
		super("кофе");
		this.aroma = aroma;
	}

	
	public void consume() {
				System.out.println(this + "выпит");
	}


	public String getAroma() {
		return aroma;
	}


	public void setAroma(String aroma) {
		this.aroma = aroma;
	}
	public boolean equals(Object arg0) {
		if(super.equals(arg0)) {
			if(!(arg0 instanceof coffee)) return false;
			return aroma.equals(((coffee)arg0).aroma);
		}else
			return false;
	}
public String toString() {
	return super.toString() + " ароматa '" + aroma.toUpperCase()+ "'";
	}
public int calculateCalories() {
	int calories = 0;
	if(aroma.equals("intense")) {
		calories += 52;
	}
	else 
		if(aroma.equals("bitter")){
			calories += 1000;
		}
		else 
			if(aroma.equals("eastern")) {
				calories += 92;
			}
	return calories;
}
}
