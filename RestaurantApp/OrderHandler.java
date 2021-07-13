package RestaurantApp;

import java.util.List;

public interface OrderHandler {

    public void generateReceipt(Double total, Double payment, List<String> orderList);
}
