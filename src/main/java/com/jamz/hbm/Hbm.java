package com.jamz.hbm;

import com.jamz.hbm.registry.ModBlocks;
import com.jamz.hbm.registry.ModCreativeTabs;
import com.jamz.hbm.registry.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Hbm.MODID)
public final class Hbm {
    public static final String MODID = "jamz_hbm";

    private static final Logger LOGGER = LogUtils.getLogger();

    public Hbm(FMLJavaModLoadingContext context) {
        IEventBus bus = context.getModEventBus();

        bus.addListener(this::commonSetup);

        ModBlocks.register(bus);
        ModItems.register(bus);
        ModCreativeTabs.register(bus);

        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("JAMZ's HBM has been initialised");

        LOGGER.info("{}: config loaded", MODID);
        LOGGER.info("{}: Common Setup Complete", MODID);
    }
}
