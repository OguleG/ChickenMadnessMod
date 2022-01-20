package net.chickenmadness.item;

import net.chickenmadness.ChickenMadness;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ChickenMadness.MOD_ID, name), item);
    }

    public static void registerModItems(){
        System.out.println("registering mod items for " + ChickenMadness.MOD_ID);
    }

}
