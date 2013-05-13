package sort;

/**
 *
 * @author atila
 */
public class CountingSort extends Sorter {

   private static final int MAXVALUE = 100;
   
   public CountingSort(int size) {
      super(size);
   }

   public CountingSort(int size, Order order) {
      super(size, order);
   }

   public CountingSort(String filename) throws Exception {
      super(filename);
   }

   @Override
   public void sort() {
      int count[] = new int[MAXVALUE + 1];
      for (int i : array) {
         count[i]++;
      }
      
      int z = 0;
      for (int i = 0; i <= MAXVALUE; i++) {
         while (count[i] > 0) {
            array[z] = i;
            z++;
            count[i]--;
         }
      }
   }
   
}
