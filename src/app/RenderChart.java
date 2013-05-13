/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.image.WritableImage;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import sort.Sorter;

/**
 * Referências:
 *    http://docs.oracle.com/javafx/2/charts/bar-chart.htm
 * @author atila
 */
public class RenderChart extends Application {
   
   private static final int ARRAY_SIZE = 6;
   private int initialAlg, finalAlg, initialSize, finalSize;

   private String[] data = new String[] {
      "Bubble", "Insertion", "Selection", "Quick", "Counting", "Bigger Smaller"
   };

   public RenderChart() {
      initialAlg = 0;
      finalAlg = data.length;
      
      initialSize = 0;
      finalSize = ARRAY_SIZE;
   }
   
   @Override
   public void start(Stage stage) throws Exception {
      params();
      
      stage.setTitle("Line Chart Sample");
      //defining the axes
      final CategoryAxis xAxis = new CategoryAxis();
      final NumberAxis yAxis = new NumberAxis();
      xAxis.setLabel("Valor de Entrada");
      yAxis.setLabel("Tempo em Segundos");
      //creating the chart
      final BarChart<String, Number> bc = new BarChart<>(xAxis, yAxis);

      bc.setTitle("Algoritmos de Ordenação");
      bc.setAnimated(false);

      Scene scene = new Scene(bc, 1200, 600);
      for (int i = initialAlg; i < finalAlg; i++) {
         bc.getData().add(getSeries(i));
      }

      stage.setScene(scene);
      stage.show();

      WritableImage snapshot = scene.snapshot(null);
      ImageIO.write(SwingFXUtils.fromFXImage(snapshot, null), "png", new File("chart-result-sort.png"));
   }
   
   public XYChart.Series getSeries(int algorithm) throws Exception {
      XYChart.Series series = new XYChart.Series();
      series.setName(data[algorithm]);
      for (int i = initialSize; i < finalSize; i++) {
         int size = (int) Math.pow(10, i + 1);
         System.out.println("alg: " + algorithm + ", size: " + size);
         String filename = String.format(Sorter.RESULT_FILE, algorithm, size);
         File f = new File(filename);
         if (f.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
               
               String line = reader.readLine();
               double n = 1, avg = 0;
               avg += Double.parseDouble(line);
               while (line != null) {
                  avg += Double.parseDouble(line);
                  n++;
                  line = reader.readLine();
               }
               
               series.getData().add(new XYChart.Data(String.valueOf(size), avg / n));
               
            } catch (Exception e) {
               throw e;
            }
         }
      }
      return series;
   }
   
   private void params() {
      Scanner sc = new Scanner(System.in).useDelimiter("\n");
      System.out.print("initial alg: ");
      initialAlg = sc.nextInt();
      System.out.print("final alg: ");
      finalAlg = sc.nextInt();
      System.out.print("initial size: ");
      initialSize = sc.nextInt();
      System.out.print("final size: ");
      finalSize = sc.nextInt();
   }
   
   public void caller(String[] args) {
      launch(args);
   }
}
