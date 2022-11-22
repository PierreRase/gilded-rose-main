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
        for (int i=0; i<Inventory.size(); i++)
        {
            currentItem = Inventory.get(i);
            Item.updateItem(currentItem);
        }
    }
}
