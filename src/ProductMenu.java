public abstract class ProductMenu {

    public abstract void ShowAddButtons();

    public abstract void ShowViewButtons();

    public abstract void ShowRadios();

    public abstract void showComboxes();

    public abstract void ShowLabels();

    public abstract void selectProduct(int userType);

    public void createProductList() {
        System.out.println("Product List created ...");
    }

    public void attachProductToUser() {
        System.out.println("User Attached .... ");
    }

    public void productOperation() {
        System.out.println("Operation performed on the product...");
    }

}
