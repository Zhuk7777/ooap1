public class Traveler {
    Transport way;

    public void set(Transport obj)
    {
        way=obj;

    }

    Traveler(Transport obj)
    {
        way=obj;
    }
    public void write()
    {
        way.getWay();
    }
}
