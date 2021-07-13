package RestaurantApp;

public class Order {
    private String orderName;
    private Double orderPrice;
    private Integer orderQuantity;

    public Order(String orderName, Double orderPrice, Integer orderQuantity) {
        this.orderName = orderName;
        this.orderPrice = orderPrice;
        this.orderQuantity = orderQuantity;
    }

    // Set get
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

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

}
