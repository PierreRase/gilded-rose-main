package gildedrose.Shop;

import gildedrose.Item.Item;

import java.util.ArrayList;

public class Shop
{
    public ArrayList<Item> Inventory;
    public Shop(ArrayList<Item> item)
    {
        this.Inventory = item;
    }

    public void updateInventory()
    {
        for (int i=0; i<Inventory.size(); i++)
        {
            Inventory.get(i).update();
        }
    }
}
