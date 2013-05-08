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
               int method = 0, size = 0;
               new RandomSort(method, size);
               break;
            case "chart":
               break;
            default:
               System.out.println("action not found.");
               break;
         }
         
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   private static void help() {
      System.out.println("sorty");
      System.out.println("SINTAXE");
      System.out.println("\tsorty action [parameters]");
      System.out.println("\taction: sort|chart");
   }
}
