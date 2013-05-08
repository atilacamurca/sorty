package sort;

/**
 *
 * @author atila
 */
public class SelectionSort extends Sorter {

   public SelectionSort(int size) {
      super(size);
   }

   public SelectionSort(int size, Order order) {
      super(size, order);
   }

   public SelectionSort(String filename) throws Exception {
      super(filename);
   }

   @Override
   public void sort() {
      int size = array.length, minIndex;
      for (int i = 0; i < size; i++) {
         minIndex = i;
         for (int j = i + 1; j < size; j++) {
            if (array[j] < array[minIndex]) {
               minIndex = j;
            }
         }
         
         if (minIndex != i) {
            swap(minIndex, i);
         }
      }
   }
   
}
