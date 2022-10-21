public class Seller extends Person{

    Seller() {
        super(productMenu);
    }

     Seller(ProductMenu productMenu) {
        super(productMenu);
    }

    @Override
    public void ShowMenu() {
        System.out.println("Seller Menu items....");
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
