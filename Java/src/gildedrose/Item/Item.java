package gildedrose.Item;

public abstract class Item
{
    public String name;
    public Integer sellIn;
    public Integer quality;
    public Integer price;

    public Item(String name, Integer sellIn, Integer quality)
    {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.price = quality*10;
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

    public int getPrice(){return price;};
}
