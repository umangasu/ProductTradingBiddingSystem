import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

public class ProductList extends Reminder{

    ArrayList<String> productList = new ArrayList<>();

    ProductList() {
        String productFileName = Utility.getFolderName() + "/ProductInfo.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(productFileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] singleProductInfo = line.split(":");
                productList.add(singleProductInfo[1]);
            }
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }
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
