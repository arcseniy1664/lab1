package bsu.rfe.java.group6.lab1.Serba.var6B;

import java.util.Comparator;

public class foodcomparator implements Comparator<food> {

	public int compare(food arg0,food arg1) {
		if(arg0==null) return 1;
		if(arg0.calculateCalories()>arg1.calculateCalories())return 1;
		if(arg0.calculateCalories()<arg1.calculateCalories())return -1;
		else return arg0.getName().compareTo(arg1.getName()); 
	}
}
