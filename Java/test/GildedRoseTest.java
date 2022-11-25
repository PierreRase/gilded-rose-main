import gildedrose.Inventory.FileItemsRepository;
import gildedrose.Item.*;
import gildedrose.Shop.Shop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest
{
    Shop shop;
    List<Item> inventory;
    @BeforeEach
    public void setUp() throws IOException
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
        inventory = new FileItemsRepository().getInventory();
    }

    @Test
    void should_check_name() throws IOException
    {
        assertEquals("Sword", inventory.get(0).name);
    }

    @Test
    void should_check_SellIn()
    {
        assertEquals(5, inventory.get(0).sellIn);
    }

    @Test
    void should_check_quality()
    {
        assertEquals(25, inventory.get(0).quality);
    }

//    @Test
//    void should_check_update_sellIn()
//    {
//        shop.updateInventory();
//        assertEquals(4, inventory.get(1).sellIn);
//    }
//
//    @Test
//    void should_check_update_quality()
//    {
//        shop.updateInventory();
//        assertEquals(19, inventory.get(2).quality);
//    }
//
//    @Test
//    void should_check_double_quality_loss_after_expiration()
//    {
//        shop.updateInventory();
//        assertEquals(16, inventory.get(3).quality);
//    }
//
//    @Test
//    void should_check_quality_no_negative()
//    {
//        shop.updateInventory();
//        assertEquals(0, inventory.get(4).quality);
//    }
//
//    @Test
//    void should_check_quality_up_for_Brie()
//    {
//        shop.updateInventory();
//        assertEquals(20, inventory.get(5).quality);
//    }
//
//    @Test
//    void should_check_quality_no_higher_than_50()
//    {
//        shop.updateInventory();
//        assertEquals(50, inventory.get(6).quality);
//    }
//
//    @Test
//    void should_check_Sulfuras_doesnt_update()
//    {
//        shop.updateInventory();
//        assertEquals(99, inventory.get(7).sellIn);
//        assertEquals(999, inventory.get(7).quality);
//    }
//
//    @Test
//    void should_check_pass_quality_goes_up()
//    {
//        shop.updateInventory();
//        assertEquals(11, inventory.get(8).quality);
//    }
//
//    @Test
//    void should_check_pass_quality_expiration_10_days()
//    {
//        shop.updateInventory();
//        assertEquals(17, inventory.get(9).quality);
//    }
//
//    @Test
//    void should_check_pass_quality_expiration_5_days()
//    {
//        shop.updateInventory();
//        assertEquals(20, inventory.get(10).quality);
//    }
//
//    @Test
//    void should_check_pass_quality_expiration_0_days()
//    {
//        shop.updateInventory();
//        assertEquals(0, inventory.get(11).quality);
//    }
//
//    @Test
//    void should_check_update_Conjured_twice_as_fast()
//    {
//        shop.updateInventory();
//        assertEquals(18, inventory.get(12).quality);
//    }

}
