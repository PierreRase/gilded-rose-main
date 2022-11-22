package gildedrose;

import java.util.ArrayList;

public class Shop
{
    public ArrayList<Item> Inventory;
    public Item currentItem;
    public Shop(ArrayList<Item> item)
    {
        this.Inventory = item;
    }

    public void updateItems()
    {
        currentItem = Inventory.get(1);
        Item.updateItem(currentItem);
    }
}
