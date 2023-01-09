package Projekti1;

public class OptimizationAlgorithm {
	public static int optimizedFirstMissingPositive(int[] nums) {
        int n = nums.length;
        // ragun i numrave te pare pozitiv eshte 1 deri në n+1 
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) nums[i] = n + 1;
        }
        
        // ky for loop bene numrat negativ ne indeksin e tyre origjinal
        for (int i = 0; i < n; i++) {
            // marrim numrat si indekse
            int index = Math.abs(nums[i]) - 1; 
            
            // bejme numrat negativ ne indekse
            if (index >= 0 && index < n && nums[index] > 0) {
                // number is available in array
                nums[index] = -1 * nums[index];
            }
        }
        
        // gjen nr e pare jonegativ e qe njekohesisht eshte numri i pare pozitiv qe mungon
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        
        // nese nuk ka numra jo negativ kthe n+1
        return n + 1;
    }

	public static void main(String[] args) {
		int x[] = {0,1,2,7,9};
		System.out.println(optimizedFirstMissingPositive(x));
	}

}
