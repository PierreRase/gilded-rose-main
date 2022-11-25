package gildedrose.Item;

public class ConjuredItem extends Item
{
    public ConjuredItem(String name, Integer sellIn, Integer quality)
    {
        super(name, sellIn, quality);
    }

    @Override
    public void update()
    {
        this.sellIn -= 1;
        this.quality -= 2;

        if (this.sellIn <= 0)
            this.quality -= 2;

        if (this.quality < 0)
            this.quality = 0;

    }
}
