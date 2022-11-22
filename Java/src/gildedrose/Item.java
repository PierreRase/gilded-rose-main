package gildedrose;

public class Item
{
    public String name;
    public Integer sellIn;
    public Integer quality;

    public Item(String name, Integer sellIn, Integer quality)
    {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public static void updateItem(Item item)
    {
        item.sellIn += -1;
    }
}
