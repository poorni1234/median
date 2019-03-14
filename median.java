public class MedianFinder {
    public static void main(String[] args) 
    {
      double[] values = { 1.2, 3, 4, 5, 8 };
      double median = median(values);
      System.out.println("Median is : " + median);
    }
   static double median(double[] values)
   {
    Median median = new Median();
     double evaluate = median.evaluate(values);
      return median;
    }
}
