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
        if(item.name != "Sulfuras")
        {
            item.sellIn += -1;
            if (item.name == "Aged Brie")
            {
                item.quality += 1;
            }
            else if (item.name == "Backstage Pass")
            {
                item.quality += 1;
                if(item.sellIn <= 10)
                {
                    item.quality += 1;
                }
                if(item.sellIn <= 5)
                {
                    item.quality += 1;
                }
                if(item.sellIn <= 0)
                {
                    item.quality = 0;
                }
            }
            else if (item.name == "Conjured Item")
            {
                item.quality += -2;
                if(item.sellIn <= 0)
                {
                    item.quality += -2;
                }
            }
            else
            {
                item.quality += -1;
                if (item.sellIn <= 0)
                {
                    item.quality += -1;
                }
            }
            if (item.quality < 0)
            {
                item.quality = 0;
            }
            if (item.quality > 50)
            {
                item.quality = 50;
            }
        }
        else
        {
            return;
        }
    }
}
