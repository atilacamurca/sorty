package sort;

/**
 *
 * @author atila
 */
public class BubbleSort extends Sorter {

   public BubbleSort(int size) {
      super(size);
   }

   public BubbleSort(int size, Order order) {
      super(size, order);
   }

   public BubbleSort(String filename) throws Exception {
      super(filename);
   }
   
   @Override
   public void sort() {
      int size = array.length;
      for (int i = 0; i < size; i++) {
         for (int j = 1; j < (size - i); j++) {
            if (array[j - 1] > array[j]) {
               swap( j, (j - 1) );
            }
         }
      }
   }
   
}
