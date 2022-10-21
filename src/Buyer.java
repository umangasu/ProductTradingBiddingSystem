public class Buyer extends Person{

    Buyer() {
        super(productMenu);
    }

    Buyer(ProductMenu productMenu) {
        super(productMenu);
    }

    @Override
    public void ShowMenu() {
        System.out.println("Buyer Menu items ....");
    }

    @Override
    public ProductMenu createProductMenu() {
        String test = "Meat Products";
        if (test.equalsIgnoreCase("Meat Products")) {
            return new MeatProductMenu();
        } else {
            return new ProduceProductMenu();
        }
    }
}
