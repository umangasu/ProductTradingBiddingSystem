import java.util.Iterator;

public class TradingIterator extends ListIterator {
    @Override
    public boolean HasNext(Iterator iterator) {
        return iterator.hasNext();
    }

    @Override
    public void MoveToHead(Iterator iterator) {
        System.out.println("Head Moved ");
    }

    @Override
    public String Next(Iterator iterator) {
        if (this.HasNext(iterator)) {
            return (String) iterator.next();
        } else {
            return null;
        }
    }

    @Override
    public void Remove(Iterator iterator) {
        if (this.HasNext(iterator)) {
            iterator.next();
        }
    }
}
