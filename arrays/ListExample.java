import java.util.Arrays;
import java.util.List;
public class ListExample{

  public static void main(String[] args){
    printListAsUpperCase(Arrays.asList
                         (new String[]{"abba", "europe", "ace of base"})
                         );
    // Arrays.asList uses varargs syntax, so we can call it like this:
    printListAsUpperCase(Arrays.asList("apa", "bepa", "cepa", "depa"));
    // We can even call it like this:
    printListAsUpperCase(Arrays.asList()); //an empty int[]
    
    //printInts(1,2,3); // requries a real array of ints
  }
  
  public static void printListAsUpperCase(List<String> list){
    for(String elem : list){
      System.out.println(elem.toUpperCase());
    }
  }
  /* Requries a standard array reference */
  public static void printInts(int[] ints){
    for(int i : ints){
      System.out.println(i);
    }
  }
}
