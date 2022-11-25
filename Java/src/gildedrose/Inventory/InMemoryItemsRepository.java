package gildedrose.Inventory;

import gildedrose.Item.Item;

import java.util.List;

public class InMemoryItemsRepository extends ItemRepository
{
    @Override
    public List<Item> getInventory()
    {
        List<Item> items = null;
        return items;
    }

    @Override
    public void saveInventory(Item[] item)
    {

    }
}
