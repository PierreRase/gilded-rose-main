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
        if(item.name == "Aged Brie")
        {
            item.quality += 1;
        }
        else
        {
            item.quality += -1;
            if (item.sellIn <= 0)
            {
                item.quality += -1;
            }
            if (item.quality < 0)
            {
                item.quality = 0;
            }
        }
    }
}
