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
            selectCourse(new MeatProductMenu(), userType);
        } else if (selectedProduct.equalsIgnoreCase("2")) {
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
        TradingList tradings = new TradingList();
        while (productIterator.HasNext(iterate)) {
            System.out.println(productIterator.Next(iterate));
            Iterator iterate2 = (Iterator) tradings.createIterator();
            TradingIterator tradingIterator = new TradingIterator();
            while (tradingIterator.HasNext(iterate)) {
                String[] singleTradingInfo = tradingIterator.Next(iterate2).split(":");
                if(productIterator.Next(iterate).equalsIgnoreCase(singleTradingInfo[1])) {
                    System.out.println(singleTradingInfo[0] + " traded " + singleTradingInfo[1]);
                }
            }

        }
        scan.close();
    }

    public int login(Login object) {
        return object.login();
    }


//    public void addTrading(AssignmentMenu AM) {
//        AM.AddAssignment();
//    }
//
//    public void viewTrading(AssignmentMenu VM) {
//        VM.ViewAssignment();
//    }
//
//    public void viewOffering(SolutionMenu SM) {
//        SM.gradeSolution();
//    }
//
//    public void markOffering(SolutionMenu SM) {
//        SM.reportSolution();
//    }
//
//    public void submitOffering(SolutionMenu SM) {
//        SM.submitSolution();
//    }

    public void remind() {
        ReminderVisitor remind = new ReminderVisitor();
        ProductList productList = new ProductList();
        productList.accept(remind);

    }

    public void selectCourse(ProductMenu productMenu, int UserType) {
        productMenu.selectProduct(UserType);
    }

}
