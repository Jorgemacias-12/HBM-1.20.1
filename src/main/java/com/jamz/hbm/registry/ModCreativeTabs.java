package com.jamz.hbm.registry;

import com.jamz.hbm.Hbm;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS = DeferredRegister.create(
            Registries.CREATIVE_MODE_TAB,
            Hbm.MODID);

    public static void register(IEventBus bus) {
        CREATIVE_MOD_TABS.register(bus);
    }
}
