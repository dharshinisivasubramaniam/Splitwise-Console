package splitwise_console;

import java.util.Scanner;

import java.util.ArrayList;

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
        friends.add(new Friend(friendName));
        System.out.println("Added " + friendName + ".");
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
                System.out.println("- "+friend.getName());
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
        int numFriends;
        if (friends.isEmpty())
        {
            System.out.println("No friends yet. Add friends first (option 2).");
            return;
        } else
        {
            numFriends = friends.size();
        }
        double perPersonShare = totalAmount / numFriends;
        String expenseLine = "%s paid Rs.%.2f".formatted(payerName, totalAmount);
        String shareLine = "Each person pays: %.2f".formatted(perPersonShare);
        System.out.println(expenseLine);
        System.out.println(shareLine);
    }
}

