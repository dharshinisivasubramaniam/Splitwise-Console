package splitwise_console;

class Expense
{
    private final String payerName;
    private final double amount;
    Expense(String payerName, double amount)
    {
      this.payerName=payerName;
      this.amount=amount;
    }

    Expense(double amount)
    {
        this("Unknown", amount);
    }

    public String getPayerName()
    {
        return payerName;
    }

    public double getAmount()
    {
        return amount;
    }
}