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
        items.add(new Item("Spear", 8, 20));
        items.add(new Item("Axe", 0, 18));
        items.add(new Item("Warhammer", 3,0));
        items.add(new Item("Aged Brie", 5, 19));

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

    @Test
    void should_check_update_quality()
    {
        shop.updateItems();
        assertEquals(19, shop.Inventory.get(2).quality);
    }

    @Test
    void should_check_double_quality_loss_after_expiration()
    {
        shop.updateItems();
        assertEquals(16, shop.Inventory.get(3).quality);
    }

    @Test
    void should_check_quality_no_negative()
    {
        shop.updateItems();
        assertEquals(0, shop.Inventory.get(4).quality);
    }

    @Test
    void should_check_quality_up_for_Brie()
    {
        shop.updateItems();
        assertEquals(20, shop.Inventory.get(5).quality);
    }

}
