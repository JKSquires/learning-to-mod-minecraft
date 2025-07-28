package com.learning.painting;

import com.learning.Learning;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPaintings {
    public static final PaintingVariant BAMBOO = registerPainting("bamboo", new PaintingVariant(16, 32));

    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(Learning.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings() {
        Learning.LOGGER.debug("Registering Paintings for " + Learning.MOD_ID);
    }
}
