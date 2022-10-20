public class ReminderVisitor extends NodeVisitor {
    String m_Reminder;

    @Override
    public void visitFacade(PbtsFacade HF) {
        System.out.println("visiting Facade ....");
    }

    @Override
    public Reminder visitProduct(ProductList productList) {
        System.out.println("Visiting Product ....");
        return productList;
    }

    @Override
    public Reminder visitTrading(Trading trading) {
        System.out.println("Visiting Trading ....");
        return trading;
    }
}
