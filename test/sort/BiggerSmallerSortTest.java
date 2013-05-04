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
public class BiggerSmallerSortTest {
   
   public BiggerSmallerSortTest() {
   }
   
   @BeforeClass
   public static void setUpClass() {
   }
   
   @AfterClass
   public static void tearDownClass() {
   }

   /**
    * Test of sort method, of class BiggerSmallerSort.
    */
   @Test
   public void testSort() {
      System.out.println("Bigger Smaller Sort: 10 elements in descending order.");
      BiggerSmallerSort instance = new BiggerSmallerSort(10, Order.desc);
      instance.sort();
      assertEquals("1 2 3 4 5 6 7 8 9 10 ", instance.toString());
      System.out.println(instance);
   }
}