package gildedrose.Item;

public class EventItem extends Item
{
    public EventItem(String name, Integer sellIn, Integer quality)
    {
        super(name, sellIn, quality);
    }
    @Override
    public void update()
    {
        this.sellIn -= 1;
        this.quality += 1;
        if(this.sellIn <= 10)
        {
            this.quality += 1;
        }
        if(this.sellIn <= 5)
        {
            this.quality += 1;
        }
        if (this.quality > 50)
        {
            this.quality = 50;
        }
        if(this.sellIn <= 0)
        {
            this.quality = 0;
        }

    }
}
