package gildedrose.Shop;

import gildedrose.Inventory.InMemoryItemsRepository;
import gildedrose.Inventory.ItemRepository;
import gildedrose.Item.Item;

import java.util.List;

public class ShopView {

    private Shop shop;
    ItemRepository inventory;

    public void ShowInventory() {
        inventory = new InMemoryItemsRepository();
        shop = new Shop(inventory);
        List<Item> items = inventory.getInventory();
        System.out.println(items.get(0));
    }

    public static void main(String[] args) {}

}
