package com.learning.item;

import com.learning.Learning;
import com.learning.item.custom.LighterItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item EEVEE = registerItem("eevee",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item LIGHTER = registerItem("lighter",
            new LighterItem(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Learning.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Learning.LOGGER.debug("Registering Mod Items for " + Learning.MOD_ID);
    }
}
