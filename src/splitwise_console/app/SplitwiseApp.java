package splitwise_console.app;

import java.util.Scanner;
import java.util.ArrayList;

import splitwise_console.model.ExpenseLine;
import splitwise_console.model.Friend;

public class SplitwiseApp
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

      System.out.println("=== Splitwise Console ===");
      System.out.println("Track shared expenses with friends.");
      System.out.println();
      System.out.println("Ready. More features coming in the next lessons.");
      ArrayList<Friend> friends = new ArrayList<>();
      boolean running = true;
      while (running)
      {
          System.out.println("=== Menu ===");
          System.out.println("1. Record expense");
          System.out.println("2. Add friend");
          System.out.println("3. List friends");
          System.out.println("0. Quit");
          System.out.print("Choice:");
          int choice = input.nextInt();
          input.nextLine();
          switch (choice)
          {
              case 1 -> recordExpense(input,friends);
              case 2 -> addFriend(input,friends);
              case 3 -> listFriends(friends);
              case 0 ->
              {
                  System.out.println("Good Bye!");
                  running = false;
              }
              default ->
              {
                  System.out.println("Invalid choice. Try again.");
              }
          }
      }
    }
    public static void addFriend(Scanner input, ArrayList<Friend> friends)
    {
        System.out.print("Friend name: ");
        String friendName = input.nextLine();
        Friend friend = new Friend(friendName);
        friends.add(friend);
        System.out.println(FriendDisplay.addedMessage(friend));
    }
    public static void listFriends(ArrayList<Friend> friends)
    {
        if (friends.isEmpty())
        {
            System.out.println("No friends yet. Add friends first (option 2).");
        } else
        {
            for (Friend friend : friends)
            {
                System.out.println(FriendDisplay.listLine(friend));
            }
        }
    }
    public static void recordExpense(Scanner input, ArrayList<Friend> friends)
    {
        System.out.print("Who paid? ");
        String payerName = input.nextLine();
        System.out.print("Total amount (Rs.)? ");
        double totalAmount = input.nextDouble();
        input.nextLine();
        ExpenseLine line = new ExpenseLine(payerName, totalAmount);
        int numFriends;
        if (friends.isEmpty())
        {
            System.out.println("No friends yet. Add friends first (option 2).");
            return;
        } else
        {
            numFriends = friends.size();
        }
        double perPersonShare = line.amount() / numFriends;
        String expenseLine = "%s paid Rs.%.2f".formatted(line.payerName(), line.amount());
        String shareLine = "Each person pays: %.2f".formatted(perPersonShare);
        System.out.println(expenseLine);
        System.out.println(shareLine);
    }


    private static class FriendDisplay
    {
        static String listLine(Friend friend)
        {
            return "- %d: %s".formatted(friend.getId(), friend.getName());
        }

        static String addedMessage(Friend friend)
        {
            return "Added %s (id %d).".formatted(friend.getName(), friend.getId());
        }
    }
}


