import java.util.Iterator;
import java.util.Scanner;

public class PbtsFacade {
    int userType;
    String selectedProduct;

    public void startFacade() {
        System.out.println("Facade pattern initiated ");
        userType = login(new Login());
        System.out.println(
                "Select from available Product Menus \n 1. Meat Product Menu \n 2. Produce Product Menu \n Enter choice as 1 or 2");
        Scanner scan = new Scanner(System.in);
        selectedProduct = scan.nextLine();
        // pattern implemented (Bridge implementation and Factory implementation
        if (selectedProduct.equalsIgnoreCase("1")) {
            selectProduct(new MeatProductMenu(), userType);
        } else if (selectedProduct.equalsIgnoreCase("2")) {
            selectProduct(new ProduceProductMenu(), userType);
        } else {
            System.out.println("Wrong Selection");
            System.exit(-1);
        }
        System.out.println("Implementing Visitor Pattern....");
        remind();
        System.out.println("Implementing Iterator pattern ....");
        ProductList products = new ProductList();
        Iterator iterate = (Iterator) products.createIterator();
        ProductIterator productIterator = new ProductIterator();
        TradingList tradings = new TradingList();
        System.out.println("Tradings by product .....");
        while (productIterator.HasNext(iterate)) {
            String productName = productIterator.Next(iterate);
            System.out.println(productName + ":");
            Iterator iterate2 = (Iterator) tradings.createIterator();
            TradingIterator tradingIterator = new TradingIterator();
            while (tradingIterator.HasNext(iterate2)) {
                String[] singleTradingInfo = tradingIterator.Next(iterate2).split(":");
                if(productName.equalsIgnoreCase(singleTradingInfo[1])) {
                    System.out.println(singleTradingInfo[0] + " traded " + singleTradingInfo[1]);
                }
            }
            System.out.println("\n");
        }
        scan.close();
    }

    public int login(Login object) {
        return object.login();
    }

    public void remind() {
        ReminderVisitor remind = new ReminderVisitor();
        ProductList productList = new ProductList();
        productList.accept(remind);

    }

    public void selectProduct(ProductMenu productMenu, int UserType) {
        productMenu.selectProduct(UserType);
    }

}
