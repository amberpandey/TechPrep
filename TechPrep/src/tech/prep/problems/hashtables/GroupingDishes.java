package tech.prep.problems.hashtables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public class GroupingDishes {
	static String[][] groupingDishes(String[][] dishes) {
		HashMap <String, ArrayList<String>> ingredients= new HashMap<String, ArrayList<String>>();
		int arraymax=1;
		for(int i=0; i<dishes.length;i++){
			int count=1;
			for(int j=1;j<dishes[i].length;j++){

				if(ingredients.containsKey(dishes[i][j])){
					count++;
					if(count>arraymax){
						arraymax=count;
					}
					ArrayList<String> addIng=ingredients.get(dishes[i][j]);
					addIng.add(dishes[i][0]);
					ingredients.put(dishes[i][j], addIng);
				}else{
					ArrayList<String> newIng=new ArrayList<String>();
					newIng.add(dishes[i][0]);
					ingredients.put(dishes[i][j],newIng);
				}
			}
		}
		ArrayList<ArrayList<String>> darray=new ArrayList<ArrayList<String>>();
		String returnArray[][]=new String[ingredients.size()][arraymax];
		 Iterator it = ingredients.entrySet().iterator();
		    while (it.hasNext()) {
		    	HashMap.Entry pair = (HashMap.Entry)it.next();
		    	ArrayList<String> sd=(ArrayList<String>)pair.getValue();
		    	Collections.sort(sd, new Comparator<String>() {    
			        @Override
			        public int compare(String o1, String o2) {
			            return o1.compareTo(o2);
			        }               
			});
		    	if(sd.size()>=2){
		    	sd.add(0,(String) pair.getKey());
		    	darray.add(sd);}
		    	
		    }
			Collections.sort(darray, new Comparator<ArrayList<String>>() {    
		        @Override
		        public int compare(ArrayList<String> o1, ArrayList<String> o2) {
		            return o1.get(0).compareTo(o2.get(0));
		        }               
		});
		String[][] res=new String[darray.size()][];
		for(int i=0;i<darray.size();i++){
			 res[i] = darray.get(i).toArray(new String[darray.get(i).size()]);
			System.out.println(darray.get(i));
		}

		return res;
	}

	public static void main(String args[]){
		String dishes[][] = {{"Salad", "Tomato", "Cucumber", "Salad", "Sauce"},
		            {"Pizza", "Tomato", "Sausage", "Sauce", "Dough"},
		            {"Quesadilla", "Chicken", "Cheese", "Sauce"},
		            {"Sandwich", "Salad", "Bread", "Tomato", "Cheese"}};
		groupingDishes(dishes);
		
	}
}
