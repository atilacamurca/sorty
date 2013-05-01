package sort;

/**
 *
 * @author atila
 */
public class InsertionSort extends Sort {

   public InsertionSort(int size) {
      super(size);
   }

   public InsertionSort(int size, Order order) {
      super(size, order);
   }

   public InsertionSort(String filename) throws Exception {
      super(filename);
   }

   @Override
   public void sort() {
      int size = array.length;
      int j;
      for (int i = 1; i < size; i++) {
         j = i;
         while ( (j != 0)
                 && (array[j] < array[j - 1]) ) {
            swap( (j - 1), j );
            j--;
         }
      }
   }
   
}
