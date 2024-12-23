package bsu.rfe.java.group6.lab1.Serba.var6B;

import java.util.Arrays;

public class main_application {
	public static void main(String[] args) throws Exception {
		food[] breakfast = new food[20]; 
		int itemsSoFar = 0;
		for (String arg: args) {  
			String[] parts = arg.split("/"); 
			if (parts[0].equals("cheese")) {
				breakfast[itemsSoFar] = new cheese(); 
			}else
				if (parts[0].equals("apple")){
					breakfast[itemsSoFar] = new apple(parts[1]); 
			}
			if (parts[0].equals("coffee")){
				breakfast[itemsSoFar] = new coffee(parts[1]); 
		}
			itemsSoFar++; 
			
			Arrays.sort(breakfast, new foodcomparator()); 

		}
	
		
		
		int calories = 0;
		for(food item:breakfast) 
			if(item!=null) {
				calories += item.calculateCalories();
				item.consume();
			}
				else break;
		System.out.println(calories + " калорий ");
		System.out.println("Всего хорошего!");
		}

	}
	
