package foodmappackage;

import java.util.ArrayList;
import java.util.List;

public class Aliments {
	
	
	List<NutritionalTable> alimentos = new ArrayList<NutritionalTable>();
	
	
	public Aliments() {
		
		super();
		
		NutritionalTable whey = new NutritionalTable();
		whey.setCalcium(20);
		whey.setCarbohydrate(40);
		whey.setCalorie(200);
		whey.setName("whey");
		alimentos.add(whey);
		
		NutritionalTable aveia = new NutritionalTable();
		aveia.setCalcium(21);
		aveia.setCarbohydrate(41);
		aveia.setCalorie(201);
		aveia.setName("aveia");
		alimentos.add(aveia);
		
		NutritionalTable banana = new NutritionalTable();
		banana.setCalcium(22);
		banana.setCarbohydrate(42);
		banana.setCalorie(202);
		banana.setName("banana");
		alimentos.add(banana);
		
		NutritionalTable leite = new NutritionalTable();
		leite.setCalcium(23);
		leite.setCarbohydrate(43);
		leite.setCalorie(203);
		leite.setName("leite");
		alimentos.add(leite);
		
		
		alimentos.get(0).getCalcium();
		
		
	
		for(NutritionalTable item:alimentos) {
			
			System.out.println(item);
			
		}
		
		
		
		
		
		
	}
 	
	
	
	

}
