public abstract class Order {
   
    public String menuName;
    public int qty;

    abstract void setMenu(String menuName);
    abstract void setQty(int qty);
}
