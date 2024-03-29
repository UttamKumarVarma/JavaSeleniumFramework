package test;

import java.util.*;
public class UttamScaler {
    

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[1000];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		UttamScaler obj= new UttamScaler();	
		int[] output= obj.twoSum(arr,target);
		System.out.println(output[0]+" "+output[1]);
	}
	
public int[] twoSum(int[] nums, int target) {
	
	int[] output=new int[100];
	
	for(int i=0;i<nums.length;i++) {
		for(int j=i+1;j<nums.length;j++) {
			if(nums[i]+nums[j]==target) {
				output[0]=i;
				output[1]=j;
				break;
			}
		}
	}
	
        
	return output;
    }
}
