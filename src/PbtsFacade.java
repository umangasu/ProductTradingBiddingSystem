import java.util.Iterator;
import java.util.Scanner;

public class PbtsFacade {
    int userType;
    String selectedProduct;

    public void startFacade() {
        System.out.println("Facade pattern initiated ");
        userType = login(new Login());
        System.out.println(
                "Select from available Course Menus \n 1. Meat Product Menu \n 2. Produce Product Menu ");
        Scanner scan = new Scanner(System.in);
        selectedProduct = scan.nextLine();
        // pattern implemented (Bridge implementation and Factory implementation
        if (selectedProduct.equalsIgnoreCase("Meat Product Menu")) {
            selectCourse(new MeatProductMenu(), userType);
        } else if (selectedProduct.equalsIgnoreCase("Produce Product Menu")) {
            selectCourse(new ProduceProductMenu(), userType);
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
        OfferingList offerings = new OfferingList();
        Iterator iterate2 = (Iterator) offerings.createIterator();
        OfferingIterator offeringIterator = new OfferingIterator();
        while (productIterator.HasNext(iterate)) {
            System.out.println(productIterator.Next(iterate));
            System.out.println(offeringIterator.Next(iterate2));
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

    public void selectCourse(ProductMenu productMenu, int UserType) {
        productMenu.selectCourse(UserType);
    }

}
