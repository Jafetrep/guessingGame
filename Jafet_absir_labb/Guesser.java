public class Guesser {
  private int low;
  private int high;

  
  public Guesser(int low, int high) {
      this.low = low;
      this.high = high;
  }

  
  public void start() {
      int i = 0; 
      int middle;
      while (low < high) {
          middle = (low + high) / 2; 

          System.out.println("Is the number less than or equal to " + middle + "?");
          String reply = getReply();

          if ("T".equals(reply)) {
              
              high = middle;
          } else {
              
              low = middle + 1;
          }
          i++; 
      }

      
      answer(low, i);
  }

  private String getReply() {
      String reply;
      do {
          System.out.print("reply T (true) or F (false): ");
          reply = new java.util.Scanner(System.in).nextLine().toUpperCase(); 
      } while (!"T".equals(reply) && !"F".equals(reply)); 

      return reply;
  }


  private void answer(int guess, int numberOfGuesses) {
      System.out.println("You were thinking about " + guess +
                         " (took me " + numberOfGuesses + " guesses)");
  }
}
