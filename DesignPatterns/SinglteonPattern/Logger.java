package DesignPatterns.SinglteonPattern;

public class Logger {
  private static Logger obj;
  private Logger(){
    System.out.println("created");
  }
  public static Logger getInstance() {
    if (obj == null) {
        obj = new Logger(); 
    }
    return obj;
}
  
}
 class Test {
  public static void main(String[] args) {
      Logger logger1 = Logger.getInstance();
      Logger logger2 = Logger.getInstance();

    


      if (logger1 == logger2) {
          System.out.println("Both logger instances are the same. Singleton verified!");
      } else {
          System.out.println("Different logger instances. Singleton failed!");
      }
  }
}

