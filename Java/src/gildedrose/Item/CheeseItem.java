package gildedrose.Item;

public class CheeseItem extends Item
{
    public CheeseItem(String name, Integer sellIn, Integer quality)
    {
        super(name, sellIn, quality);
    }
    @Override
    public void update()
    {
        this.sellIn -= 1;
        this.quality += 1;
        if (this.quality > 50)
        {
            this.quality = 50;
        }

    }
}
