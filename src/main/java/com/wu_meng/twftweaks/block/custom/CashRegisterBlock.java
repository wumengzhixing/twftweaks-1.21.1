package com.wu_meng.twftweaks.block.custom;

import com.mojang.serialization.MapCodec;
import com.wu_meng.twftweaks.block.ModBlockEntities;
import com.wu_meng.twftweaks.block.entity.CashRegisterBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CashRegisterBlock extends ChestBlock {
    public static final MapCodec<CashRegisterBlock> CODEC = simpleCodec(CashRegisterBlock::new);

    public CashRegisterBlock(Properties properties) {
        super(properties, () -> ModBlockEntities.CASH_REGISTER.get());
    }

    @Override
    public MapCodec<? extends ChestBlock> codec() {
        return CODEC;
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new CashRegisterBlockEntity(pos, state);
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }
}