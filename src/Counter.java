import java.security.InvalidParameterException;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
      try (Scanner terminal = new Scanner(System.in)) {
          int firstParameter = 0;
          int secondParameter = 0;
          try {
              System.out.println("Enter the First Parameter:");
              firstParameter = terminal.nextInt();
              System.out.println("Enter the Second Parameter:");
              secondParameter = terminal.nextInt();
          } 
          catch (Exception e) {
              System.out.println("Invalid input. Please enter integers only.");
              return;
          }

          try {
              System.out.println("Counting:");
              count(firstParameter, secondParameter);               
          } 
          catch (InvalidParameterException e) {
              System.out.println("The first parameter must be less than the second parameter");
          }
      }

           }   

    static void count (int firstParameter, int secondParameter) throws InvalidParameterException{
        if (firstParameter > secondParameter){
            throw new InvalidParameterException();
        }
        for (int i = firstParameter; i <= secondParameter; i++) {
            System.out.println(i);
        }
    }
    }

