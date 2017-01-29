import java.lang.reflect.*;
import java.util.Arrays;
public class TonyArraya{
  public static void main(String[] args){
    int[] someArray = new int[10];
    int length = someArray.length;
    // int length = someArray.length(); // won't compile - length is not a method
    // int length = someArray.size(); // No such method size()
    // int length = someArray.size; // No such variable size
    //someArray.length = (long)11; // Won't compile for two reasons
  }
}
