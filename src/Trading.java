public class Trading extends Reminder {

    @Override
    public Reminder accept(NodeVisitor nodeVisitor) {
        System.out.println("Assignment Reminder ...");
        return nodeVisitor.visitTrading(this);
    }
}
