public class Varargs{
  public static void main(String...args){
    // Varargs syntax makes args into an array of String:
    for(int i = 0; i<args.length; i++){
      System.out.println("args["+i+"]: " + args[i]);
    }
  }
}
