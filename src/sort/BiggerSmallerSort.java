package sort;

/**
 *
 * @author atila
 */
public class BiggerSmallerSort extends Sorter {

   public BiggerSmallerSort(int size) {
      super(size);
   }

   public BiggerSmallerSort(int size, Order order) {
      super(size, order);
   }

   public BiggerSmallerSort(String filename) throws Exception {
      super(filename);
   }

   public BiggerSmallerSort(int[] array) {
      super(array);
   }

   @Override
   public void sort() {
      int size = array.length;
      int ordLeft = 0, ordRight = size - 1;
      int bigger, smaller;
      for (int i = ordLeft; i < size / 2; i++) {
         
         bigger = i;
         smaller = i;
         for (int j = i + 1; j <= ordRight; j++) {
            // find bigger
            if (array[j] > array[bigger]) {
               bigger = j;
            }
            // find smaller
            if (array[j] < array[smaller]) {
               smaller = j;
            }
         }
         
         if (bigger != i) {
            swap(bigger, ordRight);
         }
         
         if (smaller != i) {
            swap(smaller, ordLeft);
         }
         
         ordLeft++;
         ordRight--;
         
         if (ordLeft == ordRight) {
            break;
         }
      }
   }
   
}
