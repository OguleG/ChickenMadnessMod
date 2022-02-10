package net.chickenmadness.item;

import net.chickenmadness.ChickenMadness;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CHICKEN_MADNESS = FabricItemGroupBuilder.build(new Identifier(ChickenMadness.MOD_ID, "chicken_madness"),
            () -> new ItemStack(ModItems.chicken_rapka));
}
