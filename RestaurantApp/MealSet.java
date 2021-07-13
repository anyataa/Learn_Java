package RestaurantApp;

import java.util.List;

public class MealSet {
    private String menuName;
    private Double menuPrice;
    private String[] menuList;

    public MealSet(String menuName, Double menuPrice, String[] menuList) {
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.menuList = menuList;

        // Getter Setter

    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Double getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(Double menuPrice) {
        this.menuPrice = menuPrice;
    }

    public String[] getMenuList() {
        return menuList;
    }

    public void setMenuList(String[] menuList) {
        this.menuList = menuList;
    }

}
