package com.j2.wk12.koreamenu;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;
 
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
    
        addItem("컵 팬케이크", 
                "스크램블 계란과 팬케이크입니다.", true, 2.99);
        addItem("아침용 팬케이크", 
                "설탕쳐서 맛있습니다.", false, 2.99);
        addItem("블루베리 팬케이크",
                "블루베리로 만든 팬케이크입니다.", true, 3.49);
        
    }
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    public ArrayList getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
    public String toString() {
        return "Objectville Pancake House Menu";
    }

}