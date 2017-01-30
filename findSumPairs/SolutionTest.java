// Problem 2
// Test cases for finding the sum pairs
// Rishabh Ananthan

package cardlytics_prob2;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import cardlytics_prob2.Solution;

public class SolutionTest extends Solution{

	int[] list;
	int target;
	
	@Test
	public void test1() {
		list = new int[]{1,2,3,4,5};
		target = 4;
		Assert.assertEquals("(3,1)",findSumPairs(list,target));
	}
	
	@Test
	public void test2() {
		list = new int[]{1,2,3,4,5};
		target = 5;
		Assert.assertEquals("(3,2)(4,1)",findSumPairs(list,target));
	}
	
	@Test
	public void test3() {
		list = new int[]{1,2,3,4,5};
		target = 6;
		Assert.assertEquals("(4,2)(5,1)",findSumPairs(list,target));
	}
	
	@Test
	public void test4() {
		list = new int[]{1,2,3,4,5};
		target = 12;
		Assert.assertEquals("",findSumPairs(list,target));
	}
	
	@Test
	public void test5() {
		list = new int[]{0,1,2,6,4,8,3,5,9,7};
		target = 12;
		Assert.assertEquals("(8,4)(9,3)(7,5)",findSumPairs(list,target));
	}
	
	@Test
	public void test6() {
		list = new int[]{0,1,2,6,4,8,3,5,9,7};
		target = 90;
		Assert.assertEquals("",findSumPairs(list,target));
	}
	
	@Test
	public void test7() {
		list = new int[]{0,1,-2,6,4,8,3,5,9,7};
		target = 7;
		Assert.assertEquals("(6,1)(3,4)(9,-2)(7,0)",findSumPairs(list,target));
	}
	
}
