package com.mosberg;

import com.mosberg.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeyondTheBobber implements ModInitializer {
	public static final String MOD_ID = "beyond-the-bobber";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		LOGGER.info("Beyond the Bobber mod initialized with custom fish item.");
	}
}
