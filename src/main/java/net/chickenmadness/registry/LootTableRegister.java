package net.chickenmadness.registry;

import net.chickenmadness.ChickenMadness;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;


public class LootTableRegister {
        private static final Identifier GRASS_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/grass");
        private static final Identifier MOD_GRASS_LOOT_TABLE_ID = new Identifier(ChickenMadness.MOD_ID, "blocks/grass");
        private static final Identifier CHICKEN_LOOT_TABLE_ID = new Identifier("minecraft","entities/chicken" );
        private static final Identifier MOD_CHICKEN_LOOT_TABLE_ID = new Identifier(ChickenMadness.MOD_ID,"entities/chicken");
        private static final Identifier DOLPHIN_LOOT_TABLE_ID = new Identifier("minecraft","entities/dolphin");
        private static final Identifier MOD_DOLPHIN_LOOT_TABLE_ID = new Identifier(ChickenMadness.MOD_ID,"entities/dolphin");
        private static final Identifier CAVE_SPIDER_LOOT_TABLE_ID = new Identifier("minecraft","entities/cave_spider");
        private static final Identifier MOD_CAVE_SPIDER__LOOT_TABLE_ID = new Identifier(ChickenMadness.MOD_ID,"entities/cave_spider");

        public static void register() {
                LootTableLoadingCallback.EVENT.register(((resourceManager, lootManager, id, table, setter) -> {
                        if (GRASS_LOOT_TABLE_ID.equals(id)) {
                                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                                        .rolls(ConstantLootNumberProvider.create(1))
                                        .with(LootTableEntry.builder(MOD_GRASS_LOOT_TABLE_ID));
                                table.withPool(poolBuilder.build());
                        }
                }));
                LootTableLoadingCallback.EVENT.register(((resourceManager, lootManager, id, table, setter) -> {
                        if (CHICKEN_LOOT_TABLE_ID.equals(id)) {
                                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                                        .rolls(ConstantLootNumberProvider.create(1))
                                        .with(LootTableEntry.builder(MOD_CHICKEN_LOOT_TABLE_ID));
                                table.withPool(poolBuilder.build());
                        }
                }));
                LootTableLoadingCallback.EVENT.register(((resourceManager, lootManager, id, table, setter) -> {
                        if (DOLPHIN_LOOT_TABLE_ID.equals(id)) {
                                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                                        .rolls(ConstantLootNumberProvider.create(1))
                                        .with(LootTableEntry.builder(MOD_DOLPHIN_LOOT_TABLE_ID));
                                table.withPool(poolBuilder.build());
                        }
                }));
                LootTableLoadingCallback.EVENT.register(((resourceManager, lootManager, id, table, setter) -> {
                        if (CAVE_SPIDER_LOOT_TABLE_ID.equals(id)) {
                                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                                        .rolls(ConstantLootNumberProvider.create(1))
                                        .with(LootTableEntry.builder(MOD_CAVE_SPIDER__LOOT_TABLE_ID));
                                table.withPool(poolBuilder.build());
                        }
                }));
        }
        }
