package com.liutao.iterator;

public class Menus {
    public static MenuComponent getMenuComponent(){
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU","Lunch");
        MenuComponent cafeMenu = new Menu("CAFE HOUSE MENU","Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of course");

        MenuComponent allMenus = new Menu("ALL MENUS","All mmenus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        dinerMenu.add(dessertMenu);

        dinerMenu.add(new MenuItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato", true, 2.99));
        dinerMenu.add(new MenuItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29));
        dinerMenu.add(new MenuItem("Hot Dog",
                "a hot dog, with saurkraut, relish with cheese", false, 3.05));
        dinerMenu.add(new MenuItem("BLT",
                "Bacon with lettuce & tomato", false, 2.99));
        dessertMenu.add(new MenuItem("Chocolate mousse",
                "巧克力慕斯",false,2.6));
        dessertMenu.add(new MenuItem("Strawberry Muffin",
                "草莓松糕",false,2.3));
        dessertMenu.add(new MenuItem("Fresh fruit tart",
                "水果蛋挞",false,2.8));
        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs,and toast",
                true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs,and sausage",
                false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancake",
                "Pancakes made with fried blueberries",
                true, 3.99));
        pancakeHouseMenu.add(new MenuItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true, 3.59));
        cafeMenu.add(new MenuItem("MatchaLatte",
                "抹茶拿铁", true, 2.99));
        cafeMenu.add(new MenuItem("cappuccino",
                "卡布奇诺", false, 2.99));
        cafeMenu.add(new MenuItem("espresso",
                "浓缩咖啡", false, 3.29));
        cafeMenu.add(new MenuItem("VanillaCoffee",
                "香草咖啡", false, 3.05));
        return allMenus;
    }
}
