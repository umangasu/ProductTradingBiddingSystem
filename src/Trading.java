public class Trading extends Reminder {

    @Override
    public Reminder accept(NodeVisitor nodeVisitor) {
        System.out.println("Trading Reminder ...");
        return nodeVisitor.visitTrading(this);
    }
}
