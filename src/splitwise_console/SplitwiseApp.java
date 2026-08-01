package splitwise_console;

import java.util.Scanner;

public class SplitwiseApp
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

      System.out.println("=== Splitwise Console ===");
      System.out.println("Track shared expenses with friends.");
      System.out.println();
      System.out.println("Ready. More features coming in the next lessons.");
        System.out.print("Who paid? ");
        String payerName = input.nextLine();
        System.out.print("Total amount (Rs.)? ");
        double totalAmount = input.nextDouble();
      int numFriends=3;
        double perPersonShare = totalAmount / numFriends;
        String expenseLine = "%s paid Rs.%.2f".formatted(payerName, totalAmount);
        String shareLine = "Each person pays: %.2f".formatted(perPersonShare);
        System.out.println(expenseLine);
        System.out.println(shareLine);





      
    }
}

