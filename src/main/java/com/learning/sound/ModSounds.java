package com.learning.sound;

import com.learning.Learning;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {
    public static final SoundEvent HAPPY_BLOCK_YIPPEE = registerSoundEvent("yippee");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Learning.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void registerSounds() {
        Learning.LOGGER.info("Registering Sounds for " + Learning.MOD_ID);
    }
}
