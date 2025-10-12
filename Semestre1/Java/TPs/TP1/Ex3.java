public class Ex3 {
  public static void main(String[] args) {
    if (args.length > 1) {
      for (int i = 1; i < args.length; i++) {
        if (args[i].equals(args[0])) {

          System.out.println("Trouve");
          return;
        }
      }
      System.out.println("Non trouve");
    } else {
      System.out.println("Provide at least two arguments");
    }
  }
}
