package gildedrose.Item;

public abstract class Item
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

    public abstract void update();

    public String getName()
    {
        return name;
    }
    public int getSellIn()
    {
        return sellIn;
    }
    public int getQuality()
    {
        return quality;
    }
}
