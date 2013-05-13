/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import sort.BiggerSmallerSort;
import sort.BubbleSort;
import sort.CountingSort;
import sort.InsertionSort;
import sort.QuickSort;
import sort.SelectionSort;
import sort.Sorter;

/**
 *
 * @author atila
 */
public class RandomSort {

   private Sorter sorter;
   
   public RandomSort(int method, int size) throws Exception {
      
      String filename = String.format(Sorter.ARRAY_FILE, size);
      switch (method) {
         case 0:
            sorter = new BubbleSort(filename);
            break;
         case 1:
            sorter = new InsertionSort(filename);
            break;
         case 2:
            sorter = new SelectionSort(filename);
            break;
         case 3:
            sorter = new QuickSort(filename);
            break;
         case 4:
            sorter = new CountingSort(filename);
            break;
         case 5:
            sorter = new BiggerSmallerSort(filename);
            break;
         default:
            throw new Exception("algorithm not found.");
      }
      // finally sort elements...
      sorter.sort();
   }
}
