package com.wu_meng.twftweaks.block;

import com.wu_meng.twftweaks.block.entity.CashRegisterBlockEntity;
import com.wu_meng.twftweaks.TWFTweaks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, TWFTweaks.MODID);

    public static final Supplier<BlockEntityType<CashRegisterBlockEntity>> CASH_REGISTER =
            BLOCK_ENTITIES.register("cash_register", () ->
                    BlockEntityType.Builder.of(
                            CashRegisterBlockEntity::new,
                            ModBlocks.CASH_REGISTER_OPENED.get()
                    ).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}