// Problem 1
// Test cases for finding fifth from last
// Rishabh Ananthan

//NOTE: Has been tested for int and String only. However, it should work with all data types.

package cardlytics_prob1;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
	MyLinkedList<Integer> mli1,mli2,mli3;
	MyLinkedList<String> mls1,mls2,mls3;
	
	@Test
	public void testint1() {
		mli1 = new MyLinkedList<Integer>();
		// mli1: 12 -> 10 -> 19 -> 1 -> 14
		mli1.addFront(10);
		mli1.addFront(12);
		mli1.addEnd(19);
		mli1.addEnd(1);
		mli1.addEnd(14);
		Assert.assertEquals("12",mli1.find5thFromLast(mli1.head));
	}
	
	@Test
	public void testint2() {
		mli2 = new MyLinkedList<Integer>();
		// mli2: 10 -> 19 -> 1
		mli2.addFront(10);
		mli2.addEnd(19);
		mli2.addEnd(1);
		Assert.assertEquals("FAIL",mli2.find5thFromLast(mli2.head));
	}
	
	@Test
	public void testint3() {
		mli3 = new MyLinkedList<Integer>();
		// mli3: 5 -> 12 -> 10 -> 19 -> 1 -> 14 -> 22
		mli3.addFront(10);
		mli3.addFront(12);
		mli3.addEnd(19);
		mli3.addEnd(1);
		mli3.addEnd(14);
		mli3.addEnd(22);
		mli3.addFront(5);
		Assert.assertEquals("10",mli3.find5thFromLast(mli3.head));
	}
	
	@Test
	public void teststr1() {
		mls1 = new MyLinkedList<String>();
		// mls1: Java -> Hello -> 19 -> Birthday Boy -> Foo
		mls1.addFront("Hello");
		mls1.addFront("Java");
		mls1.addEnd("19");
		mls1.addEnd("Birthday Boy");
		mls1.addEnd("Foo");
		Assert.assertEquals("Java",mls1.find5thFromLast(mls1.head));
	}
	
	@Test
	public void teststr2() {
		mls2 = new MyLinkedList<String>();
		// mls2: Hello -> 19 -> Birthday Boy 
		mls2.addFront("Hello");
		mls2.addEnd("19");
		mls2.addEnd("Birthday Boy");
		Assert.assertEquals("FAIL",mls2.find5thFromLast(mls2.head));
	}
	
	@Test
	public void teststr3() {
		mls3 = new MyLinkedList<String>();
		// mls1: Java -> Hello -> Birthday Boy -> 19 -> Foo -> Chocolate Cake -> Cardlytics
		mls3.addFront("Birthday Boy");
		mls3.addFront("Hello");
		mls3.addFront("Java");
		mls3.addEnd("19");
		mls3.addEnd("Foo");
		mls3.addEnd("Chocolate Cake");
		mls3.addEnd("Cardlytics");
		Assert.assertEquals("Birthday Boy",mls3.find5thFromLast(mls3.head));
	}
	
}
