package com.wu_meng.twftweaks.datagen;

import com.wu_meng.twftweaks.TWFTweaks;
import com.wu_meng.twftweaks.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TWFTweaks.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.CASH_REGISTER_OPENED.get())
                .add(ModBlocks.BEACON_RECEIVER_MODULE.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.CASH_REGISTER_OPENED.get())
                .add(ModBlocks.BEACON_RECEIVER_MODULE.get());

    }
}