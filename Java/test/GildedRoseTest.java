import gildedrose.Inventory.FileItemsRepository;
import gildedrose.Inventory.InMemoryItemsRepository;
import gildedrose.Inventory.ItemRepository;
import gildedrose.Shop.Shop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest
{
    ItemRepository inventory;
    Shop shop;

    @BeforeEach
    public void setUp()
    {
        inventory = new InMemoryItemsRepository();
        //inventory = new FileItemsRepository();
        shop = new Shop(inventory);
        shop.updateInventory();
    }

    @Test
    void should_check_update_sellIn()
    {
        assertEquals(4, inventory.getInventory().get(1).sellIn);
    }

    @Test
    void should_check_update_quality()
    {

        assertEquals(19, inventory.getInventory().get(2).quality);
    }

    @Test
    void should_check_double_quality_loss_after_expiration()
    {

        assertEquals(16, inventory.getInventory().get(3).quality);
    }

    @Test
    void should_check_quality_no_negative()
    {

        assertEquals(0, inventory.getInventory().get(4).quality);
    }

    @Test
    void should_check_quality_up_for_Brie()
    {

        assertEquals(20, inventory.getInventory().get(5).quality);
    }

    @Test
    void should_check_quality_no_higher_than_50()
    {

        assertEquals(50, inventory.getInventory().get(6).quality);
    }

    @Test
    void should_check_Sulfuras_doesnt_update()
    {

        assertEquals(99, inventory.getInventory().get(7).sellIn);
        assertEquals(999, inventory.getInventory().get(7).quality);
    }

    @Test
    void should_check_pass_quality_goes_up()
    {

        assertEquals(11, inventory.getInventory().get(8).quality);
    }

    @Test
    void should_check_pass_quality_expiration_10_days()
    {

        assertEquals(17, inventory.getInventory().get(9).quality);
    }

    @Test
    void should_check_pass_quality_expiration_5_days()
    {

        assertEquals(20, inventory.getInventory().get(10).quality);
    }

    @Test
    void should_check_pass_quality_expiration_0_days()
    {

        assertEquals(0, inventory.getInventory().get(11).quality);
    }

    @Test
    void should_check_update_Conjured_twice_as_fast()
    {

        assertEquals(18, inventory.getInventory().get(12).quality);
    }

}
