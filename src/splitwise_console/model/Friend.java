package splitwise_console.model;

/**
 * A friend in the Splitwise group with a unique id and display name.
 */

public class Friend
{
    private static int lastId = 0;
    private final int id;
    private final String name;

    /**
     * Creates a new Friend object with a unique ID and the given name.
     *
     * @param name the name of the friend
     */

    public Friend(String name)
    {
        this.name = name;
        lastId++;
        this.id = lastId;
    }

    /**
     * Returns the unique ID of this friend.
     *
     * @return the friend's ID
     */
    public int getId()
    {
        return id;
    }

    /**
     * Returns the name of this friend.
     *
     * @return the friend's name
     */
    public String getName()
    {
        return this.name;
    }
}