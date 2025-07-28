package com.learning;

import com.learning.block.ModBlocks;
import com.learning.item.ModItems;
import com.learning.painting.ModPaintings;
import com.learning.sound.ModSounds;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Learning implements ModInitializer {
	public static final String MOD_ID = "learning";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModPaintings.registerPaintings();
		ModSounds.registerSounds();
	}
}
