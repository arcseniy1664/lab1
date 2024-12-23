package bsu.rfe.java.group6.lab1.Serba.var6B;

public class cheese extends food{

	public cheese() {
     super("сыр");
	}
public void consume(){
	System.out.println(this + " съеден");
	}
public int calculateCalories() {
	int calories = 152;
	return calories;
	}	
}
