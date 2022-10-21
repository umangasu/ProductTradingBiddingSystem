public abstract class Person {
    protected static ProductMenu productMenu;

    public abstract void ShowMenu();

    public abstract ProductMenu createProductMenu();

    @SuppressWarnings("static-access")
    Person(ProductMenu productMenu) {
        this.productMenu = productMenu;
    }

    public void ShowAddButtons() {
        productMenu.ShowAddButtons();
    }

    public void shwViewButtons() {

        productMenu.ShowViewButtons();
    }

    public void showRadios() {
        productMenu.ShowRadios();
    }

    public void showCombos() {
        productMenu.showComboxes();
    }

    public void showLabels() {
        productMenu.ShowLabels();
    }


}
