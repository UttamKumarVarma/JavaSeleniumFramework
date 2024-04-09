package test;

import java.util.*;

public class UttamScaler {

	public static void main(String[] args) {

		int[] prices = { 1,4,2};
		System.out.println("final value "+maxProfit(prices));

	}
	
	
	public static int maxProfit(int[] prices) {
	      List<Integer> pricesDuplicate = new ArrayList<Integer>();
			for (int x : prices) {
				pricesDuplicate.add(x);
			}

			int[] pricesOriginal = prices;
			List<Integer> finalList = new ArrayList<Integer>();
			int x, y, z = 0;
			Integer o=null;
			for (int i = 0; i < pricesDuplicate.size() - 1; i++) {
				x = Math.min(pricesDuplicate.get(i), pricesDuplicate.get(i + 1));
				y = Math.max(pricesDuplicate.get(i), pricesDuplicate.get(i + 1));
				pricesDuplicate.set(i, y);
				pricesDuplicate.set(i + 1, x);
			}
			x = pricesDuplicate.get(pricesDuplicate.size() - 1);
			System.out.println("Smallest Value is " + x);

			int finalData = x;

			for (int i = 0; i < pricesOriginal.length; i++) {
				if (pricesOriginal[i] == x) {
					z = i;
					break;
				}
			}

			if (z != pricesOriginal.length - 1) {

				for (int i = z + 1; i < pricesOriginal.length; i++) {
					finalList.add(pricesOriginal[i]);

				}

				
				if(finalList.size()==1 && finalList.get(0)>x) {
					System.out.println(1);
	                return 1;
				}
				else if(finalList.get(0)<x){
					System.out.println(0);
					return 0;
				}
				
				else {
				for (int i = 0; i < finalList.size() - 1; i++) {
					x = Math.max(finalList.get(i), finalList.get(i + 1));
					y = Math.min(finalList.get(i), finalList.get(i + 1));
					finalList.set(i, y);
					finalList.set(i + 1, x);
				}

				if (finalList.get(finalList.size() - 1) > finalData) {

					
					
					for(int i=0;i<prices.length;i++) {
						if(prices[i]==finalList.get(finalList.size() - 1)) {
							o=i+1;
							break;
						}
					}
					System.out.println(o);
	                return o;
					
				} else {
					System.out.println(0);
	                return 0;
				}
				
				}
				
				
			} else {
				System.out.println(0);
	            return 0;
			}
	        
	    }

}
