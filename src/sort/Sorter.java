package sort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author atila
 */
public abstract class Sorter {
   
   public static final String ARRAY_FILE = "files/array-file-%d.txt";
   public static final String RESULT_FILE = "results/%d-%d.txt";
   
   protected int[] array;
   
   public Sorter(int size) {
      init(size, Order.asc);
   }
   
   public Sorter(int size, Order order) {
      init(size, order);
   }
   
   public Sorter(String filename) throws Exception {
      try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
         String line = reader.readLine();
         int size = Integer.parseInt(line);
         int i = 0, value;
         array = new int[size];
         
         line = reader.readLine();
         while (line != null) {
            value = Integer.parseInt(line);
            array[i++] = value;
            line = reader.readLine();
         }
      } catch (Exception e) {
         throw e;
      }
   }
   
   public Sorter(int array[]) {
      this.array = array;
   }
   
   private void init(int size, Order order) {
      array = new int[size];
      switch (order) {
         case asc:
            for (int i = 1; i <= array.length; i++) {
               array[i - 1] = i;
            }
            break;
         case desc:
            for (int i = size, j = 1; i > 0; i--, j++) {
               array[i - 1] = j;
            }
            break;
         default:
            throw new AssertionError();
      }
   }
   
   public abstract void sort();
   
   protected void swap(int pos1, int pos2) {
      int aux = array[pos2];
      array[pos2] = array[pos1];
      array[pos1] = aux;
   }
   
   @Override
   public String toString() {
      StringBuilder builder = new StringBuilder();
      for (int i = 0; i < array.length; i++) {
         builder.append(array[i]);
         builder.append(" ");
      }
      return builder.toString();
   }
}
