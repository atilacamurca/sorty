package sort;

/**
 *
 * @author atila
 */
public class QuickSort extends Sorter {

   public QuickSort(int size) {
      super(size);
   }

   public QuickSort(int size, Order order) {
      super(size, order);
   }

   public QuickSort(String filename) throws Exception {
      super(filename);
   }

   @Override
   public void sort() {
      int size = array.length;
      quicksort(0, size - 1);
   }

   private void quicksort(int low, int high) {
      int i = low, j = high;
      // middle list element
      int pivot = array[low + (high - low) / 2];
      
      while (i <= j) {
         
         while (array[i] < pivot) {
            i++;
         }
         
         while (array[j] > pivot) {
            j--;
         }
         
         if (i <= j) {
            swap(j, i);
            i++;
            j--;
         }
      }
      
      if (low < j) {
         quicksort(low, j);
      }
      
      if (i < high) {
         quicksort(i, high);
      }
   }
   
}
