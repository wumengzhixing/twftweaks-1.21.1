package com.wu_meng.twftweaks.block.entity;

import com.wu_meng.twftweaks.block.ModBlockEntities;
import com.wu_meng.twftweaks.sound.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CashRegisterBlockEntity extends ChestBlockEntity {
    public CashRegisterBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CASH_REGISTER.get(), pos, state);
    }

    @Override
    public int getContainerSize() {
        return 27;
    }

    public void startOpen(Player player) {
        if (this.level != null && !this.level.isClientSide) {
            this.level.playSound(null, this.worldPosition,
                    ModSounds.CASH_REGISTER_OPEN.get(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
    }
}