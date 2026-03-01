package com.wu_meng.twftweaks.item;

import com.wu_meng.twftweaks.TWFTweaks;
import com.wu_meng.twftweaks.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TWFTweaks.MODID);

    public static final Supplier<CreativeModeTab> TWFTWEAKS_TAB =
            CREATIVE_MODE_TABS.register("twftweaks_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.ASHES_INGOT.get()))
                    .title(Component.translatable("itemGroup.twftweaks_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.HUNTER_KNIFE);
                        output.accept(ModItems.FROZEN_TILAPIA);
                        output.accept(ModItems.DIAMOND_HUNTER_KNIFE);
                        output.accept(ModItems.ASHES_AXE);
                        output.accept(ModItems.ASHES_SHOVEL);
                        output.accept(ModItems.ASHES_HOE);
                        output.accept(ModItems.ASHES_PICKAXE);
                        output.accept(ModItems.ASHES_SWORD);
                        output.accept(ModItems.SOUL_ASHES_SWORD);
                        output.accept(ModItems.EXO_SWORD);
                        output.accept(ModItems.FLESH_SWORD);
                        output.accept(ModItems.FLESH_PICKAXE);
                        output.accept(ModItems.FLESH_AXE);

                        output.accept(ModBlocks.CASH_REGISTER_OPENED);
                        output.accept(ModBlocks.BEACON_RECEIVER_MODULE);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}