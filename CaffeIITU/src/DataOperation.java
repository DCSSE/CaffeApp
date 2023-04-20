import java.io.Serializable;
import java.util.ArrayList;

public class DataOperation implements Serializable {
    private String operType;    // Lists or reserve
    private Orders order;
    private ArrayList<Orders> orders;

    public DataOperation(String operType, Orders order) {  // Sending info to server
        this.operType = operType;
        this.order = order;
    }

    public DataOperation(String operType) { // Listing all orders
        this.operType = operType;
    }

    public DataOperation(ArrayList<Orders> orders) {   // Sending back to clients
        this.orders = orders;
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public ArrayList<Orders> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Orders> orders) {
        this.orders = orders;
    }
}
