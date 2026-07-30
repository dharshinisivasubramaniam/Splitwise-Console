package splitwise_console;

public class SplitwiseApp
{
    public static void main(String[] args)
    {
      System.out.println("=== Splitwise Console ===");
      System.out.println("Track shared expenses with friends.");
      System.out.println();
      System.out.println("Ready. More features coming in the next lessons.");
      String payerName = "Dharsh";
      double totalAmount=500.0;
      int numFriends=3;
        double perPersonShare = totalAmount / numFriends;
        String expenseLine = payerName + " Paid $" + totalAmount;
        String shareLine = "Each person pays: "+perPersonShare;
        System.out.println(expenseLine);
        System.out.println(shareLine);





      
    }
}

