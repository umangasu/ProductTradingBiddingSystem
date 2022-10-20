import java.util.ArrayList;
import java.util.Iterator;

public class ProductList extends Reminder{

    ArrayList<String> productList = new ArrayList<>();

    ProductList() {
        productList.add("Course CSE870");
        productList.add("Course CSE900");
        productList.add("Course CSE980");
    }


    public Iterator createIterator() {
        return this.productList.iterator();
    }


    @Override
    public Reminder accept(NodeVisitor nodeVisitor) {
        System.out.println("Product List Reminder ...");
        return nodeVisitor.visitProduct(this);
    }
}
