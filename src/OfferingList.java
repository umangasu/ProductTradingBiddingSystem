import java.util.ArrayList;
import java.util.Iterator;

public class OfferingList {

    ArrayList<String> offeringList = new ArrayList<>();

    OfferingList() {
        offeringList.add("Solution for CSE870");
        offeringList.add("Solution for CSE900");
        offeringList.add("Solution for CSE980");
    }

    public Iterator createIterator() {
        return this.offeringList.iterator();
    }
}
