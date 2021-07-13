package RestaurantApp;

public class Order {
    private String orderName;
    private Double orderPrice;

    public Order(String orderName, Double orderPrice) {
        this.orderName = orderName;
        this.orderPrice = orderPrice;
    }

    // Setter Getter
    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

}
