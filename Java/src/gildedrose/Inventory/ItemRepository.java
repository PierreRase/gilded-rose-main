package gildedrose.Inventory;

import gildedrose.Item.Item;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public abstract class ItemRepository
{
    public abstract List<Item> getInventory() throws IOException;
    public abstract void saveInventory(Item[] item);
}
