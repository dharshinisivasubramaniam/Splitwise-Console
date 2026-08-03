package splitwise_console.model;

/**
 * Represents one expense row containing the payer and the amount.
 *
 * @param payerName the name of the person who paid the expense
 * @param amount the expense amount paid by the person
 */
public record ExpenseLine(String payerName, double amount)
{

}