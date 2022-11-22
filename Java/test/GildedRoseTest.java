import gildedrose.Shop;
import gildedrose.Item;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest
{
    Shop shop;
    @BeforeEach
    public void setUp()
    {

        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("Sword", 5, 25));
        items.add(new Item("Shield", 5, 25));

        shop = new Shop(items);
    }

    @Test
    void should_check_name()
    {
        assertEquals("Sword", shop.Inventory.get(0).name);
    }

    @Test
    void should_check_SellIn()
    {
        assertEquals(5, shop.Inventory.get(0).sellIn);
    }

    @Test
    void should_check_quality()
    {
        assertEquals(25, shop.Inventory.get(0).quality);
    }

    @Test
    void should_check_update_sellIn()
    {
        shop.updateItems();
        assertEquals(4, shop.Inventory.get(1).sellIn);
    }
}
