import java.util.ArrayList;
public class Test{
  public static void main(String[] args){

    int[][] matrix = new int[3][];
    System.out.println("matrix[0]: " + matrix[0]);
    //int[] results = new int[3];
    int[] results = new int[]{10, 15, 12};
    if(results != null){
      int resultsLength = results.length;
      System.out.println("results.length: " + resultsLength);
      System.out.println("first index of results is 0");
      System.out.println("Max index of results is: " + (resultsLength-1) );
    }
    System.out.println("results[0]: " + results[0]);
    System.out.println("Looping through each element of results:");
    for(int i = 0; i<results.length; i++){
      System.out.println("results["+i+"]: " + results[i]);
    }
    for(int i : results){
      System.out.println(i);
    }
    String[] names = new String[3];
    System.out.println("names[0]: " + names[0]);
    boolean[] truthValues = new boolean[3];
    System.out.println("truthValues[0]: " + truthValues[0]);
  }
}
