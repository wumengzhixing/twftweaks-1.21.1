package com.wu_meng.twftweaks.datagen;

import com.wu_meng.twftweaks.TWFTweaks;
import com.wu_meng.twftweaks.block.ModBlocks;
import com.wu_meng.twftweaks.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelsProvider extends ItemModelProvider {
    public ModItemModelsProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TWFTweaks.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        basicItem(ModItems.ASHES_INGOT.get());

        handheldItem(ModItems.HUNTER_KNIFE.get());
        handheldItem(ModItems.FROZEN_TILAPIA.get());
        handheldItem(ModItems.DIAMOND_HUNTER_KNIFE.get());
        handheldItem(ModItems.ASHES_AXE.get());
        handheldItem(ModItems.ASHES_SHOVEL.get());
        handheldItem(ModItems.ASHES_HOE.get());
        handheldItem(ModItems.ASHES_PICKAXE.get());
        handheldItem(ModItems.ASHES_SWORD.get());
        handheldItem(ModItems.SOUL_ASHES_SWORD.get());
        handheldItem(ModItems.EXO_SWORD.get());
        handheldItem(ModItems.FLESH_SWORD.get());
        handheldItem(ModItems.FLESH_PICKAXE.get());
        handheldItem(ModItems.FLESH_AXE.get());
    }
}