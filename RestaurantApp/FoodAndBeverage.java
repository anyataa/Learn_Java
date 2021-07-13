package RestaurantApp;

public class FoodAndBeverage {
    private String foodName;
    private Double foodPrice;

    public FoodAndBeverage(String foodName, Double foodPrice) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    // Getter and Setter
    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }

}
