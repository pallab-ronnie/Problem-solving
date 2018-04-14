package com.prep;

public class RemoveDuplicatesMoreThan2 {
	
	public static void main(String[] args) {
		RemoveDuplicatesMoreThan2 obj = new RemoveDuplicatesMoreThan2();
		int[] nums = {2,2,2,2,1,1,1,3,3,3,3,4,4,4,4,4,4,4,4,4};
		int length = obj.removeDuplicates(nums);
		//System.out.println(length);
	}
	
	public int removeDuplicates(int[] nums) {
		int length = nums.length;
		int count = 1;
		int j = 1;
		for(int i = 1;i<length ;i++) {
			if(nums[i-1] == nums[i]) {
				count++;
				if(count > 2)
					continue;
			}
			else {
				count = 1;
			}
			nums[j++] = nums[i];
		}
		for(int i=0;i<j;i++) {
			System.out.println(nums[i]);
		}
		return j;
	}
	
}
