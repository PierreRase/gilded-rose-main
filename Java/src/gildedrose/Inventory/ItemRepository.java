package gildedrose.Inventory;

import gildedrose.Item.Item;

import java.util.List;

public abstract class ItemRepository
{
    public abstract List<Item> getInventory();
    public abstract void saveInventory(List<Item> items);

    public abstract Item findItem(String searchedName, Integer searchedquality);
}
