package integerarraylist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CustomIntegerArrayListTest {

	@Test
	void testGetArrayList() {
		
		//create a new empty CustomIntegerArrayList
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(0, 5);
		arr1.add(1, 5);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(0, 5);
		lst1.add(1, 5);
		assertEquals(lst1, arr1.getArrayList());

		ArrayList<Integer> arr4Elements = new ArrayList<Integer>();
		arr4Elements.add(100);
		arr4Elements.add(200);
		arr4Elements.add(500);
		
		//create a new CustomIntegerArrayList with the elements in the given ArrayList
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList(arr4Elements);

		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(100);
		lst4.add(200);
		lst4.add(500);

		assertEquals(lst4, arr4.getArrayList());
		
		// TODO write at least 3 additional test cases
		//1.
		//create a new empty CustomIntegerArrayList
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(9);
		arr2.add(0, 7);
		arr2.add(1, 8);
			
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(9);
		lst2.add(0, 7);
		lst2.add(1, 8);
		
		assertEquals(lst2, arr2.getArrayList());

		ArrayList<Integer> arr24Elements = new ArrayList<Integer>();
		arr24Elements.add(50);
		arr24Elements.add(60);
		arr24Elements.add(70);
		
		//create a new CustomIntegerArrayList with the elements in the given ArrayList
		CustomIntegerArrayList arr24 = new CustomIntegerArrayList(arr24Elements);
		ArrayList<Integer> lst24 = new ArrayList<Integer>();
		lst24.add(50);
		lst24.add(60);
		lst24.add(70);
		
		assertEquals(lst24, arr24.getArrayList());
		
		//2.
		//create a new empty CustomIntegerArrayList
		CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
		arr3.add(10);
		arr3.add(0, 1);
		arr3.add(1, 3);
					
		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(10);
		lst3.add(0, 1);
		lst3.add(1, 3);
				
		assertEquals(lst3, arr3.getArrayList());

		ArrayList<Integer> arr34Elements = new ArrayList<Integer>();
		arr34Elements.add(10);
		arr34Elements.add(11);
		arr34Elements.add(12);
				
		//create a new CustomIntegerArrayList with the elements in the given ArrayList
		CustomIntegerArrayList arr34 = new CustomIntegerArrayList(arr34Elements);
		ArrayList<Integer> lst34 = new ArrayList<Integer>();
		lst34.add(10);
		lst34.add(11);
		lst34.add(12);
				
		assertEquals(lst34, arr34.getArrayList());
		
		//3.
		//create a new empty CustomIntegerArrayList
		CustomIntegerArrayList arr5 = new CustomIntegerArrayList();
		arr5.add(1);
		arr5.add(0, 0);
		arr5.add(1, 2);
							
		ArrayList<Integer> lst5 = new ArrayList<Integer>();
		lst5.add(1);
		lst5.add(0, 0);
		lst5.add(1, 2);
						
		assertEquals(lst5, arr5.getArrayList());

		ArrayList<Integer> arr54Elements = new ArrayList<Integer>();
		arr54Elements.add(0);
		arr54Elements.add(1);
		arr54Elements.add(2);
						
		//create a new CustomIntegerArrayList with the elements in the given ArrayList
		CustomIntegerArrayList arr54 = new CustomIntegerArrayList(arr54Elements);
		ArrayList<Integer> lst54 = new ArrayList<Integer>();
		lst54.add(0);
		lst54.add(1);
		lst54.add(2);
						
		assertEquals(lst54, arr54.getArrayList());

	}

	@Test
	void testGet() {
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(0, 5);
		arr1.add(1, 5);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(0, 5);
		lst1.add(1, 5);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// TODO write at least 3 additional test cases 
		//1.
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(3);
		arr2.add(0, 9);
		arr2.add(1, 6);
		
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(3);
		lst2.add(0, 9);
		lst2.add(1, 6);

		assertEquals(lst2.get(0), arr2.get(0));
		assertEquals(lst2.get(1), arr2.get(1));
		assertEquals(lst2.get(2), arr2.get(2));
		
		//2.
		CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
		arr3.add(4);
		arr3.add(0, 9);
		arr3.add(1, 6);
				
		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(4);
		lst3.add(0, 9);
		lst3.add(1, 6);

		assertEquals(lst3.get(0), arr3.get(0));
		assertEquals(lst3.get(1), arr3.get(1));
		assertEquals(lst3.get(2), arr3.get(2));
		
		//3.
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
		arr4.add(5);
		arr4.add(0, 9);
		arr4.add(1, 6);
						
		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(5);
		lst4.add(0, 9);
		lst4.add(1, 6);

		assertEquals(lst4.get(0), arr4.get(0));
		assertEquals(lst4.get(1), arr4.get(1));
		assertEquals(lst4.get(2), arr4.get(2));
		
	}

	@Test
	void testAddInt() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// TODO write at least 3 additional test cases 
		//1.
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(3);
		arr2.add(4);
		arr2.add(5);
		
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(3);
		lst2.add(4);
		lst2.add(5);

		assertEquals(lst2.get(0), arr2.get(0));
		assertEquals(lst2.get(1), arr2.get(1));
		assertEquals(lst2.get(2), arr2.get(2));
		
		//2.
		CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
		arr3.add(4);
		arr3.add(5);
		arr3.add(6);
				
		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(4);
		lst3.add(5);
		lst3.add(6);

		assertEquals(lst3.get(0), arr3.get(0));
		assertEquals(lst3.get(1), arr3.get(1));
		assertEquals(lst3.get(2), arr3.get(2));
		
		//3.
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
		arr4.add(5);
		arr4.add(6);
		arr4.add(7);
						
		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(5);
		lst4.add(6);
		lst4.add(7);

		assertEquals(lst4.get(0), arr4.get(0));
		assertEquals(lst4.get(1), arr4.get(1));
		assertEquals(lst4.get(2), arr4.get(2));
	}

	@Test
	void testAddIntInt() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 4);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// TODO write at least 3 additional test cases
		//1.
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(0, 1);
		arr2.add(0, 2);
		arr2.add(0, 3);
		
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(0, 1);
		lst2.add(0, 2);
		lst2.add(0, 3);

		assertEquals(lst2.get(0), arr2.get(0));
		assertEquals(lst2.get(1), arr2.get(1));
		assertEquals(lst2.get(2), arr2.get(2));
		
		//2.
		CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
		arr3.add(0, 5);
		arr3.add(0, 6);
		arr3.add(0, 7);
		
		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(0, 5);
		lst3.add(0, 6);
		lst3.add(0, 7);

		assertEquals(lst3.get(0), arr3.get(0));
		assertEquals(lst3.get(1), arr3.get(1));
		assertEquals(lst3.get(2), arr3.get(2));
		
		//3.
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
		arr4.add(0, 0);
		arr4.add(0, 1);
		arr4.add(0, 2);
		
		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(0, 0);
		lst4.add(0, 1);
		lst4.add(0, 2);

		assertEquals(lst4.get(0), arr4.get(0));
		assertEquals(lst4.get(1), arr4.get(1));
		assertEquals(lst4.get(2), arr4.get(2));
	}

	@Test
	void testRemoveInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 4);
		arr1.remove(0);
		arr1.remove(1);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);
		lst1.remove(0);
		lst1.remove(1);
		
		assertEquals(lst1.get(0), arr1.get(0));

		// TODO write at least 3 additional test cases
		//1.
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(0, 1);
		arr2.add(0, 1);
		arr2.add(0, 3);
		arr2.remove(0);
		arr2.remove(1);
		
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(0, 1);
		lst2.add(0, 1);
		lst2.add(0, 3);
		lst2.remove(0);
		lst2.remove(1);
		
		assertEquals(lst2.get(0), arr2.get(0));
		
		//2.
		CustomIntegerArrayList arr3= new CustomIntegerArrayList();
		arr3.add(0, 5);
		arr3.add(0, 4);
		arr3.add(0, 3);
		arr3.remove(0);
		arr3.remove(1);
		
		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(0, 5);
		lst3.add(0, 4);
		lst3.add(0, 3);
		lst3.remove(0);
		lst3.remove(1);
		
		assertEquals(lst3.get(0), arr3.get(0));
		
		//3.
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
		arr4.add(0, 10);
		arr4.add(0, 3);
		arr4.add(0, 4);
		arr4.remove(0);
		arr4.remove(1);
		
		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(0, 10);
		lst4.add(0, 3);
		lst4.add(0, 4);
		lst4.remove(0);
		lst4.remove(1);
		
		assertEquals(lst4.get(0), arr4.get(0));
	}

	@Test
	void testRemoveIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 4);
		arr1.remove(3, 3);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);

		assertEquals(lst1, arr1.getArrayList());

		// TODO write at least 3 additional test cases 
		//1.
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(0, 3);
		arr2.add(0, 4);
		arr2.add(0, 4);
		arr2.add(0, 4);
		arr2.add(0, 4);
		arr2.add(0, 5);
		arr2.remove(4, 4);
		
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(0, 3);
		lst2.add(0, 5);

		assertEquals(lst2, arr2.getArrayList());
		
		//2.
		CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
		arr3.add(0, 2);
		arr3.add(0, 3);
		arr3.add(0, 3);
		arr3.add(0, 7);
		arr3.add(0, 3);
		arr3.add(0, 7);
		arr3.remove(2, 7);
		
		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(0, 2);
		lst3.add(0, 3);
		lst3.add(0, 3);
		lst3.add(0, 3);

		assertEquals(lst3, arr3.getArrayList());
		
		//3.
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
		arr4.add(0, 2);
		arr4.add(0, 3);
		arr4.add(0, 3);
		arr4.add(0, 3);
		arr4.add(0, 3);
		arr4.add(0, 4);
		arr4.remove(4, 3);
		
		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(0, 2);
		lst4.add(0, 4);
		assertEquals(lst4, arr4.getArrayList());
	}

	@Test
	void testSpliceIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(3, 2);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// TODO write at least 3 additional test cases
		//1.
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(2);
		arr2.add(3);
		arr2.add(4);
		arr2.add(5);
		arr2.add(6);
		arr2.splice(2, 2);
		
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(2);
		lst2.add(3);
		lst2.add(6);

		assertEquals(lst2.get(0), arr2.get(0));
		assertEquals(lst2.get(1), arr2.get(1));
		assertEquals(lst2.get(2), arr2.get(2));
		
		//2.
		CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
		arr3.add(2);
		arr3.add(3);
		arr3.add(4);
		arr3.add(5);
		arr3.add(6);
		arr3.splice(3, 1);
		
		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(2);
		lst3.add(3);
		lst3.add(4);
		lst3.add(6);

		assertEquals(lst3.get(0), arr3.get(0));
		assertEquals(lst3.get(1), arr3.get(1));
		assertEquals(lst3.get(2), arr3.get(2));
		
		//3.
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
		arr4.add(2);
		arr4.add(3);
		arr4.add(4);
		arr4.add(5);
		arr4.add(6);
		arr4.splice(0, 2);
		
		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(4);
		lst4.add(5);
		lst4.add(6);

		assertEquals(lst4.get(0), arr4.get(0));
		assertEquals(lst4.get(1), arr4.get(1));
		assertEquals(lst4.get(2), arr4.get(2));
	}

	@Test
	void testSpliceIntIntIntArray() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(3, 1, new int[] { 4, 5 });
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);
		lst1.add(4);
		lst1.add(5);
		lst1.add(6);
		
		assertEquals(lst1, arr1.getArrayList());

		// TODO write at least 3 additional test cases 
		//1.
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(2);
		arr2.add(3);
		arr2.add(4);
		arr2.add(5);
		arr2.add(6);
		arr2.splice(1, 2, new int[] { 5, 5 });
		
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(2);
		lst2.add(5);
		lst2.add(5);
		lst2.add(5);
		lst2.add(6);
		
		assertEquals(lst2, arr2.getArrayList());
		
		//2.
		CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
		arr3.add(2);
		arr3.add(3);
		arr3.add(4);
		arr3.add(5);
		arr3.add(6);
		arr3.splice(3, 2, new int[] { 0, 1 });
		
		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(2);
		lst3.add(3);
		lst3.add(4);
		lst3.add(0);
		lst3.add(1);
		
		assertEquals(lst3, arr3.getArrayList());
		
		//3.
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
		arr4.add(2);
		arr4.add(3);
		arr4.add(4);
		arr4.add(5);
		arr4.add(6);
		arr4.splice(2, 1, new int[] { 4, 5 });
		
		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(2);
		lst4.add(3);
		lst4.add(4);
		lst4.add(5);
		lst4.add(5);
		lst4.add(6);
		
		assertEquals(lst4, arr4.getArrayList());
	}

}
