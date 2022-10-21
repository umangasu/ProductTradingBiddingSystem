import java.util.ArrayList;
import java.util.Iterator;

public class OfferingList {

    ArrayList<String> offeringList = new ArrayList<>();

    OfferingList() {
    }

    public Iterator createIterator() {
        return this.offeringList.iterator();
    }
}
