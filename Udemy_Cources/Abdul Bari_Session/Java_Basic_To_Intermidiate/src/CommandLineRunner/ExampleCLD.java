package CommandLineRunner;



class ExampleCLD {                                        // In CMD I check this output:
  static int x = 10;                                   // javac First.java
  static int y = 20;                                   // java First varun kumar k m
  public static void main(String[] args) {           // output is:
  System.out.println(x);                             // 10
  System.out.println(y);                             // 20
  System.out.println(args[0]);                       // varun
  System.out.println(args[1]);                       // kumar
  System.out.println(args[2]);                       // k
  } 
}

