public abstract class ProductMenu {

    public abstract void ShowAddButtons();

    public abstract void ShowViewButtons();

    public abstract void ShowRadios();

    public abstract void showComboxes();

    public abstract void ShowLabels();

    public abstract void selectCourse(int userType);

    public void createCourseList() {
        System.out.println("Course List created ...");
    }

    public void AttachCourseToUser() {
        System.out.println("User Attached .... ");
    }

    public void courseOperation() {
        System.out.println("Operation performed on the course...");
    }

}
