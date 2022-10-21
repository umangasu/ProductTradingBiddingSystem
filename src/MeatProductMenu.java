public class MeatProductMenu extends ProductMenu {
    @Override
    public void ShowAddButtons() {

    }

    @Override
    public void ShowViewButtons() {

    }

    @Override
    public void ShowRadios() {

    }

    @Override
    public void showComboxes() {

    }

    @Override
    public void ShowLabels() {

    }

    @Override
    public void selectProduct(int userType) {
        System.out.println("Meat Products Selected ...\n Bridge Pattern for connection used");
        Person person;
        if (userType == 0) {
            person = PersonFactory.createObject("Buyer");

        } else
        {
            person = PersonFactory.createObject("Seller");

        }
        person.ShowMenu();
    }
}
