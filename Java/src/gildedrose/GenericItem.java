package gildedrose;

public class GenericItem extends Item
{

    public GenericItem(String name, Integer sellIn, Integer quality)
    {
        super(name, sellIn, quality);
    }

    @Override
    public void update()
    {
        this.sellIn -= 1;
        this.quality -= 1;

        if (this.sellIn <= 0)
            this.quality += -1;

        if (this.quality < 0)
            this.quality = 0;

    }
}
