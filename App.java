import java.io.Console;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    boolean appRunning = true;

    while(appRunning == true){
      System.out.println("Enter a String");
      System.out.println();

      String userString = console.readLine();
      String[] userArray = userString.split("");
      List<String> list = Arrays.asList(userArray);
      Collections.reverse(list);

      userArray = (String[]) list.toArray();

      System.out.println();
      System.out.println("REVERSED");
      System.out.println("   IS   ");
      System.out.println();

      for(int i=0; i < userArray.length; i++){
        System.out.print(userArray[i]);
      }

      System.out.println();
      System.out.println("Would you like to 'retry' or 'exit'?");

      String statusRequest = console.readLine();
      if (statusRequest.equals("exit")){
        appRunning = false;
      } else if (statusRequest.equals("retry")){
        System.out.println();
        System.out.println("Okay let's play again");
        System.out.println();
      } else {
        System.out.println("I'm sorry, I did not understand that response.");
      }
    }

  }

}
