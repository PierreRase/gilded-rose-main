package gildedrose.Shop;

import gildedrose.Inventory.ItemRepository;
import gildedrose.Item.Item;

import java.io.IOException;
import java.util.List;

public class Shop
{
    private ItemRepository repositoryItem;
    public Shop(ItemRepository repository)
    {
        this.repositoryItem = repository;
    }

    public void updateInventory()
    {
        List<Item> items = this.repositoryItem.getInventory();
        for (Item item : items)
        {
            item.update();
        }
        this.repositoryItem.saveInventory(items);
    }
}
