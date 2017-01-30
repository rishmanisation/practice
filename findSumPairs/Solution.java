// Problem 2
// Finding all pairs in a list that sum to the target.
// Rishabh Ananthan

package cardlytics_prob2;
import java.util.*;

public class Solution {
	
	public static String findSumPairs(int[] list, int target) {
		
		// Initialize a Hash set to store the numbers in the list and a string to store the pairs
		HashSet<Integer> hs = new HashSet<Integer>();
		String s = "";
		
		// We iterate through the list and look for occurrences of target - n in the hash set.
		// If target - n doesn't exist in the hash set, add the number from the list to the hash set.
		// Otherwise, add the pair to the string.
		for (int n : list) {
			if (hs.contains(target - n)) {
				s = s + "(" + n + "," + (target - n) + ")";
			}
			hs.add(n);
		}
		
		return s;
	}
}