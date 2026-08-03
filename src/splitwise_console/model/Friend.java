package splitwise_console.model;

public class Friend
{
    private static int lastId = 0;
    private final int id;
    private final String name;

    public Friend(String name)
    {
        this.name = name;
        lastId++;
        this.id = lastId;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return this.name;
    }
}