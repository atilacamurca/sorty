package app;

/**
 *
 * @author atila
 */
public class Main {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      try {
         
         if (args.length == 0) {
            help();
            System.exit(0);
         }
         
         switch (args[0]) {
            case "sort":
               int method = 99, size = 10;
               
               if (args.length > 1) {
                  method = Integer.parseInt(args[1]);
               }
               
               if (args.length > 2) {
                  size = Integer.parseInt(args[2]);
               }
               
               new RandomSort(method, size);
               break;
            case "chart":
               RenderChart chart = new RenderChart();
               chart.caller(args);
               break;
            default:
               System.out.println("action not found.");
               break;
         }
         
      } catch (Exception e) {
         System.out.println(e.getMessage());
         e.printStackTrace();
      }
   }

   private static void help() {
      System.out.println("sorty");
      System.out.println("SINTAXE");
      System.out.println("\tsorty action [size]");
      System.out.println("\taction: sort|chart\n");
      System.out.println("sort OPTIONS");
      System.out.println("\t* 0 - bubble sort");
      System.out.println("\t* 1 - insertion sort");
      System.out.println("\t* 2 - selection sort");
      System.out.println("\t* 3 - quick sort");
      System.out.println("\t* 4 - counting sort");
      System.out.println("\t* 5 - bigger smaller sort\n");
      System.out.println("size OPTIONS");
      System.out.println("\t10|100|1000|10000|100000");
   }
}
