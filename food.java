package bsu.rfe.java.group6.lab1.Serba.var6B;

public abstract class food implements consumable,nutritious {

	String name = null;
	public food(String name) {
		this.name = name;  
		} 
	public boolean equals(Object arg0) {
		if(!(arg0 instanceof food)) return false; 
		if (name==null || ((food)arg0).name==null) return false;
		return name.equals(((food)arg0).name); 
		
	}
	public String toString() {
		return name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) { 
		this.name = name; 
	}
}
