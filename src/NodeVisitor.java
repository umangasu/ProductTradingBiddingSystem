public abstract class NodeVisitor {

    public abstract void visitFacade(PbtsFacade HF);

    public abstract Reminder visitProduct(ProductList productList);

    public abstract Reminder visitTrading(Trading trading);
}
