package com.wu_meng.twftweaks.block;

import com.wu_meng.twftweaks.TWFTweaks;
import com.wu_meng.twftweaks.block.custom.CashRegisterBlock;
import com.wu_meng.twftweaks.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(TWFTweaks.MODID);

    public static final DeferredBlock<Block> CASH_REGISTER_OPENED =
            registerBlocks("cash_register_opened", () -> new CashRegisterBlock(BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_GRAY)
                            .sound(SoundType.METAL)
                            .strength(3.0F, 6.0F)
                            .lightLevel(state -> 1)
                            .requiresCorrectToolForDrops()
            ));

    public static final DeferredBlock<Block> BEACON_RECEIVER_MODULE  =
            registerBlocks("beacon_receiver_module", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.METAL)
                    .strength(3.0F, 6.0F)
                    .lightLevel(state -> 1)
                    .requiresCorrectToolForDrops()));

    private static <T extends Block> void registerBlockItems(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static  <T extends Block> DeferredBlock<T> registerBlocks(String name, Supplier<T> block) {
        DeferredBlock<T> blocks = BLOCKS.register(name, block);
        registerBlockItems(name, blocks);
        return blocks;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}