import java.util.Iterator;

public abstract class ListIterator {
    public abstract boolean HasNext(Iterator iterator);

    public abstract void MoveToHead(Iterator iterator);

    public abstract String Next(Iterator iterator);

    public abstract void Remove(Iterator iterator);

}