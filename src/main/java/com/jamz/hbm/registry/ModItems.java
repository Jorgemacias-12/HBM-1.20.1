package com.jamz.hbm.registry;

import com.jamz.hbm.Hbm;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Hbm.MODID);

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
