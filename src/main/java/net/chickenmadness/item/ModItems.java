package net.chickenmadness.item;

import net.chickenmadness.ChickenMadness;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item Emerald_spider_eye = registerItem("emerald_spider_eye", new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ChickenMadness.MOD_ID, name), item);
    }

    public static void registerModItems(){
        System.out.println("registering mod items for " + ChickenMadness.MOD_ID);
    }

}
