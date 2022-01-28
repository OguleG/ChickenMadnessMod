package net.chickenmadness.item;

import net.chickenmadness.ChickenMadness;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {


    public static final Item emerald_spider_eye = registerItem("emerald_spider_eye", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.2f).build()).group(ItemGroup.MISC)));
    public static final Item lucky_grass = registerItem( "lucky_grass",new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item three_leaf_clover = registerItem("three_leaf_clover",new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item chicken_rapka = registerItem("chicken_rapka", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.2f).build()).group(ItemGroup.MISC)));
    public static final Item golden_chicken_rapka = registerItem("golden_chicken_rapka", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item dolphin_heart = registerItem("dolphin_heart", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item record_cobble = registerItem("record_cobble", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item record_old = registerItem("record_old", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item record_rest = registerItem("record_rest", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item alloy = registerItem("alloy", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item c_rapka = registerItem("c_rapka", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2f).build()).group(ItemGroup.MISC)));
    public static final Item dol_decoction = registerItem("dol_decoction", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item rapka_decoction = registerItem("rapka_decoction", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item decoction_of_luck = registerItem("decoction_of_luck", new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ChickenMadness.MOD_ID, name), item);
    }

    public static void registerModItems(){
        System.out.println("registering mod items for " + ChickenMadness.MOD_ID);
    }

}
