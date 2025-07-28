package com.learning.block;

import com.learning.Learning;
import com.learning.block.custom.HappyBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block HAPPY_BLOCK = registerBlock("happy_block",
            new HappyBlock(FabricBlockSettings.of(Material.AMETHYST).strength(1f)), ItemGroup.DECORATIONS);
    public static final Block E = registerBlock("e",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool(),
                    UniformIntProvider.create(1,32)), ItemGroup.BUILDING_BLOCKS);
    public static final Block B = registerBlock("b",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool(),
                    UniformIntProvider.create(1,32)), ItemGroup.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Learning.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Learning.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings(). group(tab)));
    }

    public static void registerModBlocks() {
        Learning.LOGGER.debug("Registering ModBlocks for " + Learning.MOD_ID);
    }
}
