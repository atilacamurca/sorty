package sort;

/**
 *
 * @author atila
 */
public class CountingSort extends Sort {

   private int maxValue;
   
   public CountingSort(int size, int maxValue) {
      super(size);
      this.maxValue = maxValue;
   }

   public CountingSort(int size, Order order, int maxValue) {
      super(size, order);
      this.maxValue = maxValue;
   }

   public CountingSort(String filename, int maxValue) throws Exception {
      super(filename);
      this.maxValue = maxValue;
   }

   @Override
   public void sort() {
      int count[] = new int[maxValue + 1];
      for (int i : array) {
         count[i]++;
      }
      
      int z = 0;
      for (int i = 0; i <= maxValue; i++) {
         while (count[i] > 0) {
            array[z] = i;
            z++;
            count[i]--;
         }
      }
   }
   
}
