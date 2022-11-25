package gildedrose.Inventory;

import gildedrose.Item.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FileItemsRepository extends ItemRepository
{
    FileWriter file = null;
    List<Item> items;
    @Override
    public List<Item> getInventory()
    {
        List<Item> items = new ArrayList<Item>();
        Scanner scan = null;
        try
        {
            scan = new Scanner(new File("inventory.csv"));
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        while(scan.hasNextLine())
        {
            String line = scan.nextLine();
            String[] fields = line.split(",");
            String itemName = fields[0];
            int sellIn = Integer.parseInt(fields[1]);
            int quality = Integer.parseInt(fields[2]);
            if(itemName == "Sulfuras")
            {
                items.add(new LegendaryItem(itemName,sellIn, quality));
            }
            else if(itemName == "Aged Brie")
            {
                items.add(new CheeseItem(itemName, sellIn, quality));
            }
            else if(itemName == "Backstage Passes")
            {
                items.add(new EventItem(itemName, sellIn, quality));
            }
            else if(itemName == "Conjured Item")
            {
                items.add(new ConjuredItem(itemName, sellIn, quality));
            }
            else
            {
                items.add(new GenericItem(itemName, sellIn, quality));
            }

        }
        scan.close();
        return items;
    }

    @Override
    public void saveInventory(Item[] item)
    {

    }
}
