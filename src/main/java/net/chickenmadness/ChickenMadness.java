package net.chickenmadness;

import net.chickenmadness.block.ModBlocks;
import net.chickenmadness.item.ModItems;
import net.chickenmadness.registry.LootTableRegister;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChickenMadness implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("chickenmadness");
	public static final String MOD_ID = "chickenmadness";

	@Override

	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LootTableRegister.register();

		LOGGER.info("Welcome to Chicken Madness!");
		LOGGER.info("Let's kill some chickens!");
	}
}
