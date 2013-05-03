/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author atila
 */
public class CountingSortTest {
   
   public CountingSortTest() {
   }
   
   @BeforeClass
   public static void setUpClass() {
   }
   
   @AfterClass
   public static void tearDownClass() {
   }

   /**
    * Test of sort method, of class CountingSort.
    */
   @Test
   public void testSort() {
      System.out.println("Counting Sort: 10 elements in descending order.");
      CountingSort instance = new CountingSort(10, Order.desc, 10);
      instance.sort();
      assertEquals(instance.toString(), "1 2 3 4 5 6 7 8 9 10 ");
      System.out.println(instance);
   }
}