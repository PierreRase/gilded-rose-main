package gildedrose.Inventory;

import gildedrose.Item.*;

import java.util.ArrayList;
import java.util.List;

public class InMemoryItemsRepository extends ItemRepository
{
    List<Item> items;

    public InMemoryItemsRepository()
    {
        items = new ArrayList<Item>();
        items.add(new GenericItem("Sword", 5, 25));
        items.add(new GenericItem("Shield", 5, 25));
        items.add(new GenericItem("Spear", 8, 20));
        items.add(new GenericItem("Axe", 0, 18));
        items.add(new GenericItem("Warhammer", 3, 0));
        items.add(new CheeseItem("Aged Brie", 5, 19));
        items.add(new CheeseItem("Aged Brie", 5,50));
        items.add(new LegendaryItem("Sulfuras",99,999));
        items.add(new EventItem("BackstagePass", 20,10));
        items.add(new EventItem("BackstagePass", 10,15));
        items.add(new EventItem("BackstagePass", 5,17));
        items.add(new EventItem("BackstagePass", 0,20));
        items.add(new ConjuredItem("ConjuredItem", 10,20));
        items.add(new ConjuredItem("ConjuredItem",0,20));


    }

    @Override
    public List<Item> getInventory()
    {
        return items;
    }

    @Override
    public void saveInventory(List<Item> items)
    {
        this.items=items;
    }

    @Override
    public Item findItem(String searchedName, Integer searchedquality)
    {
        List<Item> items = getInventory();
        Item foundItem = null;

        for(Item item : items){

            if((item.getName() == searchedName) && (item.getQuality() == searchedquality)){

                foundItem = item;
            }

        }
        return foundItem;

    }
}
