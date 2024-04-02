package test;

import java.util.*;

public class UttamScaler {

	public static void main(String[] args) {

		List<List<Integer>> uttam = new ArrayList<List<Integer>>();

		
		int[] nums= {-1,0,1,2,-1,-4};
		
		for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                for(int k=0;k<nums.length;k++){
                    if(i !=j && i!=k && j!=k){
                    	
                    	if(i+j+k == 0) {
                    	List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        uttam.add(triplet);
                    	}
                    }
                }
            }
        }
		System.out.println(uttam);
	}

	public int[] twoSum(int[] nums, int target) {

		int[] output = new int[100];
		int i, j;
		for (i = 0; i < nums.length; i++) {
			for (j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					output[0] = i;
					output[1] = j;
					break;
				}
			}
		}

		return output;
	}
}
