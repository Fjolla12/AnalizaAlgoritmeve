package Projekti1;

import java.util.HashSet;

public class FirstAlgorithm {
	
	public static int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        int i = 1;
        int res = -1;
        while (true) {
            if (!set.contains(i)) {
                res = i;
                break;
            }
            i++;
        }
        
        return res;
    }

	public static void main(String[] args) {
		int x[] = {0,1,2,7,9};
		System.out.println(firstMissingPositive(x));

	}

}
