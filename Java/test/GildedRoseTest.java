import gildedrose.*;

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

        items.add(new GenericItem("Sword", 5, 25));
        items.add(new GenericItem("Shield", 5, 25));
        items.add(new GenericItem("Spear", 8, 20));
        items.add(new GenericItem("Axe", 0, 18));
        items.add(new GenericItem("Warhammer", 3,0));
        items.add(new CheeseItem("Aged Brie", 5, 19));
        items.add(new CheeseItem("Aged Brie", 5, 50));
        items.add(new LegendaryItem("Sulfuras", 99, 999));
        items.add(new EventItem("Backstage Pass", 20, 10));
        items.add(new EventItem("Backstage Pass", 10, 15));
        items.add(new EventItem("Backstage Pass", 5, 17));
        items.add(new EventItem("Backstage Pass", 0, 20));
        items.add(new ConjuredItem("Conjured Item", 10, 20));
        items.add(new ConjuredItem("Conjured Item", 0, 20));

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

    @Test
    void should_check_quality_no_higher_than_50()
    {
        shop.updateItems();
        assertEquals(50, shop.Inventory.get(6).quality);
    }

    @Test
    void should_check_Sulfuras_doesnt_update()
    {
        shop.updateItems();
        assertEquals(99, shop.Inventory.get(7).sellIn);
        assertEquals(999, shop.Inventory.get(7).quality);
    }

    @Test
    void should_check_pass_quality_goes_up()
    {
        shop.updateItems();
        assertEquals(11, shop.Inventory.get(8).quality);
    }

    @Test
    void should_check_pass_quality_expiration_10_days()
    {
        shop.updateItems();
        assertEquals(17, shop.Inventory.get(9).quality);
    }

    @Test
    void should_check_pass_quality_expiration_5_days()
    {
        shop.updateItems();
        assertEquals(20, shop.Inventory.get(10).quality);
    }

    @Test
    void should_check_pass_quality_expiration_0_days()
    {
        shop.updateItems();
        assertEquals(0, shop.Inventory.get(11).quality);
    }

    @Test
    void should_check_update_Conjured_twice_as_fast()
    {
        shop.updateItems();
        assertEquals(18, shop.Inventory.get(12).quality);
    }

}
